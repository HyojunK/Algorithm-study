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
    public int maxDepth(TreeNode root) {
        // root가 null이면 더이상 노드가 없으므로 탐색 종료
        if(root == null) return 0;

        // left노드와 right노드중 최대값에 1씩 더하며 return
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}