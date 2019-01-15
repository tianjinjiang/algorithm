package cn.kimtian.tree;

/**
 * 测试链式存储的二叉树
 *
 * @author kimtian
 */
public class TestBinaryTree {
    public static void main(String[] args) {
        //创建一棵树
        BinaryTree binaryTree = new BinaryTree();
        System.out.println("是否为空树：" + binaryTree.isNullTree());
        //创建一个根结点
        TreeNode root = new TreeNode(1);
        //将根结点赋给树
        binaryTree.setRoot(root);

        //创建一个子左结点
        TreeNode leftTwo = new TreeNode(2);
        //创建一个子右结点
        TreeNode rightTwo = new TreeNode(3);
        //给根的左结点赋值
        root.setLeftNode(leftTwo);
        //给根的右结点赋值
        root.setRightNode(rightTwo);
        //第三层结点
        TreeNode llThree = new TreeNode(7);
        TreeNode lrThree = new TreeNode(6);
        TreeNode rlThree = new TreeNode(5);
        TreeNode rrThree = new TreeNode(4);
        TreeNode lllThree = new TreeNode(8);
        leftTwo.setLeftNode(llThree);
        leftTwo.setRightNode(lrThree);
        rightTwo.setLeftNode(rlThree);
        rightTwo.setRightNode(rrThree);
        llThree.setLeftNode(lllThree);
        binaryTree.levelShow(root);
        System.out.println();
        //先序遍历
        binaryTree.frontShow();
        System.out.println();
        //中序遍历
        binaryTree.middleShow();
        System.out.println();
        //后序遍历
        binaryTree.behindShow();
        System.out.println();
        System.out.println("====================");
        System.out.println("树的深度是：" + binaryTree.treeDepth());
        //先序查找
        TreeNode result = binaryTree.frontSearch(5);
        System.out.println(result);
        System.out.println(result == lrThree);
        TreeNode result1 = binaryTree.frontSearch(10);
        System.out.println(result1);
        System.out.println("是否为空树：" + binaryTree.isNullTree());
        System.out.println();
        System.out.println("====================");
        //中序查找
        TreeNode result2 = binaryTree.middleSearch(5);
        System.out.println(result2);
        System.out.println(result2 == lrThree);
        TreeNode result3 = binaryTree.middleSearch(10);
        System.out.println(result3);
        System.out.println();
        System.out.println("====================");

        //后序查找
        TreeNode result4 = binaryTree.behindSearch(5);
        System.out.println(result4);
        System.out.println(result4 == lrThree);
        TreeNode result5 = binaryTree.behindSearch(10);
        System.out.println(result5);
        //先序遍历
        binaryTree.frontShow();
        System.out.println();
        //删除一个子树
        binaryTree.deleteTreeNode(1);
        //先序遍历
        binaryTree.frontShow();
        System.out.println();
    }
}
