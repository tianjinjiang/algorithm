package cn.leecode.easy;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * If the last word does not exist, return 0.
 * Note: A word is defined as a character sequence consists of non-space characters only.
 *
 * @author kimtian
 */
public class Length_of_last_word {

    public static int lengthOfLastWord(String s) {
        //字符串不为空，且字符串的长度不为0，才去找最后一个单词
        if (s != null && s.length() != 0) {
            //最后一个单词指的是不含空格的单词，所以以空格为分割符拆分成字符串数组
            String a[] = s.split(" ");
            //如果拆分的字符串数组不为空，则返回最后一个字符串的长度
            if (a.length > 0) {
                return a[a.length - 1].length();
            }
            return 0;
        }
        //字符串为空或字符串长度为0，则直接返回长度0
        else {
            return 0;
        }
    }

    /**
     * 测试输入结果，符合预期
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("     a    "));
        System.out.println(lengthOfLastWord(""));
        System.out.println(lengthOfLastWord(null));
        System.out.println(lengthOfLastWord("a   a  a   a   aa  aaa  aaaaa"));
        System.out.println(lengthOfLastWord("oooooooo"));
    }
}
