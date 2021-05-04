package com.queue;

public class MyLinkedListQueue {
    public Node head;
    public Node tail;
    public int size = 0;
    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }
    public int size() {
        return this.size;
    }
    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            this.tail = this.head = temp;
        } else {
            this.tail.next = temp;
            this.tail = temp;
        }
        size+=1;
    }
    public Node dequeue() {
        if (this.head == null) {
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        size--;
        if (this.head == null) {
            this.tail = null;
        }

        return temp;
    }
    public void display() {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.println(temp.key);
            temp = temp.next;
        }
    }
}
