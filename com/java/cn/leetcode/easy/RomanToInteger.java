package cn.leetcode.easy;

import java.util.HashMap;

/**
 * @author kimtian
 */
public class RomanToInteger {
    public static void main(String[] args) {
        romanToInteger("IIIIIIII");
    }
    public static int romanToInteger(String s){
        HashMap hashMap = new HashMap();
        hashMap.put("I",1);
        hashMap.put("V",5);
        hashMap.put("X",10);
        hashMap.put("L",50);
        hashMap.put("C",100);
        hashMap.put("D",500);
        hashMap.put("M",1000);
        char [] c = s.toCharArray();
        for (int i = 0;i<c.length;i++){
            System.out.println(c[i]);
        }
        return 0;


    }
}
