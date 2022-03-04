package LeetCode.TopInteview.easy.LinkedList;

public class Palindrome {
    /*
    Given the head of a singly linked list, return true if it is a palindrome.
     */
    ListNode fast;
    ListNode slow;
    int size = 0;

    public boolean isPalindrome(ListNode head) {
        if(head.next != null && head.next.next == null){
            return head.val == head.next.val;
        }
        fast = head;
        slow = head;
        findFirstHalf();
        slow = reverseList(head);
        if(size%2 == 0){
            slow = slow.next;
        }
        while(slow != null && fast != null){
            if(slow.val != fast.val){
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    public void findFirstHalf(){
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            size+=2;
        }
        if(fast.next != null){
            size++;
        }
        fast = slow.next;
        slow.next = null;
    }

    private ListNode reverseList(ListNode head){
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
