package com.huy.queue.mylinkedlist;

import com.huy.mylinkedlist.MyLinkedList;
public class QueueMyLinkedList<E> {
    private MyLinkedList<E> queue;

    public QueueMyLinkedList(){
        queue = new MyLinkedList<>();
    }

    public void enqueue(E e){
        queue.addLast(e);
    }

    public E dequeue(){
        if(queue.isEmpty()){
            return null;
        }else {
            return queue.removeFirst();
        }
    }

    public void display(){
        queue.display();
    }

}
