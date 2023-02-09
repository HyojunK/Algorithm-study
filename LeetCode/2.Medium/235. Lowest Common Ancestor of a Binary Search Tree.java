/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // p와 q의 값이 root를 기준으로 양쪽으로 퍼져있을 경우 root가 최소 공통 조상이 됨
        if((root.val > p.val && root.val < q.val) || (root.val > q.val && root.val < p.val)) return root;
        // root의 값이 p나 q의 값 중 하나와 같다면 역시 root가 최소 공통 조상이 됨
        if(root.val == p.val || root.val == q.val) return root;
        // p와 q가 root보다 작은 경우 왼쪽 서브트리를 탐색
        if(p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left, p, q);
        // 나머지 경우, p와 q가 root보다 큰 경우 오른쪽 서브트리를 탐색
        return lowestCommonAncestor(root.right, p, q);
    }
}