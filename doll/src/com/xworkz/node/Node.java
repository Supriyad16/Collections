package com.xworkz.node;

public class Node {

    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public static void main(String[] args) {

        Node node1 = new Node(100);
        Node node2 = new Node(200);
        Node node3 = new Node(300);
        Node node4 = new Node(400);
        Node node5 = new Node(500);


        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;


        Node presentNode = node1;
        while (presentNode != null) {
            System.out.print(presentNode.value + "->");
            presentNode = presentNode.next;
        }
    }
}
