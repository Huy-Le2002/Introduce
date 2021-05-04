package com;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArrayUsingStack<E> {
    public E[] reverse(E[] data) {
        Stack<E> stack = new Stack<>();
            for (int i = 0; i < data.length; i++) {
                stack.push(data[i]);
            }
            for (int i = 0; i < data.length; i++) {
                data[i] = stack.pop();
            }
        return data;
    }
    public static void main(String[] args) {

        String[] a = { "huy", "a", "g", "f", "a" };
        System.out.println(Arrays.toString(a));
        System.out.println(a.toString());
//        System.out.println(Arrays.toString(reverse(a)));

    }
}
