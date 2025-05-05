package com.exclusive.ds.linkedlist;

public class InsertAtBegin {
    public static void main(String[] args) {
        Node root = new Node(25);
        root.next = new Node(18);
        root.next.next = new Node(101);
        root.next.next.next = new Node(112);

        root = insertAtBegin(root, 10);
        Operations.printIterative(root);
    }

    private static Node insertAtBegin(Node root, int nodeVal) {
        Node beginNode = new Node(nodeVal);
        if (root == null) return beginNode;

        beginNode.next = root;

        return beginNode;
    }

}
