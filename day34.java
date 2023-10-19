/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    static int ans = 0;

    static void helper(TreeNode root, int max){
        if(root==null) return;

        if(root.val>=max) ans++;
        max = Math.max(max,root.val);
        helper(root.left,max);
        helper(root.right,max);
    }
    public int goodNodes(TreeNode root) {
        ans = 0;
        helper(root,root.val);
        return ans;
    }
}
