package cn.leetcode.easy.done;

/**
 * Given an arbitrary ransom note string and another string containing letters from all the magazines,
 * write a function that will return true if the ransom note can be constructed from the magazines ;
 * otherwise, it will return false.
 * Each letter in the magazine string can only be used once in your ransom note.
 *
 * @author kimtian
 * @date 2091.01.28
 * @num 383题
 */
public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        //将赎金字符串按字母拆分，转化成char数组
        char[] ransomNotes = ransomNote.toCharArray();
        //将杂志字符串按字母拆分，转化成char数组
        char[] magazines = magazine.toCharArray();
        //如果赎金字符串为空，则直接返回true
        if (ransomNotes.length == 0 || ransomNote == "") {
            return true;
        }
        //如果杂志字符串为空，则直接返回false
        if (magazines.length == 0 || magazine == "") {
            return false;
        }
        /**
         * 循环赎金字符串的每个字母，查看其在杂志字符串中是否有相同的值，
         * 因为每个字母只能用一次，而且字符串中只包含小写字母。
         * 所以如果查找存在相同的字母，我们将其转化成A，防止二次使用
         */
        for (int i = 0; i < ransomNotes.length; i++) {
            int j = 0;
            while (j < magazines.length) {
                //当一直没有相对应的字母，循环到杂志字符串的最后一个字母还不相同时，直接终止返回false
                if (magazines[j] != ransomNotes[i] && j == magazines.length - 1) {
                    return false;
                }
                //所以如果查找存在相同的字母，我们将其转化成A，防止二次使用
                if (magazines[j] == ransomNotes[i]) {
                    magazines[j] = 'A';
                    //直接更改j值，跳出循环
                    j = magazines.length;
                    break;
                } else {
                    j++;
                }
            }
        }
        return true;
    }

    /**
     * 测试
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));

    }

}
