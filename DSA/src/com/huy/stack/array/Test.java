package com.huy.stack.array;

public class Test {
    public static void main(String[] args) {
        StackArray<Integer> st = new StackArray<>();
        st.push(5);
        st.push(10);
        st.push(15);
        st.push(20);
        st.push(25);
        st.display();
        System.out.println("*************************");
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println("*************************");
        st.display();
    }
}
