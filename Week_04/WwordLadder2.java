package com.famous.algorithm.week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * @author zhengdalong
 * @version V1.0
 * @date 2021/2/28 11:11 PM
 */
public class WwordLadder2 {

  Map<String, Set<String>> pre = new HashMap<>();
  List<List<String>> res = new ArrayList<>();
  List<String> temp = new ArrayList<>();

  public void dfs(String endWord, String beginWord) {
    if (endWord.equals(beginWord)) {
      Collections.reverse(temp);
      res.add(new ArrayList<>(temp));
      Collections.reverse(temp);
      return;
    }
    Set<String> set = pre.get(endWord);
    for (String s : set) {
      temp.add(s);
      dfs(s, beginWord);
      temp.remove(temp.size() - 1);
    }
  }

  public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
    Set<String> set = new HashSet<>(wordList);
    if (set.isEmpty() || !set.contains(endWord)) {
      return new ArrayList<>();
    }
    Queue<String> q = new LinkedList<>();
    Set<String> visited = new HashSet<>();
    q.offer(beginWord);
    visited.add(beginWord);
    set.add(beginWord);
    boolean finish = false;
    while (!q.isEmpty()) {
      int size = q.size();
      Set<String> s = new HashSet<>();
      for (int i = 0; i < size; i++) {
        String front = q.poll();
        char[] array = front.toCharArray();
        for (int j = 0; j < array.length; j++) {
          char temp = array[j];
          for (char k = 'a'; k <= 'z'; k++) {
            array[j] = k;
            String word = String.valueOf(array);
            if (word.equals(endWord)) {
              finish = true;
            }
            if (!visited.contains(word) && set.contains(word)) {
              if (pre.containsKey(word)) {
                Set<String> se = pre.get(word);
                se.add(front);
                pre.put(word, se);
              } else {
                Set<String> se = new HashSet<>();
                se.add(front);
                pre.put(word, se);
              }
              s.add(word);
              q.add(word);
            }
            array[j] = temp;
          }
        }
      }
      visited.addAll(s);
      if (finish == true) {
        break;
      }
    }
    if (pre.isEmpty()) {
      return new ArrayList<>();
    }
    temp.add(endWord);
    dfs(endWord, beginWord);
    return res;
  }
}
