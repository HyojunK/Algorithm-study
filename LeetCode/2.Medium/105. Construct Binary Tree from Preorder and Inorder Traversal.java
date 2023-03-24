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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return makeTree(preorder, inorder, 0, 0, inorder.length - 1);
    }

    /**
    * @param preorder      전위 순회 배열
    * @param inorder       중위 순회 배열
    * @param preIndex      preorder 배열에서 현재 노드의 인덱스
    * @param inStart       현재 탐색중인 inorder 배열의 시작 인덱스
    * @param inEnd         현재 탐색중인 inorder 배열의 종료 인덱스
    * @return              TreeNode
    */
    public TreeNode makeTree(int[] preorder, int[] inorder, int preIndex, int inStart, int inEnd) {
        
        // preorder 배열에서 현재 노드의 인덱스가 배열의 크기를 벗어나거나
        // inorder 배열의 시작 인덱스가 종료 인덱스보다 큰 경우 더 이상 하위 노드가 존재하지 않으므로 null을 return
        if(preIndex > preorder.length || inStart > inEnd) return null;
        
        // 새로운 트리노드 생성
        TreeNode node = new TreeNode(preorder[preIndex]);
        
        // inorder 배열에서 현재 노드의 인덱스 탐색
        // 해당 인덱스를 기준으로 노드를 좌우로 나눔
        int inIndex = 0;
        
        for(int i = inStart; i <= inEnd; i++) {
            if(node.val == inorder[i]) {
                inIndex = i;
                break;
            }
        }
        
        // 현재 노드의 좌우 노드 추가
        // 왼쪽 노드의 인덱스 = preorder 배열에서 현재 노드의 다음 인덱스
        // 왼쪽 노드의 시작 인덱스 = inorder 배열의 시작 인덱스
        // 왼쪽 노드의 종료 인덱스 = inorder 배열에서 현재 노드의 인덱스 - 1
        node.left = makeTree(preorder, inorder, preIndex + 1, inStart, inIndex - 1);
        // 오른쪽 노드의 시작 인덱스 = preorder 배열에서 현재 노드의 인덱스(preIndex) + inorder 배열에서 왼쪽 노드의 수(inIndex - inStart + 1)
        // 오른쪽 노드의 시작 인덱스 = inorder 배열에서 현재 노드의 인덱스 + 1
        // 오른쪽 노드의 종료 인덱스 = inorder 배열의 종료 인덱스
        node.right = makeTree(preorder, inorder, preIndex + inIndex - inStart + 1, inIndex + 1, inEnd);
        
        return node;
    }
}