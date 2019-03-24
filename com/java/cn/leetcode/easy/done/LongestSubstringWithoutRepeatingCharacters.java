package cn.leetcode.easy.done;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        char[] aaa = s.toCharArray();
        Set aa = new HashSet<>();
        for (char i:aaa){
            aa.add(i);
        }
        return aa.size();
    }
}
