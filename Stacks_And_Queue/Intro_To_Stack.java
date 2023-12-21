package Stacks_And_Queue;

import java.util.*;

public class Intro_To_Stack {
    private static int MAX_SIZE = 100;
    private static int[] stack = new int[MAX_SIZE];
    private static int top = -1;

    // Push Function
    public void push(int x) {
        if (top == MAX_SIZE - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        // Pushing the element into the stack
        stack[++top] = x;
        System.out.println("Elements pushed into the stack is : " + x);

    }

    // POP Function
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow,cannot popped the element");
            return -1;
        }
        int poppedValue = stack[top--];
        System.out.println(" Element which is popped from the stack currently is : ");
        return poppedValue;
    }

    // Top Fucntion to return the current element on which Top is pointing
    public int Top() {
        return stack[top];
    }

    // Stack Size
    public int size() {
        return top + 1;
    }

    public boolean isFull() {
        return top == 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String args[]) {
        Intro_To_Stack Stack = new Intro_To_Stack();
        Stack.push(10);
        Stack.push(11);
        Stack.push(12);
        Stack.push(13);
        Stack.push(14);
        int Stack_size = Stack.size();
        System.out.println(Stack.pop());
        System.out.println(Stack.pop());
        System.out.println(Stack.Top());
        System.out.println("Is the stack empty? " + Stack.isEmpty());
        System.out.println("Stack size is : " + Stack_size);

    }
}
