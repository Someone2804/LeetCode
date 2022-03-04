package LeetCode.TopInteview.easy.LinkedList;

public class ReverseLinkedList {

    /*
    Given the head of a singly linked list, reverse the list, and return the reversed list.
     */

    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode before = null, after = head;
        while(after.next != null){
            ListNode nextnode = after.next;
            after.next = before;
            before = after;
            after = nextnode;
        }
        after.next = before;
        return after;
    }
}
