package com.datastructure;

/**
 * Created by qiudeyang on 06/07/16.
 */
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.LinkedList;


public class TestQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
//        try{
//            System.out.println(queue.remove());
//        }catch(NoSuchElementException e){
//            e.printStackTrace();
//        }
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        System.out.println(queue.offer("g"));
        for(String q:queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("poll="+queue.poll());
        for (String q:queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("element="+queue.element());  //返回队列头部的元素
        for (String q:queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("peek="+queue.peek());
        for (String q:queue){
            System.out.println(q);
        }
        System.out.println(queue.isEmpty());
    }
}
