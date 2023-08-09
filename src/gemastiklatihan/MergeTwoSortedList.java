/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gemastiklatihan;

/**
 *
 * @author candr
 */
public class MergeTwoSortedList {
    
// * Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 

public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode temp_node = new ListNode(0);
    ListNode current = temp_node;
    while (list1 != null && list2 != null){
        if (list1.val<list2.val){
            current.next = list1;
            list1 = list1.next;
        }else{
            current.next = list2;
            list2 = list2.next;
        }
        current = current.next;
    }
    if (list1 != null){
        current.next = list1;
    } else{
        current.next = list2;
    }

    return temp_node.next;
}
}

