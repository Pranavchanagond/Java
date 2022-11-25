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
    public int getDecimalValue(ListNode head) {
        ArrayList<Integer> a = new ArrayList<>() ;
        int k=0;
        while(head!=null){
            a.add(head.val);
            head=head.next;
        }
        int n=0,r,j=a.size()-1;
        while( k < a.size()){
            n= (int) (n+ a.get(k) * Math.pow(2,j));
            j--;
            k++;
        }
        int x = (int) (n);
        return x;
    }
}