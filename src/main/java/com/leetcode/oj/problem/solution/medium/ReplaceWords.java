package com.leetcode.oj.problem.solution.medium;

import com.google.common.base.Stopwatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;
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
    public static final Logger logger = LoggerFactory.getLogger(ReplaceWords.class);

    /**
     * The minimum sentence words length below which a parallel handling
     */
    private static final int MIN_SENTENCE_WORDS_GRAN = 1000;

    private static ExecutorService executorService = null;

    /**
     * cpu core numbers.It's parallel thread number.
     */
    private static int cpuCores = 1;

    static {
        cpuCores = Runtime.getRuntime().availableProcessors();
        executorService = Executors.newFixedThreadPool(cpuCores);
    }

    public String replaceWords(List<String> dict, String sentence) {
        return replaceWords(dict, sentence, false);
    }

    /**
     * @param dict
     * @param sentence
     * @param forceSerial is force use serial algorithm
     * @return
     */
    public String replaceWords(List<String> dict, String sentence, boolean forceSerial) {
        Stopwatch stopwatch = Stopwatch.createStarted();
        if (dict == null || dict.isEmpty() || sentence == null || sentence.isEmpty()) return sentence;

        String str;
        String[] words = sentence.split(" ");

        if (!forceSerial && words.length > MIN_SENTENCE_WORDS_GRAN) {
            str = replaceWordsParallel(dict, words);
        }
        str = replaceWordsSerial(dict, words);

        logger.info("dict size: {}, sentence words number: {}, forceSerial? {}, spend: {}ms"
                , dict.size(), words.length, forceSerial, stopwatch.stop().elapsed(TimeUnit.MILLISECONDS));
        return str;
    }

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
     * @param words
     * @return
     */
    public String replaceWordsSerial(List<String> dict, String... words) {
        Collections.sort(dict);

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


    /**
     * 1. parallel sort dict
     * 2. segment by cpu core
     * 3. parallel handling every segment and store result to map
     * 4. return every thread map to result
     *
     * @param dict
     * @param word
     * @return
     */
    public String replaceWordsParallel(List<String> dict, String... word) {

        String[] dicts = dict.toArray(new String[0]);
        Arrays.parallelSort(dicts);

        List<String> words = Arrays.stream(word).collect(Collectors.toList());

        int segments = words.size() / cpuCores + 1;
        logger.info("dict size: {}, words size: {}, cpu cores: {}, segments: {}", dict.size(), words.size(), cpuCores, segments);

        Map<Integer, String> segmentMap = new ConcurrentHashMap<>();

        CountDownLatch countDownLatch = new CountDownLatch(cpuCores);

        for (int i = 0; i < cpuCores; i++) {
            int from = i * segments, to = Math.min(words.size(), segments * (i + 1));
            logger.debug("get sub words from {} to {}", from, to);

            final List<String> subWords = words.subList(from, to);
            logger.info("get sub words from {} to {}, sub: {}", from, to, subWords);

            final int segmentNo = i + 1;
            executorService.submit(() -> {
                segmentMap.put(segmentNo, coreReplaceWords(dicts, subWords));
                countDownLatch.countDown();
                logger.info("segment no: {}, result: {}", segmentNo, subWords);
            });
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            logger.error("{},cause: {}", e.getMessage(), e);
        }
        logger.info("finally segments map: {}", segmentMap);

        StringBuilder sb = new StringBuilder();
        segmentMap.keySet().stream().sorted().forEach(k -> {
            sb.append(segmentMap.get(k)).append(" ");
        });

        sb.deleteCharAt(sb.length() - 1);

        logger.info("finally return string: {}", sb.toString());

        return sb.toString();
    }

    private String coreReplaceWords(String[] dict, List<String> words) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            for (int i = 0; i < dict.length; i++) {
                if (word.startsWith(dict[i])) {
                    sb.append(dict[i]);
                    break;
                }
                if (i == dict.length - 1) {
                    sb.append(word);
                }
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
