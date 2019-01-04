package cn.kimtian.array.one;

/**
 * 算法基础
 * @author kimtian
 */
public class One {
    public static void main(String[] args) {
        One obj = new One();
        obj.dispAscii('0');
        obj.dispAscii('9');
        obj.dispAscii('A');
        obj.dispAscii('Z');
        obj.dispAscii('a');
        obj.dispAscii('z');
        obj.testSwitch("你");
        obj.testSwitch("好");

    }

    public void dispAscii(char ch) {
        int iTmp = (int) ch;
        System.out.println(ch + "的Ascii码是" + iTmp);
    }

    public void testSwitch(String i) {
        switch (i) {
            case "你好":
                System.out.println("优秀");
                break;
            case "你":
            case "好":
                System.out.println("良好");
                break;
            case "它":
                System.out.println("及格");
                break;
            case "我":
                System.out.println("你需要再努力努力");
                break;
            default:
                System.out.println("未知等级");
        }
    }
}
