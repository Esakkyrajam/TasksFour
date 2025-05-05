package com.task4;

import java.util.Stack;

class StackOperations {
    Stack<Integer> stack = new Stack<>();

    public void pushElement(int element) {
        stack.push(element);
        System.out.println("Pushed: " + element);
    }

    public void popElement() {
        if (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        } else {
            System.out.println("Stack is empty.");
        }
    }

    public void checkEmpty() {
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}

public class StackTest {
    public static void main(String[] args) {
        StackOperations st = new StackOperations();
        st.pushElement(10);
        st.pushElement(20);
        st.popElement();
        st.checkEmpty();
    }
}
