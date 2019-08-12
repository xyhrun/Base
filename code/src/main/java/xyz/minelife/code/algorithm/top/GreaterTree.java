package xyz.minelife.code.algorithm.top;


import xyz.minelife.code.algorithm.bean.TreeNode;
import xyz.minelife.code.util.CollectionUtil;

/**
 * Description ：https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 * Created by huqiang on 2019/7/20.
 */
public class GreaterTree {


    public static void main(String[] args) {
        TreeNode t = makeTree1();
        CollectionUtil.printTree(t);
        TreeNode result = greaterTree(t);
        CollectionUtil.printTree(result);

    }

    private static TreeNode makeTree1() {

        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(13);

        node1.left = node2;
        node1.right = node3;

        return node1;
    }

    public static int preNum = 0;

    public static TreeNode greaterTree(TreeNode t) {
        // 二叉搜索树   大于左节点< 根节点 < 小于右节点
        // 后序遍历，本次节点加之前遍历节点和  得到累计值
        if (t == null) {
            return null;
        }

        greaterTree(t.right);
        t.val += preNum;
        preNum = t.val;
        greaterTree(t.left);
        return t;
    }
}
