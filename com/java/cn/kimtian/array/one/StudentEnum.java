package cn.kimtian.array.one;

/**
 * 学生枚举练习
 *
 * @author kimtian
 */
public class StudentEnum {
    public static void main(String[] args) {
        StudentEnum studentEnum = new StudentEnum();
        studentEnum.calcByEnum(300, 20, 0.8323f);
    }

    private void calcByEnum(int iNum, int iOff, float fPercent) {
        float fMinDiff = 1.0f;
        float fTmp;
        int iRealNum = 300;
        for (int i = iNum - iOff + 1; i < iNum + iOff; i++) {
            fTmp = Math.abs(Math.round(i * fPercent) / (float) i - fPercent);
            if (fTmp < fMinDiff) {
                fMinDiff = fTmp;
                iRealNum = i;
            }
        }
        int iJiuYe = Math.round(iRealNum * fPercent);
        System.out.println("通过枚举已计算出学生总人数是：" + iRealNum);
        System.out.println("已就业学生人数是：" + iJiuYe);
        System.out.println("问题陈述给出的就业率是：" + fPercent * 100 + "%");
        System.out.println("计算结果对应的就业率是：" + (iJiuYe / (float) iRealNum) * 100 + "%");
    }
}
