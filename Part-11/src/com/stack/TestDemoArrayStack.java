package com.stack;

import com.stack.DemoArrayStack;

public class TestDemoArrayStack {
    public static void main(String[] args) {
        DemoArrayStack<Integer> demoStack = new DemoArrayStack<Integer>();
        demoStack.push(7);
        demoStack.push(4);
        demoStack.push(2);
        demoStack.push(8);
        demoStack.display();
//        System.out.println("Giá trị lấy ra " + demoStack.pop());
//        System.out.println("Giá trị lấy ra " + demoStack.pop());
//        System.out.println("Giá trị lấy ra " + demoStack.pop());
//        System.out.println("Giá trị lấy ra " + demoStack.pop());
//        System.out.println("Giá trị lấy ra " + demoStack.pop());
//        System.out.println("Giá trị đọc ra " + demoStack.peek() );
        int index = demoStack.search(4);
        System.out.println("Giá trị " + demoStack.get(index) + " ở vị trí: " + index);
    }
}
