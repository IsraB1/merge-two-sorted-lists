
public class Solution {
    public ListNode mergeTwoList(ListNode l1, ListNode l2) {
        if (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                l1.next = mergeTwoList(l1.next, l2);
                return l1;
            } else {
                l2.next = mergeTwoList(l1, l2.next);
                return l2;
            }
        }
        if (l1 == null)
            return l2;
        return l1;

    }

    public void printList(ListNode head) {
        if (head == null) {
            return;
        }
        System.out.print(head.val + " ");
        printList(head.next);
    }

    public static void main(String[] args) {

        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(8);
        ListNode n3 = new ListNode(10);

        ListNode n4 = new ListNode(7);
        ListNode n5 = new ListNode(9);
        ListNode n6 = new ListNode(10);

        n1.next = n2;
        n2.next = n3;

        n4.next = n5;
        n5.next = n6;

        // merge two list using the method recursive
        Solution s = new Solution();
        ListNode result = s.mergeTwoList(n1, n4);

        s.printList(result);

    }
}
