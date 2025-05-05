package com.exclusive.ds.linkedlist;

public class Operations {
    public static void main(String[] args) {
        /// inserting in the middle is costly for array
        /// deletion from the middle is costly for array
        ///with link list, u can insert in the middle/end, delete from the middle/end
        Node root = new Node(25);
        root.next = new Node(18);
        root.next.next = new Node(101);
        root.next.next.next = new Node(112);
//        printIterative(root);
        printRecursive(root);
    }

    static void printRecursive(Node root) {
        if (root == null) return;
        printRecursive(root.next);
        System.out.println(root.data);
    }

    static void printIterative(Node root) {
        while (root != null) {
            System.out.println(root.data);
            root = root.next;
        }
    }

}
