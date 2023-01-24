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
    public void reorderList(ListNode head) {
        // 리스트의 길이가 2이하 이면 정렬이 불필요하므로 종료
        if(head == null || head.next == null || head.next.next == null) return;

        // 중앙 값을 구하기 위해
        // 한 칸씩 움직일 포인터와
        // 두 칸씩 움직일 포인터 선언
        ListNode slow = head;
        ListNode fast = head;

        // fast 포인터가 끝에 도착할 때 까지 포인터 이동
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // 절반 이후 부터 역순으로 정렬
        ListNode list2 = reverseList(slow.next);
        // 절반까지의 리스트
        slow.next = null;
        ListNode list1 = head;
        
        while(list1 != null && list2 != null){
            // 번갈아 가며 노드를 삽입
            ListNode temp = list1.next;
            list1.next = list2;
            list1 = list2;
            list2 = temp;
        }
    }

    // 리스트 역순 정렬
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