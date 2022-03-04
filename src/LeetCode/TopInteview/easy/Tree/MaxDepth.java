package LeetCode.TopInteview.easy.Tree;

public class MaxDepth {

    /*
    Given the root of a binary tree, return its maximum depth.

    A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
     */

    public int maxDepth(TreeNode root) {
        return maxDepthCalc(root, 0);
    }

    public int maxDepthCalc(TreeNode root, int count){
        if(root == null){
            return count;
        }
        count++;
        int left = maxDepthCalc(root.left, count);
        int right = maxDepthCalc(root.right, count);
        return left < right ? right : left;
    }
}
