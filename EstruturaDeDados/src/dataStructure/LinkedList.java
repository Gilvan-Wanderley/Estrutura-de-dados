package dataStructure;

public class LinkedList {
    public class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int length;

    public void getHead() {
        System.out.println("Head: " + head.data);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.data);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public LinkedList(String data) {
        length = 1;
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println("Node: " + temp.data);
            temp = temp.next;
        }
    }

    public void append(String data) {
        Node newNode = new Node(data);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void preprend(String data) {
        Node newNode = new Node(data);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public void remove(int index){
        if (index < 0 || index >= length){
            return;
        } else if (index == 0){
            removeFirst();
        } else if (index == length - 1){
            removeLast();
        } else {
            Node prev = get(index - 1);
            Node temp = prev.next;

            prev.next = temp.next;
            temp.next = null;
            length--;
        }
        length++;

    }

    public void removeLast() {
        if (length == 0)
            return;
        Node pre = head;
        while (pre.next != tail) {
            pre = pre.next;
        }
        pre.next = null;
        tail = pre;
        length--;
    }

    public void removeFirst() {
        if (length == 0)
            return;
        head = head.next;
        length--;
        if (length == 0) {
            tail = null;
            head = null;
        }
    }

    public Node get(int index) {
        if (index < 0 || index >= length)
            return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void set(int index, String data){
        Node temp = get(index);
        if (temp != null){
            temp.data = data;
        }
    }

    public void insert(int index, String data){
        if (index < 0 || index >= length){
            return;
        } else if (index == 0){
            preprend(data);
        } else if (index == length){
            append(data);
        } else {
            Node newNode = new Node(data);
            Node temp = get(index - 1);
            newNode.next = temp.next;
            temp.next = newNode;
        }
        length++;
    }
}
