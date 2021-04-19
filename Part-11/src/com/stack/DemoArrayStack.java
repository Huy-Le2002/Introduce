package com.stack;

public class DemoArrayStack<E> {
    final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    public E[] elements;

    public E[] getElements() {
        return elements;
    }

    public void setElements(E[] elements) {
        this.elements = elements;
    }

    public DemoArrayStack() {
        this.elements = (E[]) new Object[DEFAULT_CAPACITY];
    }


    public E pop() {
        if(size<=0) {
            System.out.println("Stack is empty");
            return null;
        } else {
            E x = elements[size-1];
            elements[size-1] = null;
            size = size -1;
            return x;
        }
    }
    public E peek() {
        if(size<=0) {
            System.out.println("Stack is empty");
            return null;
        } else {
            E x = elements[size - 1]; 
            return x;
        }
    }

    public void push(E e) {
        if(size >= DEFAULT_CAPACITY) {
            System.out.println("Stack over flow");
        } else {
            elements[size] = e;
            size++;
        }
    }
    public int search(E e) {
        for (int i = 0; i < size;i++) {
            if (elements[i] == e) {
                return i;
            }
        } return -1;
    }
    public E get(int i){
        return elements[i];
    }
    public void display() {
        for (int i = 0; i < size;i++) {
            System.out.println(elements[i]);
        }
    }

}
