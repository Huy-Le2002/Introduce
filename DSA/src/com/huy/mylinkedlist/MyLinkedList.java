package com.huy.mylinkedlist;

public class MyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public boolean isTempty() {
        return (this.size == 0);
    }
    public void addFirst(E e) {
        if (isTempty()) {
            this.head = this.tail = new Node<>(e);
        } else {
            Node temp;
            temp = this.head;
            this.head.next = temp;
            size++;
        }
    }

    public void addLast(E e) {
        if (isTempty()) {
            this.head = this.tail = new Node<>(e);
        } else {
            Node temp = new Node(e);
            this.tail.next = temp;
            this.tail = temp;
            size++;
        }
    }
    public void add(int index,E e) {
        if (index == 0) {
            addFirst(e);
        } else if (index >= size) {
            addLast(e);
        } else {
            Node holder = head;
            for (int i = 0; i < index;i++) {
                holder = holder.next;
            }
            Node temp = holder.next;
            holder.next = new Node(e);
            temp.next = temp;
            size++;
        }
    }
     public E removeFirst() {
        if (isTempty()) {
            return null;
        } else {
            Node temp = this.head;
            this.head = this.head.next;
            size--;
            if (this.head == null) {
                this.tail = null;
            }
            return (E) temp.element;
        }
     }
    public E removeLast(){
        if(size == 0){
            return null;
        } else if(size == 1) {
            Node temp = head;
            this.tail = this.head = null;
            size = 0;
            return (E) temp.element;
        } else{
            Node holder = head;
            for (int i = 0; i < size - 2; i++){
                holder = holder.next;
            }
            Node temp = this.tail;
            tail = holder;
            tail.next = null;
            size--;
            return (E) temp.element;
        }
    }
    public E remove(int index){
        if(index < 0 || index >= size){
            return null;
        } else if(index == 0){
            return removeFirst();
        } else if(index == size - 1){
            return removeLast();
        } else {
            Node holder = head;
            for (int i = 0; i < index; i++){
                holder = holder.next;
            }
            Node temp = holder.next;
            holder.next = temp.next;
            size--;
            return (E) temp.element;
        }
    }
    public E peek() {
        if (isTempty()) {
            System.out.println("Error");
            return null;
        } else {
            return this.tail.element;
        }
    }
    public int search(E e){
        Node temp = head;
        for(int i = 0; i < size - 1; i++){
            if ((E) temp.element == e){
                return i;
            }
        }
        return -1;
    }
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.element);
            temp = temp.next;
        }
    }

    public boolean isEmpty() {
        return (this.size == 0);
    }
}
