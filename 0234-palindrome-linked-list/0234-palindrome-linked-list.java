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
    public boolean isPalindrome(ListNode head) {
        ArrayList <Integer> ans = new ArrayList<>();
       
        while (head != null){
            ans.add(head.val);
            head=head.next;
        }
        
        int n=ans.size()-1;
        int i = 0;
         if(i==n) return true;
            while(i<=n){
               
        //         if(n == 1 ){
        //     if(ans.get(0)!=ans.get(1)) return false;
        // }
                if(ans.get(i) == ans.get(n)) {
                    n--;
                    i++;
                }
                else break;
            }
            if(i>n) return true;
        
            return false;
        
    }
}