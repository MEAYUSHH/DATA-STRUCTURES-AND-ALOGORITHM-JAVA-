//https://practice.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1#

class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
     Node dummy =new Node(-1);
     Node head = dummy, tail=dummy;
     
     while(head1!=null && head2!=null){
         if(head1.data< head2.data){
             tail.next=head1;
             head1=head1.next;
         }else{
             tail.next=head2;
             head2=head2.next;
         }
         tail=tail.next;
     }
     if(head1!=null) tail.next=head1;
     else tail.next=head2;
     
     return dummy.next;
    }
}
