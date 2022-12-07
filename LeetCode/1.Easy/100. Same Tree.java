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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 두 노드가 모두 null인 경우
        // 현재 값이 같고 다음 노드를 탐색할 필요가 없으므로 true를  return
        if(p == null && q == null) return true;

        // 둘 중 하나의 노드만 null인 경우
        // 현재 노드가 다르므로 false를 return
        if(p == null || q == null) return false;

        // 값이 같지 않은 경우 false
        if(p.val != q.val) return false;

        // 값이 같으면 왼쪽 노드와 오른쪽 노드를 비교
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}