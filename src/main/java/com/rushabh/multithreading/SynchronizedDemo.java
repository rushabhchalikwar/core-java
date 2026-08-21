package com.rushabh.multithreading;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SynchronizedDemo {
    private int count = 0;

    // Method-level lock (locks on 'this')
    public synchronized void increment() {
        count++;
    }

    // Block-level lock (finer granularity)
    public void decrement() {
        synchronized (this) {
            count--;
        }
    }

    class Solution {
        public int romanToInt(String s) {
            Map<Character, Integer> symbol = new HashMap<Character, Integer>();
            symbol.put('I', 1);
            symbol.put('V', 5);
            symbol.put('X', 10);
            symbol.put('L', 50);
            symbol.put('C', 100);
            symbol.put('D', 500);
            symbol.put('M', 1000);

            Stack<Character> stack = new Stack<>();
            int num = 0;

            for (int i = s.length() - 1; i > 0; i--) {
                if (stack.empty()) {
                    stack.push(s.charAt(i));
                } else if (stack.peek() == s.charAt(i)) {
                    stack.push(s.charAt(i));
                }
                else if(symbol.get(s.charAt(i)) > symbol.get(stack.peek())){
                    while(stack.empty()){
                        num += symbol.get(stack.pop());
                    }
                    stack.push(s.charAt(i));
                }
                else if(symbol.get(s.charAt(i)) < symbol.get(stack.peek())){
                    num -= symbol.get(s.charAt(i));
                }
            }
            return num;
        }
    }

    char lastChar = s.charAt(s.length());
}
