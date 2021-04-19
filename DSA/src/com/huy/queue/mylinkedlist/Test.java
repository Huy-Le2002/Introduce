package com.huy.queue.mylinkedlist;

public class Test {
    public static void main(String[] args) {
        QueueMyLinkedList<Integer> que = new QueueMyLinkedList<>();
        que.enqueue(5);
        que.enqueue(10);
        que.enqueue(15);
        que.enqueue(20);
        que.enqueue(25);
        que.display();
        System.out.println("********************");
        que.dequeue();
        que.dequeue();
        que.display();
        System.out.println("********************");

    }
}
