package leetcode;

import java.util.HashMap;
import java.util.Map;

// 242. Valid Anagram
public class L242 {

    public static void main(String[] args) {
        String s = "aacc";
        String t = "ccac";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> maps = new HashMap<>();
        for (char c : s.toCharArray()) {
            maps.put(c, maps.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> mapt = new HashMap<>();
        for (char c : t.toCharArray()) {
            mapt.put(c, mapt.getOrDefault(c, 0) + 1);
        }

        if (maps.equals(mapt)) {
            return true;
        }
        else {
            return false;
        }
    }

}
