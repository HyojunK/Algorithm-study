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
    // 몇 번째로 작은 숫자인지 카운트를 저장할 변수
    int count = 0;
    int answer = 0;
    public int kthSmallest(TreeNode root, int k) {
        inorderTraversal(root, k);

        return answer;
    }

    // 중위 순회
    public void inorderTraversal(TreeNode node, int k){
        // 노드가 없다면 탐색 종료
        if(node == null) return;

        // 왼쪽 노드 탐색
        inorderTraversal(node.left, k);
        // 카운트를 증가시키고 그 값이 k와 같다면 현재 노드의 값을 정답으로 저장하고 탐색 종료
        if(++count == k) {
            answer = node.val;
            return;
        }
        // 오른쪽 노드 탐색
        inorderTraversal(node.right, k);
    }
}