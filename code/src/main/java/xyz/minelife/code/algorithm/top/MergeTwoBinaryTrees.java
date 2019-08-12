package xyz.minelife.code.algorithm.top;


import xyz.minelife.code.algorithm.bean.TreeNode;
import xyz.minelife.code.util.CollectionUtil;
import xyz.minelife.code.util.StringUtil;

/**
 * Description ：https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 * Created by huqiang on 2019/7/20.
 */
public class MergeTwoBinaryTrees {


    public static void main(String[] args) {
        TreeNode t1 = makeTree1();
        TreeNode t2 = makeTree2();
        CollectionUtil.printTree(t1);
        CollectionUtil.printTree(t2);
        TreeNode result = mergeTwoBinaryTrees(t1, t2);
        CollectionUtil.printTree(result);

    }

    private static TreeNode makeTree1() {

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node5 = new TreeNode(5);

        node1.left = node3;
        node1.right = node2;
        node3.left = node5;

        return node1;
    }

    private static TreeNode makeTree2() {

        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(7);

        node1.left = node2;
        node1.right = node3;
        node2.right = node4;
        node3.right = node5;

        return node1;
    }

    public static TreeNode mergeTwoBinaryTrees(TreeNode t1, TreeNode t2) {
        // 新创建一个树
        // if (t1 == null && t2 == null) {
        //     return null;
        // }
        // // 先合并根节点
        // TreeNode root = new TreeNode((t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val));
        // // 再递归合并左右子树
        // root.left = mergeTwoBinaryTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
        // root.right = mergeTwoBinaryTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);
        // return root;

        // 在原来树的基础上合并
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        // 先合并根节点
        t1.val += t2.val;
        // 再递归合并左右子树
        t1.left = mergeTwoBinaryTrees(t1.left, t2.left);
        t1.right = mergeTwoBinaryTrees(t1.right, t2.right);
        return t1;
    }
}
