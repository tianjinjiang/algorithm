package function;

import java.util.ArrayList;
import java.util.List;

/**
 * 字符串拼接
 * 这些枚举数组可以抽在公共的类里面
 * @author kimtian
 */
public class CurlAppend {
    /**
     * 购买类型枚举值数组
     */
    public static String[] costType = new String[]{"COSTTYPE_CPC", "COSTTYPE_CPM", ""};
    /**
     * 媒体集合枚举值数组
     */
    public static String[] placementGroupTagId = new String[]{"12", "13", "14", ""};
    /**
     * 拼接curl请求
     * @return 结果集数组
     */
    public static List<String> curl() {
        //返回结果集集合
        List<String> resultList = new ArrayList<>();
        //遍历costType数组的枚举
        for (int i = 0; i < costType.length; i++) {
            StringBuffer stringBuffer = new StringBuffer("http://tsa.oa.com/contract-ad/contract/targeting/target-configs?advertiserId=25610");
            //costType不为空拼接costType
            if (costType[i] != null && !costType[i].equals("")) {
                stringBuffer.append("&costType=" + costType[i]);
            }
            //遍历placementGroupTagId数组的枚举
            for (int j = 0; j < placementGroupTagId.length; j++) {
                //placementGroupTagId不为空拼接placementGroupTagId
                if (placementGroupTagId[j] != null && !placementGroupTagId[j].equals("")) {
                    stringBuffer.append("&placementGroupTagId=" + placementGroupTagId[j]);
                }
                //将拼接好的字符串放到结果集数组中
                resultList.add(stringBuffer.toString());
            }
        }
        return resultList;
    }
    public static void main(String[] args) {
        //创建一个list接收返回的结果
        List<String> ddd = curl();
        System.out.println("一共可以创建请求：" + ddd.size() + "个");
        //循环输出结果
        for (String s : ddd) {
            System.out.println(s);
        }
    }
}
