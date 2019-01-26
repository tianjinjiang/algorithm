package cn.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Every email consists of a local name and a domain name, separated by the @ sign.
 *
 * For example, in alice@leetcode.com, alice is the local name, and leetcode.com is the domain name.
 *
 * Besides lowercase letters, these emails may contain '.'s or '+'s.
 *
 * If you add periods ('.') between some characters in the local name part of an email address,
 * mail sent there will be forwarded to the same address without dots in the local name. 
 * For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address. 
 * (Note that this rule does not apply for domain names.)
 *
 * If you add a plus ('+') in the local name, everything after the first plus sign will be ignored.
 * This allows certain emails to be filtered,
 * for example m.y+name@email.com will be forwarded to my@email.com. 
 * (Again, this rule does not apply for domain names.)
 *
 * It is possible to use both of these rules at the same time.
 *
 * Given a list of emails, we send one email to each address in the list.  
 * How many different addresses actually receive mails? 
 *
 * @author kimtian
 */
public class UniqueEmailAddresses {
    /**
     * 邮件地址个数计算
     *
     * @param emails 输入的邮件地址
     * @return 可能发送到的邮件地址个数
     */
    public static int numUniqueEmails(String[] emails) {
        //创建一个set存放处理后的邮件地址，因为set中不会有重复的元素
        Set<String> emailSet = new HashSet<>();
        // 题干备注emails数组的长度为>=100且<=1
        if (emails.length >= 1 && emails.length <= 100) {
            //循环emails数组，拿到每一个email地址
            for (String string : emails) {
                //本地名称为邮件地址@前的部分
                String localName = string.substring(0, string.indexOf("@"));
                //如果有(+)则只取(+)前的邮箱地址
                if (localName.contains("+")) {
                    localName = localName.substring(0, localName.indexOf("+"));
                }
                //如果有(.)则将其去除
                localName = localName.replace(".", "");
                //域名
                String domainName = string.substring(string.indexOf("@"));
                //将本地名称和域名再次拼接
                string = localName + domainName;
                //存放在set中，set会帮忙直接过滤掉重复地址
                emailSet.add(string);
            }
        }
        return emailSet.size();
    }

    /**
     * 测试
     *
     * @param args
     */
    public static void main(String[] args) {
        String[] aa = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(aa));
    }
}
