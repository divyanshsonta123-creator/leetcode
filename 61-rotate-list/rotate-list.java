class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null || k == 0){
            return head;
        }
          int length=1;
       ListNode temp=head;
       while(temp.next!=null){
        temp=temp.next;
        length++;
       }
      
    
       temp.next=head;
       k=k%length;
       ListNode temp2=head;
       for(int i=0;i<length-k-1;i++){
        temp2=temp2.next;
       }
       head=temp2.next;
       temp2.next=null;
       return head;
    }
}