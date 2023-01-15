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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // 두 트리 중 하나가 null인 경우 비교가 불가능하므로 false를 return
        if(root == null || subRoot == null) return false;

        // 두 트리의 값이 같은 경우
        if(root.val == subRoot.val ){
            // 같은 트리인지 비교, 같은 트리면 true를 return
            if(isSameTree(root, subRoot)) return true;
        }
        // root의 왼쪽과 오른쪽 값을 subRoot와 비교
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean isSameTree(TreeNode tree1, TreeNode tree2) {
        // 두 노드가 모두 null인 경우
        // 현재 값이 같고 다음 노드를 탐색할 필요가 없으므로 true를  return
        if(tree1 == null && tree2 == null) return true;

        // 둘 중 하나의 노드만 null인 경우
        // 현재 노드가 다르므로 false를 return
        if(tree1 == null || tree2 == null) return false;

        // 값이 같지 않은 경우 false
        if(tree1.val != tree2.val) return false;

        // 값이 같으면 왼쪽 노드와 오른쪽 노드를 비교
        return isSameTree(tree1.left, tree2.left) && isSameTree(tree1.right, tree2.right);
    }
}