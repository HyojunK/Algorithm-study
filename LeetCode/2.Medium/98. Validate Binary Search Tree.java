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
    public boolean isValidBST(TreeNode root) {
        return isValid(root, null, null);
    }

    /**
     * @param root  트리의 root 노드
     * @param min   현재 노드가 유효한 노드가 되는 최소값
     * @param max   현재 노드가 유효한 노드가 되는 최대값
     * @return
     */
    public boolean isValid(TreeNode root, Integer min, Integer max){
        // 현재 노드가 null 이면 모든 유효성 체크를 통과해 마지막에 도달한 것이므로 true를 return
        if(root == null) return true;
        // 현재 노드가 유효한 노드가 되는 최소값 이하인 경우 false를 return
        if(min != null && root.val <= min) return false;
        // 현재 노드가 유효한 노드가 되는 최대값 이상인 경우 false를 return
        if(max != null && root.val >= max) return false;

        // 왼쪽, 오른쪽 노드에 대해 탐색
        return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
    }
}