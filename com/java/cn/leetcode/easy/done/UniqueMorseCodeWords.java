package cn.leetcode.easy.done;

import java.util.HashSet;
import java.util.Set;

/**
 * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.
 * <p>
 * For convenience, the full table for the 26 letters of the English alphabet is given below:
 * <p>
 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
 * Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cba" can be written as "-.-..--...", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.
 * <p>
 * Return the number of different transformations among all words we have.
 * <p>
 * Example:
 * Input: words = ["gin", "zen", "gig", "msg"]
 * Output: 2
 * Explanation:
 * The transformation of each word is:
 * "gin" -> "--...-."
 * "zen" -> "--...-."
 * "gig" -> "--...--."
 * "msg" -> "--...--."
 * <p>
 * There are 2 different transformations, "--...-." and "--...--.".
 * Note:
 * <p>
 * The length of words will be at most 100.
 * Each words[i] will have length in range [1, 12].
 * words[i] will only consist of lowercase letters.
 *
 * @author kimtian
 * @date 2019.01.17
 * @num 804
 */
public class UniqueMorseCodeWords {
    /**
     * 转码数
     *
     * @param words
     * @return
     */
    public static int uniqueMorseRepresentations(String[] words) {
        //转码数组
        String[] password = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--", "--.."};
        //创建一个set存放处理结果，set中会自动去除重复，最后输出set长度就是最终结果
        Set<String> set = new HashSet();
        //循环去除要转码单词的数组
        for (String word : words) {
            //使用StringBuilder就可以，不需要线程安全，会比使用String拼接效率高
            StringBuilder code = new StringBuilder();
            //由于说明words[i] 均为小写字母，所以不用toLowerCase(),如果没有说明，要转成小写，否则会出现数组越界问题
            for (char c : word.toCharArray()) {
                //使用char字段去减'a',可以获得字母所在数组的位置坐标
                code.append(password[c - 'a']);
            }
            //将StringBuilder转换为String，存放在set集合中
            set.add(code.toString());
        }
        //返回set中转换后密码的个数
        return set.size();
    }

    /**
     * 测试
     *
     * @param args
     */
    public static void main(String[] args) {
        String[] words = new String[]{"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }

}
