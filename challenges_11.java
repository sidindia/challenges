/*

Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4

*/

/**
 * Assuming the linked list class
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class MergeSortedLinkedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode mergedHead, sortedPtr;
       
        
        if(l1 == null)
        {
            return l2;
        }
        if(l2 == null)
        {
            return l1;
        }
        
     
        if(l1.val <= l2.val)
        {
            sortedPtr = new ListNode(l1.val);
            sortedPtr.next = l1.next;
            l1 = l1.next;
        }
        else
        {
            sortedPtr = new ListNode(l2.val);
            sortedPtr.next = l2.next;
            l2 = l2.next;
        }
        
        
        mergedHead = sortedPtr;
        
        while(l1 != null && l2 != null)
        {
            if(l1.val <= l2.val)
            {
                sortedPtr.next = l1;          
                l1 = l1.next;
            }
            else
            {
                sortedPtr.next = l2;
                l2 = l2.next;
            }
            sortedPtr = sortedPtr.next;
        }
        
        if(l1 == null)
        {
            sortedPtr.next = l2;
        }
        if(l2 == null)
        {
            sortedPtr.next = l1;
        }
        
        return mergedHead;
        
    }  

}
