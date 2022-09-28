package com.company.dsa.leetcode;

import org.w3c.dom.NodeList;

import java.util.Arrays;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


public class MergeTwoSortedLists {
    static ListNode head = null;
    static ListNode head2 = null;

    public static void main(String[] args) {

        System.out.println("Node one");
        addAtEnd(1);
        addAtEnd(2);
        addAtEnd(4);
        printNode(head);
        System.out.println("Node two");
        addAtEnd2(1);
        addAtEnd2(3);
        addAtEnd2(4);
        printNode(head2);

        System.out.println("After merger");
        printNode(mergeTwoLists(head, head2));

    }


    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null && list2 == null)
            return null;
        if (list1 == null)
            return list2;
        if(list2 == null){
            return list1;
        }

        ListNode head = list2;
        ListNode temp;
        ListNode pre = list2;

        list2 = list2.next;
        while (list1 != null) {
            if (pre.val <= list1.val) {
                if (list2.val >= list1.val) {
                    pre.next = list1;
                    temp = list1.next;
                    list1.next = list2;
                    list2 = list1;
                    list1 = temp;
                }
                pre = list2;
                if (list2.next == null){
                    list2.next = list1;
                    list1 = null;
                }
                list2 = list2.next;

            } else {
                temp = list1.next;
                list1.next = list2;
                head = list1;
                list1 = temp;
                pre =head;
            }
        }
        return head;
    }




    public static void addAtEnd(int data) {
        ListNode newNode = new ListNode(data);
        ListNode temp = head;
        if (head == null) {
            head = newNode;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static void addAtEnd2(int data) {
        ListNode newNode = new ListNode(data);
        ListNode temp = head2;
        if (head2 == null) {
            head2 = newNode;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static void printNode(ListNode temp) {
        if (temp == null) {
            System.out.println("List is Empty:(");
        }
        while (temp != null) {
            System.out.println(temp.val + " ");
            temp = temp.next;
        }
    }

}