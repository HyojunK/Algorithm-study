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
    public ListNode reverseList(ListNode head) {
        // 빈 리스트이거나 다음 노드가 없으면 재귀 호출 종료
        if(head == null || head.next == null){
            return head;
        }

        // 다음 노드 재귀 호출
        ListNode List = reverseList(head.next);

        // 현재 노드의 다음 노드가 가리키는 next 값을 현재 head로 설정
        head.next.next = head;
        // 현재 노드가 가리키는 다음 노드를 null로 설정
        head.next = null;

        // 변경된 List를 return
        return List;
    }
}