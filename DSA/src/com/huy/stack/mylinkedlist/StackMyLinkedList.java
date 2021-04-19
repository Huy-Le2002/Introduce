package com.huy.stack.mylinkedlist;

import com.huy.mylinkedlist.MyLinkedList;
public class StackMyLinkedList<E> {
    public MyLinkedList<E> stack;

    public StackMyLinkedList(){
        stack = new MyLinkedList<>();
    }

    public void push(E e){
        stack.addLast(e);
    }

    public E pop(E e){
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return stack.removeFirst();
    }

    public E peek(){
        return stack.peek();
    }

    public int search(E e){
        return stack.search(e);
    }

    public void display(){
        stack.display();
    }
}
