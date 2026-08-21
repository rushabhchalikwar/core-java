package com.rushabh.multithreading;

import java.util.*;
import java.util.concurrent.*;

public class WaysToCreateThreads {
  public static void main(String[] args) throws ExecutionException, InterruptedException {

    // Ways to create threads in Java
    waysToCreateThreads();
  }

  private static void waysToCreateThreads() throws InterruptedException, ExecutionException {

    // 1. Extend Thread (avoid — tight coupling)
    class MyThread extends Thread {
      public void run() {
        System.out.println("Thread running");
      }
    }

    // 2. Implement Runnable (preferred for task definition)
    Thread t = new Thread(() -> System.out.println("Runnable"));
    t.start();

    // 3. Implement Callable (returns result, throws checked exception)
    Callable<Integer> task = () -> 42;
    FutureTask<Integer> future = new FutureTask<>(task);
    new Thread(future).start();
    System.out.println(future.get()); // blocks until done

    // 4. ExecutorService (PRODUCTION WAY — always prefer this)
    ExecutorService executor = Executors.newFixedThreadPool(4);
    executor.submit(() -> System.out.println("Executor task"));
    executor.shutdown();
  }

  public int[] sortedSquares(int[] nums) {
    int left = 0;
    int right = nums.length - 1;
    int[] newList = new int[nums.length];
    int count = nums.length - 1;

    while(left < right){
      if(Math.pow(nums[left],2) > Math.pow(nums[right],2)){
        newList[count] = (int) Math.pow(nums[left],2);
        left++;
      }
      else{
        newList[count] = (int) Math.pow(nums[right],2);
        right++;
      }
      count++;
    }
    return newList;
  }

  public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    int[] res = new int[nums1.length];
    Map<Integer, Integer> map = new HashMap<>();
    Deque<Integer> stack = new ArrayDeque<>();

    for (int i = nums2.length - 1; i > 0; i--) {
      while (!stack.isEmpty() && nums2[i] > stack.peek()) {
        stack.pop();
      }

      if (stack.isEmpty()) {
        map.put(nums2[i], i);
      } else {
        stack.push(nums2[i]);
      }
    }
    return res;
  }
}
