package com.queue;

public class ArrayQueue<E> {
    public int capacity;
    public E[] queueArr;
    public int currentSize = 0;

    public ArrayQueue(Integer queueSize) {
        this.capacity = queueSize;
        queueArr = (E[]) new Object[this.capacity];
    }
    public boolean isQueueFull() {
//        boolean status = false;
//        if (currentSize == this.capacity) {
//            status = true;
//        }
//        return status;
        return currentSize == this.capacity ? true : false;
    }
    public boolean isQueueEmpty() {
//        boolean status = false;
//        if (currentSize == 0) {
//            status = true;
//        }
//        return status;
        return currentSize == 0 ? true : false;
    }
    public void enqueue(E item) {
        if (isQueueFull()) {
            System.out.println("stack over flow");
        } else {
            queueArr[currentSize] = item;
            currentSize++;
            System.out.println("Element " + item + " is pushed to Queue !");
        }
    }
    public E dequeue() {
        if (isQueueEmpty()) {
            System.out.println("stack is empty");
            return null;
        }
            E holder = queueArr[0];
            for (int i = 1; i <= currentSize - 1; i++) {
                queueArr[i - 1] = queueArr[i];
            }
            queueArr[currentSize - 1] = null;
            currentSize--;
            return holder;
        }
    public void display() {
        for (int i = 0; i < currentSize; i++) {
            System.out.print(queueArr[i] + " ");
        }
    }
    }

