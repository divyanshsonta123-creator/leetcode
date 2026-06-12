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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode();
          ListNode temp=head;
          ListNode tail=dummy;
    
        while(temp!=null){
            if(temp.next==null || temp.val!=temp.next.val){
                tail.next=temp;
                tail=temp;
                temp=temp.next;
            }
            else{
                ListNode j=temp.next;
                while(j!=null && temp.val==j.val){
                    j=j.next;
                }
                temp=j;

               
            }
            
           
        }
        tail.next=temp;
        
         
            return dummy.next;
        
    }
}