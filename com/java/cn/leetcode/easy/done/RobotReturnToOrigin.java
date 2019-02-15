package cn.leetcode.easy.done;

/**
 * There is a robot starting at position (0, 0), the origin,
 * on a 2D plane. Given a sequence of its moves,
 * judge if this robot ends up at (0, 0) after it completes its moves.
 * The move sequence is represented by a string, and the character moves[i] represents its ith move.
 * Valid moves are R (right), L (left), U (up), and D (down).
 * If the robot returns to the origin after it finishes all of its moves, return true.
 * Otherwise, return false.
 * Note: The way that the robot is "facing" is irrelevant.
 * "R" will always make the robot move to the right once,
 * "L" will always make it move left, etc. Also,
 * assume that the magnitude of the robot's movement is the same for each move.
 *
 * @author kimtian
 * @date 2019.02.14
 * @num 657
 */
public class RobotReturnToOrigin {
    /**
     * 由于左右上下移动距离都是一样的，
     * 所以我们把左右定义为一组，并设置变量初识值为lr=0，然后向左则+1，向右则-1；
     * 把上下定义为一组，并设置变量初识值为ud，向上则+1，向下则-1。
     * 只有两个变量同时为0。才表示回到了原点。
     *
     * @param moves 移动方式
     * @return 是否回到原点
     */
    public static boolean judgeCircle(String moves) {
        //将字符串转化为char数组
        char[] a = moves.toCharArray();
        //上下坐标初始值
        int ud = 0;
        //左右坐标初始值
        int lr = 0;
        //循环char数组
        for (char aa : a) {
            //如果向上，则上下坐标+1
            if (aa == 'U') {
                ud++;
            }
            //如果向下，则上下坐标-1
            else if (aa == 'D') {
                ud--;
            }
            //如果向左，则左右坐标+1
            else if (aa == 'L') {
                lr++;
            }
            //如果向右，则左右坐标-1
            else if (aa == 'R') {
                lr--;
            }
        }
        //上下和左右坐标都为0，才表示回到了原点，返回true
        if (ud == 0 && lr == 0) {
            return true;
        }
        //否则返回false
        return false;
    }

    /**
     * 测试类
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));

    }
}
