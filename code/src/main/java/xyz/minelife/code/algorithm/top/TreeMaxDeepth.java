package xyz.minelife.code.algorithm.top;


import xyz.minelife.code.algorithm.bean.TreeNode;
import xyz.minelife.code.util.CollectionUtil;
import xyz.minelife.code.util.StringUtil;

/**
 * Description ：https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 * Created by huqiang on 2019/7/20.
 */
public class TreeMaxDeepth {
    public static void main(String[] args) {
        TreeNode t = makeTree();
        CollectionUtil.printTree(t);
        int maxDeepth = maxDepth(t);
        StringUtil.println(String.valueOf(maxDeepth));
    }

    private static TreeNode makeTree() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node3.right = node5;
        node5.left = node6;
        node5.right = node7;
        return node1;
    }



    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = 1 + maxDepth(root.left);
        int rightDepth = 1 + maxDepth(root.right);
        return leftDepth > rightDepth ? leftDepth : rightDepth;
    }
}
