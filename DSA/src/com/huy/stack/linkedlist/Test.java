package com.huy.stack.linkedlist;

public class Test {
    public static void main(String[] args) {
        StackLinkedList<Integer> stu = new StackLinkedList<Integer>();
        stu.push(5);
        stu.push(10);
        stu.push(15);
        stu.push(20);
        stu.push(40);
        stu.display();
        System.out.println("**************************");
        stu.pop();
        stu.pop();
        stu.pop();
        stu.display();
        System.out.println("**************************");
        System.out.println(stu.search(14));
    }
}
