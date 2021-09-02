package cl.poc.lists;

import java.util.ArrayDeque;
import java.util.Deque;

public class MainDeQue {


    public static void main(String[] args) {
        Deque<Boolean> deque = new ArrayDeque<>();
        deque.push(new Boolean("false"));
        deque.push(new Boolean("true"));
        deque.push(new Boolean("false"));
        deque.push(true);
        System.out.println(deque.pop() + ":" + deque.peek() + ":" + deque.size());
    }
}
