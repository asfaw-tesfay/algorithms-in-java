package permutations;

import java.util.Map;
import java.util.HashMap;

class Strings {
  static boolean permutationsV1(String s, String t) {
    if (s == null || s.isBlank() || t == null || t.isBlank())
      return false;

    if (s.length() != t.length())
      return false;

    int sum = 0;
    for (int i = 0; i < s.length(); i++)
      sum += (s.charAt(i) - t.charAt(i));

    if (sum != 0)
      return false;
    return true;
  }

  static boolean permutationsV2(String s, String t) {
    if (s == null || s.isBlank() || t == null || t.isBlank())
      return false;

    if (s.length() != t.length())
      return false;

    Map<Character, Integer> charMap1 = new HashMap<>();
    Map<Character, Integer> charMap2 = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char ch1 = s.charAt(i);
      char ch2 = t.charAt(i);
      charMap1.compute(ch1, (k, v) -> v == null ? 1 : ++v);
      charMap2.compute(ch2, (k, v) -> v == null ? 1 : ++v);
    }

    if (charMap1.equals(charMap2)) return true;
    return false;
  }

  static boolean permutationsV3(String s, String t) {
    if (s == null || s.isBlank() || t == null || t.isBlank())
      return false;

    if (s.length() != t.length())
      return false;

    int[] charSet = new int[128]; //ASCII assumption

    for (int i = 0; i < s.length(); i++) {
      int ch1 = s.charAt(i);
      int ch2 = t.charAt(i);
      charSet[ch1] += 1;
      charSet[ch2] -= 1;
    }

    for (int i = 0; i < charSet.length; i++)
      if (charSet[i] != 0)
        return false;
    return true;
  }
}
