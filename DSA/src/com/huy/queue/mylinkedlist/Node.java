package com.huy.queue.mylinkedlist;

public class Node<E> {
    public E key;
    public com.huy.mylinkedlist.Node next;

    public Node(E key) {
        this.key = key;
        this.next = null;
    }
}
