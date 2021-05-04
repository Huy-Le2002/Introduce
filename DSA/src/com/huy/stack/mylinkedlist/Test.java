package com.huy.stack.mylinkedlist;

public class Test {
    public static void main(String[] args) {
        StackMyLinkedList<Integer> st = new StackMyLinkedList<>();
        st.push(5);
        st.push(10);
        st.push(15);
        st.push(20);
        st.push(25);
        st.pop();
        st.display();
        System.out.println("****************************");
        System.out.println(st.search(20));
    }
}
