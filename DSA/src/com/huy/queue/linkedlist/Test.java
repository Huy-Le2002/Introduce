package com.huy.queue.linkedlist;

public class Test {
    public static void main(String[] args) {
        QueueLinkedList<Integer> ql = new QueueLinkedList<>();
        ql.enqueue(5);
        ql.enqueue(10);
        ql.enqueue(15);
        ql.enqueue(20);
        ql.enqueue(25);
        ql.display();
        System.out.println("*****************************");
        System.out.println("After dequeue");
        ql.dequeue();
        ql.dequeue();
        ql.display();
    }
}
