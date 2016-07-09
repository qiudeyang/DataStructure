package com.datastructure;

/**
 * Created by qiudeyang on 06/07/16.
 */

import java.util.Enumeration;
import java.util.Stack;

public class TestStack {
    private static void printStack(Stack<Integer> stack) {
        if (stack.empty()) {
            System.out.println("堆栈是空的");
        } else {
            System.out.print("堆栈中元素为:");
            Enumeration items = stack.elements();
            while (items.hasMoreElements()) {
                System.out.print(items.nextElement() + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(new Integer(11111));
        printStack(stack);
        stack.push("abs");
        printStack(stack);
        stack.push(new Double(29999.3));
        printStack(stack);
        String s = new String("abs");
        System.out.println("元素abs在堆栈的位置"+stack.search(s));
        System.out.println("元素29999.3在堆栈的位置"+stack.search(29999.3));
        System.out.println("元素" + stack.pop() + "出栈");
        printStack(stack);
        System.out.println("元素"+ stack.pop()+ "出栈");
        printStack(stack);
        System.out.println("元素"+stack.pop()+"出栈");
        printStack(stack);

    }
}
