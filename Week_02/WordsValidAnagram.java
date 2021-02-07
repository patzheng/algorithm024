package com.eloancn.back.submitted.algorithm.les2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhengdalong
 * @version V1.0
 * @date 2021/2/3 11:23 AM
 */
public class WordsValidAnagram {

  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> ak = new HashMap<>();
    for (String str : strs) {
      char[] array = str.toCharArray();
      Arrays.sort(array);
      String key = new String(array);
      if (ak.get(key) == null) {
        List<String> ele = new ArrayList<>();
        ele.add(str);
        ak.put(key, ele);
      } else {
        ak.get(key).add(str);
      }
    }
    return new ArrayList<List<String>>(ak.values());
  }
}
