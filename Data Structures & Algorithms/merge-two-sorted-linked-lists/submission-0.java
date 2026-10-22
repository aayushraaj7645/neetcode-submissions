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
        
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode fake= new ListNode();
        ListNode ans = fake;
        while( (l1!= null) && (l2!=null) ){
             
                if((l1 != null) && (l2 != null) && (l1.val<=l2.val)){
                  fake.next = new ListNode(l1.val);
                    l1 = l1.next;
                } else{
                fake.next = new ListNode(l2.val);
                    
                    l2 = l2.next;
                }
                fake = fake.next;
        }

                while(l1!= null){
                    
                 
                    fake.next = new ListNode(l1.val);
                      l1 =l1.next;
                    fake = fake.next;

                }
                while(l2 != null){
                     fake.next = new ListNode(l2.val);
                      l2 =l2.next;
                    fake = fake.next;
                }

                

             return ans.next;
        }
        }
       


