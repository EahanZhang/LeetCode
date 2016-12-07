/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
		ListNode p2 = l2;
		ListNode dListNode = new ListNode(0);
		ListNode d = dListNode;
		int sum = 0;
		while (p1 != null || p2 != null) {
			sum /= 10;
			if (p1 != null) {
				sum += p1.val;
				p1 = p1.next;
			}
			
			if(p2 != null) {
				sum += p2.val;
				p2 = p2.next;
			}
			d.next = new ListNode(sum % 10);
			d = d.next;
		}
		if (sum / 10 == 1) {
			d.next = new ListNode(1);
		}
        return dListNode.next;
    }
}