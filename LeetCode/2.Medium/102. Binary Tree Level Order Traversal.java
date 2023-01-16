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
    public List<List<Integer>> levelOrder(TreeNode root) {
        // 반환할 결과값 리스트
        List<List<Integer>> result = new ArrayList<>();

        // 빈 트리인 경우 탐색할 필요가 없으므로 빈 리스트를 바로 return
        if(root == null) return result;

        // 탐색에 사용할 큐
        Queue<TreeNode> q = new LinkedList<>();

        // root를 큐에 넣고 탐색 시작
        q.offer(root);

        // 큐가 빌 때까지 반복
        while(!q.isEmpty()){
            // 현재 큐의 사이즈만큼 반복 -> 같은 레벨

            // 현재 레벨의 노드들이 담길 리스트
            List<Integer> curLevel = new ArrayList<>();

            // 큐의 사이즈 -> 같은 레벨이 담겨있는 만큼
            int size = q.size();
            for(int i = 0; i < size; i++){
                // 큐에서 값을 꺼냄
                TreeNode curNode = q.poll();
                // 현재 레벨의 리스트에 노드 추가
                curLevel.add(curNode.val);
                // 현재 노드의 좌우 노드를 큐에 추가
                if(curNode.left != null) q.offer(curNode.left);
                if(curNode.right != null) q.offer(curNode.right);
            }

            // 현재 레벨 노드 리스트를 정답 리스트에 추가
            result.add(curLevel);
        }

        // 최종 결과값 반환
        return result;
    }
}