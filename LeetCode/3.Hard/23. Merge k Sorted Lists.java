/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        // 전달받은 리스트가 null인 경우 바로 null return
        if(lists == null) return null;

        // 탐색에 사용할 우선순위 큐 선언
        // 리스트 노드의 값을 기준으로 정렬
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a1,a2)->{
            return a1.val-a2.val;
        });

        // lists 배열에 있는 리스트들을 큐에 삽입
        for(int i = 0; i < lists.length; i++){
            if(lists[i] != null) pq.offer(lists[i]);
        }

        // 반환할 정답 리스트를 생성
        ListNode answer = new ListNode(0);
        // 노드를 추가하기 위한 포인터
        ListNode pointer = answer;
        // 현재 탐색중인 노드
        ListNode curNode = null;

        // 큐가 빌 때 까지 반복
        while(!pq.isEmpty()){
            // 큐에서 값을 꺼냄
            curNode = pq.poll();
            // 정답 리스트에 추가
            pointer.next = curNode;
            // 포인터 이동
            pointer = pointer.next;
            // 현재 탐색중인 노드의 next 값이 존재하는 경우 next 값을 큐에 다시 삽입
            if(curNode.next != null) pq.offer(curNode.next);
        }

        // 정답 리스트 return
        // 임의의 값을 넣어 생성하였으므로 next부터 return
        return answer.next;
    }
}