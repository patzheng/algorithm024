package com.famous.algorithm.week4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author zhengdalong
 * @version V1.0
 * @date 2021/2/28 11:03 PM
 */
public class WordLadder {

  public int ladderLength(String beginWord, String endWord, List<String> wordList) {
    Set<String> set = new HashSet<>(wordList);
    if (!set.contains(endWord)) {
      return 0;
    }
    set.remove(beginWord);
    Deque<String> queue = new ArrayDeque<>();
    Set<String> visited = new HashSet<>();//记录是否访问过
    queue.add(beginWord);
    visited.add(beginWord);
    int res = 0;
    while (!queue.isEmpty()) {
      int size = queue.size();//每进行一轮遍历，说明进入了下一层，res++;
      res++;
      for (int t = 0; t < size; t++) {
        char[] str = queue.poll().toCharArray();//得到这一层的元素
        for (int i = 0; i < str.length; i++) {//尝试修改一个字符 在字典中且没遍历过就添加，是终点就返回res+1
          char temp = str[i];
          for (int j = 0; j < 26; j++) {
            char x = (char) ('a' + j);
            if (x == temp) {
              continue;
            }
            str[i] = x;
            String next = String.valueOf(str);
            if (set.contains(next)) {
              if (next.equals(endWord)) {
                return res + 1;
              }
              if (!visited.contains(next)) {
                visited.add(next);
                queue.add(next);
              }
            }
            str[i] = temp;//还原找下个位置
          }
        }
      }
    }
    return 0;
  }

}
