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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 최종적으로 반환할 ListNode 선언
        ListNode answer = new ListNode(0);
        answer.next = head;

        // 처음 위치부터 시작할 포인터
        ListNode slow = answer;
        // n만큼 떨어진 위치부터 시작할 포인터
        ListNode fast = answer;

        for(int i = 0; i < n; i++){
            fast = fast.next;
        }

        // n만큼 떨어져서 시작한 포인터가 끝에 도달할 때까지 두 포인터 이동
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        // 두 포인터가 n만큼 떨어져서 움직였으므로
        // fast가 끝에 도달하면 slow는 뒤에서 n만큼 떨어진 자리에 위치하게 됨
        // slow의 next를 next.next로 설정
        slow.next = slow.next.next;

        // answer 첫번째 노드를 0으로 임의 설정하고 다음 노드에 head를 넣었으므로
        // answer.next를 반환
        return answer.next;
    }
}