package com.exclusive.ds.linkedlist;

public class InsertAtPosition { //TODO
    public static void main(String[] args) {
        Node root = new Node(25);
        root.next = new Node(18);
        root.next.next = new Node(101);
        root.next.next.next = new Node(112);

        root = insertAtPosition(root, 0, 10);
        Operations.printIterative(root);
    }

    private static Node insertAtPosition(Node root, int pos, int data) {
        int counter = 1;
        Node ans = root;
        Node prevNode = null;
        Node newNode = new Node(data);

        if (pos == 1) {
            newNode.next = root;
            return newNode;
        }

        while (root != null) {
            if (counter == pos) {
                // insert here
                root = prevNode;
                prevNode.next = root.next;
                root.next = newNode;
            }
            counter++;
            prevNode = root;
            root = root.next;
        }

        return ans;
    }
}
