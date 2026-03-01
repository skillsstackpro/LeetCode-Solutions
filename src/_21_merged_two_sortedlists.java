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
class ListNode {
int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }

public class _21_merged_two_sortedlists {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            int i=0,j=0;
            ListNode head= list1;
            ListNode dummy = new ListNode(-1);
            ListNode current = dummy;

            while (list1 != null && list2 != null) {

                if (list1.val <= list2.val) {
                    current.next = list1;
                    list1 = list1.next;
                }
                else {
                    current.next = list2;
                    list2 = list2.next;
                }
                current = current.next;
            }

            if (list1 != null) {
                current.next = list1;
            } else if (list2 != null) {
                current.next = list2;
            }
            return dummy.next;

        }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        _21_merged_two_sortedlists sol = new _21_merged_two_sortedlists();
        ListNode result = sol.mergeTwoLists(list1, list2);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

