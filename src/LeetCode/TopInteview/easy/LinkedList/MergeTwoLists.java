package LeetCode.TopInteview.easy.LinkedList;

public class MergeTwoLists {

    /*
    You are given the heads of two sorted linked lists list1 and list2.

    Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

    Return the head of the merged linked list.
     */

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newlist = new ListNode(0);
        ListNode head = newlist;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                newlist.next = list1;
                list1 = list1.next;
                newlist = newlist.next;
            }else{
                newlist.next = list2;
                list2 = list2.next;
                newlist = newlist.next;
            }
        }
        if(list1 == null){
            newlist.next = list2;
        }else{
            newlist.next = list1;
        }
        return head.next;
    }
}
