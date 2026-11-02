package chapter3stacks;

import java.util.Stack;

public class PeekPopDemo {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<Integer>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println("Original Stack: " + s1);
        System.out.println("top element: " + s1.peek());
        System.out.println("Stack after accessing top element: " + s1);
        System.out.println("Removed element: " + s1.pop());
        System.out.println("Stack after Pop Operation: " + s1);
    }
}
