package LeetCode.TopInteview.easy.LinkedList;

public class RemoveNth {

    /*
    Given the head of a linked list, remove the nth node from the end of the list and return its head.
     */

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        ListNode node = new ListNode(0);
        ListNode recent = node;
        ListNode todelete = node;
        todelete.next = head;

        for(int i = 1; i <= n+1; i++){
            recent = recent.next;
        }
        while(recent != null){
            todelete = todelete.next;
            recent = recent.next;
        }
        todelete.next = todelete.next.next;
        return node.next;
    }
}
