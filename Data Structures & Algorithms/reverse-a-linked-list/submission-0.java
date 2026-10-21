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

        Stack<Integer> stack = new Stack<>();
        ListNode node = head;
        while(node!= null){
            stack.add(node.val);
            node = node.next;
        }
        ListNode fake = new ListNode();
        ListNode temp = fake;
        while(!stack.isEmpty()){
        ListNode newHead = new ListNode(stack.pop());
        fake.next = newHead;
        fake = fake.next;
            }
        return temp.next;
    }
}
