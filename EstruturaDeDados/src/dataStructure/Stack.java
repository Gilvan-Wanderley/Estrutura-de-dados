package dataStructure;

public class Stack {
    public class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
        }
    }

    private Node top;
    private int height;

    public Stack(String data) {
        top = new Node(data);
        height = 1;
    }

    public int getHeight() {
        return height;
    }

    public void getTop() {
        if (top == null) {
            System.out.println("Empty stack.");
        } else {
            System.out.println("Top: " + top.data);
        }
    }

    public void print() {
        Node temp = top;
        while (temp != null) {
            System.out.println("Node: " + temp.data);
            temp = temp.next;
        }
    }

    public void push(String data) {
        Node newNdoe = new Node(data);
        if (height == 0) {
            top = newNdoe;
        } else {
            newNdoe.next = top;
            top = newNdoe;
        }
        height++;
    }

    public void pop() {
        if (height == 0)
            return;

        Node temp = top;
        top = top.next;
        temp.next= null;
        height--;
    }

}
