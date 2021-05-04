package com.stack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<E> {
    public LinkedList<E> stack;

    public int size() {
        return stack.size();
    }
    public MyGenericStack() {
        stack = new LinkedList<>();
    }
    public void push(E e) {
        stack.addFirst(e);

    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        } return false;
    }
    public void display() {
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }
    }
}
