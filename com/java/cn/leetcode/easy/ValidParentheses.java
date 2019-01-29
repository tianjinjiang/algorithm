package cn.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 中文：
 * 给定一个只包含字符'（'，'）'，'{'，'}'，'['和']'的字符串，确定输入字符串是否有效。
 * 如果输入字符串有效：
 * 必须使用相同类型的括号关闭左括号。
 * 必须以正确的顺序关闭打开括号。
 * 请注意，空字符串也被视为有效。
 * Example 1:
 * Input: "()"
 * Output: true
 * Example 2:
 * Input: "()[]{}"
 * Output: true
 * Example 3:
 * Input: "(]"
 * Output: false
 * Example 4:
 * Input: "([)]"
 * Output: false
 * Example 5:
 * Input: "{[]}"
 * Output: true
 *
 * 英文：
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 *
 * Example 1:
 * Input: "()"
 * Output: true
 * Example 2:
 * Input: "()[]{}"
 * Output: true
 * Example 3:
 * Input: "(]"
 * Output: false
 * Example 4:
 * Input: "([)]"
 * Output: false
 * Example 5:
 * Input: "{[]}"
 * Output: true
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 *
 * @author kimtian
 * @date 2019.01.29
 * @num 20
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Map aaa = new HashMap();
        if (s.length() == 0 || s.equals("")) {
            return true;
        }
        if (s.length() % 2 == 1) {
            return false;
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i+2;j<chars.length;j=j+2){
            }

        }

        return false;
    }
}
