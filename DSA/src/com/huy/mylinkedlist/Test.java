package com.huy.mylinkedlist;

public class Test {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(9);
        myLinkedList.addFirst(7);
        myLinkedList.add(1,4);
//        myLinkedList.remove(3);
        myLinkedList.search(2);
        myLinkedList.display();
    }
}
