package com.huy.stack.linkedlist;

import java.util.LinkedList;

public class StackLinkedList<E> {
    private int size;
    private LinkedList<E> stack;

    public StackLinkedList(){
        stack = new LinkedList<>();
    }

    public boolean isEmpty(){
        return this.size == 0 ? true : false;
    }

    public void push(E e){
        stack.addFirst(e);
        size++;
    }

    public E pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        size--;
        return stack.removeFirst();
    }

    public E peek(E e){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return stack.get(size);
    }

    public int search(E e){
        if (isEmpty()){
            System.out.println("Stack is empty");
        }
        for(int i = 0; i < size; i++){
            if(stack.get(i) == e){
                return i;
            }
        }
        return -1;
    }

    public void display(){
        for(int i = 0; i < size; i++){
            System.out.println(stack.get(i));
        }
    }
}
