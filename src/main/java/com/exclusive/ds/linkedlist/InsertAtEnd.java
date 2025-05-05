package com.exclusive.ds.linkedlist;

public class InsertAtEnd {
    public static void main(String[] args) {
        Node root = new Node(25);
        root.next = new Node(18);
        root.next.next = new Node(101);
        root.next.next.next = new Node(112);

        root = insertAtEnd(root, 10);
        Operations.printIterative(root);
    }

    private static Node insertAtEnd(Node root, int nodeVal) {
        Node endNode = new Node(nodeVal);
        Node ans = root;

        while (root.next != null) root = root.next;
        root.next = endNode;

        return ans;
    }

}
