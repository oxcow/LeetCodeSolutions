package com.leetcode.oj.problem.solution.medium;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * URL: <a href="https://leetcode.com/problems/replace-words/description/">Replace Words</a>
 * <p>
 * In English, we have a concept called root, which can be followed by some other words to form another longer word - let's call this word successor. For example, the root an, followed by other, which can form another word another.
 * <p>
 * Now, given a dictionary consisting of many roots and a sentence. You need to replace all the successor in the sentence with the root forming it. If a successor has many roots can form it, replace it with the root with the shortest length.
 * <p>
 * You need to output the sentence after the replacement.
 * <p>
 * Example 1:
 * Input: dict = ["cat", "bat", "rat"]
 * sentence = "the cattle was rattled by the battery"
 * Output: "the cat was rat by the bat"
 * Note:
 * The input will only have lower-case letters.
 * 1 <= dict words number <= 1000
 * 1 <= sentence words number <= 1000
 * 1 <= root length <= 100
 * 1 <= sentence words length <= 1000
 * <p>
 * Created by wli on 2017-10-09.
 */
public class ReplaceWords {
    /**
     * 1. sorted dict. the shortest root is first. if match return (replace it with the root with the shortest length)
     * 2. loop sentence words. if match, return dict and loop next word. if not, go on.
     * 3. if the words mismatch any dict, return this word.
     * <p>
     * Time complexity: O(dict.size * sentence words number).
     * <p>
     * Space complexity: O(n).
     *
     * @param dict
     * @param sentence
     * @return
     */
    public String replaceWords(List<String> dict, String sentence) {
        if (dict == null || dict.isEmpty()) return sentence;
        if (sentence == null || sentence.isEmpty()) return sentence;

        Collections.sort(dict);

        StringBuilder sb = new StringBuilder();
        for (String word : sentence.split(" ")) {
            for (int i = 0; i < dict.size(); i++) {
                if (word.startsWith(dict.get(i))) {
                    sb.append(dict.get(i));
                    break;
                }
                if (i == dict.size() - 1) {
                    sb.append(word);
                }
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }

    static ExecutorService executorService = null;
    static int cpuCores = 1;
    static AtomicInteger atomicInteger = new AtomicInteger();

    static {
        cpuCores = Runtime.getRuntime().availableProcessors();
        executorService = Executors.newFixedThreadPool(cpuCores);
    }


    public String replaceWordsParallel(List<String> dict, String sentence) {
        if (dict == null || dict.isEmpty() || sentence == null || sentence.isEmpty()) return sentence;

        Collections.sort(dict);

        String[] dicts = dict.toArray(new String[0]);
        Arrays.parallelSort(dicts);

        List<String> words = Arrays.stream(sentence.split(" ")).collect(Collectors.toList());

        int segements = words.size() / cpuCores + 1;
        System.out.println("segments: "+segements +"  size: "+words.size());

        Map<Integer, String> resultMap = new ConcurrentHashMap<>();

        CountDownLatch countDownLatch = new CountDownLatch(segements);

        for (int i = 0; i < segements; i++) {
            System.out.println("from: "+i*cpuCores + " to: "+Math.min(words.size(), cpuCores * (i + 1)));
            final List<String> subWords = words.subList(i * cpuCores, Math.min(words.size(), cpuCores * (i + 1)));
            int number = atomicInteger.getAndAdd(1);
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    resultMap.put(number, coreReplaceWords(dict, subWords));
                    countDownLatch.countDown();
                    System.out.println(String.format("%s,%s,%d", Thread.currentThread().getName(),
                              subWords.toString(), number));
                }
            });
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("---> " + resultMap);
        StringBuilder sb = new StringBuilder();
        resultMap.keySet().stream().sorted().forEach(k -> {
            sb.append(resultMap.get(k)).append(" ");
        });
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
        return sb.toString();
    }

    private String coreReplaceWords(List<String> dict, List<String> words) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            for (int i = 0; i < dict.size(); i++) {
                if (word.startsWith(dict.get(i))) {
                    sb.append(dict.get(i));
                    break;
                }
                if (i == dict.size() - 1) {
                    sb.append(word);
                }
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
