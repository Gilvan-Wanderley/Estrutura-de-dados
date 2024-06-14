package dataStructure;

public class Queue {
    public class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
        }
    }

    Node first;
    Node last;
    int length;

    public Queue(String data) {
        Node newNode = new Node(data);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void getFirst() {
        if (first == null) {
            System.out.println("Empty queue.");
        } else {
            System.out.println("First: " + first.data);
        }
    }

    public void getLast() {
        if (first == null) {
            System.out.println("Empty queue.");
        } else {
            System.out.println("Last: " + last.data);
        }
    }

    public int getLength() {
        return length;
    }

    public void print() {
        Node temp = first;
        while (temp != null) {
            System.out.println("Node: " + temp.data);
            temp = temp.next;
        }
    }

    public void enqueue(String data) {
        Node newNode = new Node(data);
        if (length == 0) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public void dequeue() {
        if (length <= 1) {
            first = null;
            last = null;
            length = 0;
        } else {
            first = first.next;
        }
        length--;
    }

}
