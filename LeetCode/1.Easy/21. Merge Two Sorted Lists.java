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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 두 리스트중 하나의 리스트가 null이라면
        // merge할 대상이 없으므로 다른 리스트를 return
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        // 반환할 결과 List
        ListNode result = new ListNode(0);
        ListNode pointer = result;

        // 두 리스트 중 하나의 끝에 도달할 때까지 반복
        while(list1 != null && list2 != null){
            // list1과 list2의 노드중 작은값을 포인터의 next값으로 연결
            if(list1.val < list2.val){
                pointer.next = list1;
                // list1의 노드 이동
                list1 = list1.next;
            } else {
                pointer.next = list2;
                // list1의 노드 이동
                list2 = list2.next;
            }

            // 포인터 이동
            pointer = pointer.next;
        }

        // 두 리스트 중 값이 남아있는 나머지 노드들을 연결
        if(list1 != null) pointer.next = list1;
        else if(list2 != null) pointer.next = list2;

        // 새로 생성한 리스트의 초기값을 제외한 다음 노드를 return
        return result.next;
    }
}