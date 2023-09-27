package com.itheima.d3_collection_list;

import java.util.LinkedList;

public class ListTest3 {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        // 入队
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");
        System.out.println(queue);
        // 出队
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);
        System.out.println("---------------------------------");

        // 2、创建一个栈对象
        LinkedList<String> stack = new LinkedList<>();
        // 压栈
//        stack.addFirst("1");
//        stack.addFirst("2");
//        stack.addFirst("3");
//        stack.addFirst("4");
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        System.out.println(stack);
        // 出栈
//        System.out.println(stack.removeFirst());
//        System.out.println(stack.removeFirst());
//        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
