package com.leetcode.oj.problem.solution.medium;

import com.google.common.base.Stopwatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * URL: <a href="https://leetcode.com/problems/top-k-frequent-words/description/">Top K Frequent Words</a>
 * <p>
 * Given a non-empty list of words, return the k most frequent elements.
 * <p>
 * Your answer should be sorted by frequency from highest to lowest. If two words have the same frequency, then the word with the lower alphabetical order comes first.
 * <p>
 * Example 1:
 * Input: ["i", "love", "leetcode", "i", "love", "coding"], k = 2
 * Output: ["i", "love"]
 * Explanation: "i" and "love" are the two most frequent words.
 * Note that "i" comes before "love" due to a lower alphabetical order.
 * Example 2:
 * Input: ["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"], k = 4
 * Output: ["the", "is", "sunny", "day"]
 * Explanation: "the", "is", "sunny" and "day" are the four most frequent words,
 * with the number of occurrence being 4, 3, 2 and 1 respectively.
 * Note:
 * You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
 * Input words contain only lowercase letters.
 * Follow up:
 * Try to solve it in O(n log k) time and O(n) extra space.
 * <p>
 * Created by wli on 2018-01-30.
 *
 * @see TopKFrequentElements
 */
public class TopKFrequentWords {

    private static final Logger LOGGER = LoggerFactory.getLogger(TopKFrequentWords.class);

    // TODO: 太慢需要优化
    // 最普通的处理方式
    public List<String> topKFrequent(String[] words, int k) {
        Stopwatch stopwatch = Stopwatch.createStarted();
        Map<String, Integer> map = new HashMap<>();

        // 统计每个字符串出现的次数
        for (String word : words) {
            int num = map.getOrDefault(word, 0);
            map.put(word, ++num);
        }

        // 排序出现次数
        Set<Integer> nums = map.values().stream().collect(Collectors.toSet());

        List<String> result = new ArrayList<>();
        nums.stream()
                .distinct() // 去重次数相同的
                .sorted(Comparator.reverseOrder()) // 从出现次数最多的开始
                .limit(k) // 做多获取 top k 个
                .forEach(num -> { // 获取次数最多的字符集合
                    List<String> innerList = new ArrayList<>();
                    for (Map.Entry<String, Integer> entry : map.entrySet()) {
                        if (entry.getValue() == num) {
                            innerList.add(entry.getKey());
                        }
                    }
                    Collections.sort(innerList); // 顺序排列
                    innerList = innerList.size() >= k ? innerList.subList(0, k) : innerList;
                    result.addAll(innerList);
                });
        LOGGER.debug("spend: {} ms", stopwatch.stop().elapsed(TimeUnit.MILLISECONDS));
        return result.subList(0, k);
    }


    public List<String> topKFrequent1(String[] words, int k) {
        Stopwatch stopwatch = Stopwatch.createStarted();
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            int num = map.getOrDefault(word, 0);
            map.put(word, ++num);
        }

        Map<Integer, List<String>> numToMap = new HashMap<>();

        map.forEach((w, n) -> {
            List<String> list = numToMap.getOrDefault(n, new ArrayList<>());
            list.add(w);
            numToMap.put(n, list);
        });

        List<String> result = new ArrayList<>();
        for (Integer n : numToMap.keySet().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList())) {
            List<String> list = numToMap.get(n);
            Collections.sort(list);
            result.addAll(list);
            if (result.size() >= k) {
                break;
            }
        }
        LOGGER.debug("spend1: {} ms", stopwatch.stop().elapsed(TimeUnit.MILLISECONDS));
        return result.subList(0, k);
    }

    // 代码最少，但还是不够快
    public List<String> topKFrequentByStream(String[] words, int k) {
        Stopwatch stopwatch = Stopwatch.createStarted();

        Map<String, Integer> frequents = Stream.of(words)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.reducing(0, e -> 1, Integer::sum)));

        List<String> candidates = new ArrayList(frequents.keySet());

        Collections.sort(candidates, (k1, k2) -> frequents.get(k1).equals(frequents.get(k2)) ?
                k1.compareTo(k2) : frequents.get(k2) - (frequents.get(k1)));


        LOGGER.debug("topKFrequentByStream Spend: {} ms", stopwatch.stop().elapsed(TimeUnit.MILLISECONDS));
        return candidates.subList(0, k);
    }
}
