package com.eloancn.back.submitted.algorithm.les2;

import java.util.Objects;

/**
 * @author zhengdalong
 * @version V1.0
 * @date 2021/2/3 11:23 AM
 */
public class ValidAnagram {

  public boolean isAnagram(String s, String t) {
    if (Objects.isNull(s) && Objects.isNull(t)) {
      return true;
    }

    if (Objects.isNull(s)) {
      return false;
    }

    if (Objects.isNull(t)) {
      return false;
    }

    if (s.length() != t.length()) {
      return false;
    }

    int[] table = new int[26];

    for (int i = 0; i < s.length(); i++) {
      table[s.charAt(i) - 'a']++;
    }

    for (int i = 0; i < t.length(); i++) {
      table[t.charAt(i) - 'a']--;
    }

    for (int i = 0; i < table.length; i++) {
      if (table[i] != 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    ValidAnagram validAnagram = new ValidAnagram();
    boolean result = validAnagram.isAnagram("a", "b");
    assert result == true;
  }
}
