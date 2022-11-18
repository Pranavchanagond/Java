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
    public  ListNode reverseList(ListNode head) {
        ListNode list = null;
        // ArrayList<Integer> ans=new ArrayList<>();
            
        while(head != null){
            ListNode nn = head.next;
            // System.out.println(nn.val);
           head.next=list;
            list=head;
            head=nn;
            // System.out.println(head.val);
             
        }
        
        return list;
    }
}