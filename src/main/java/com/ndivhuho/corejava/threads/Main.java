package com.ndivhuho.corejava.threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> futureTask = new FutureTask<>(new Task3());

        Thread task1 = new Task1();
        Thread task2 = new Thread(new Task2());
        Thread task3 = new Thread(futureTask);

        task3.start();
        System.out.println(futureTask.get());

        task1.start();
        task2.start();



    }

    public static void task1() {
        for (int i = 0; i<=3; i++) {
            try {
                Thread.sleep(20);
                System.out.println("Task1: " + i);
            } catch (Exception ignored) {}
        }
    }

    public static void task2() {
        for (int i = 0; i<=3; i++) {
            try {
                Thread.sleep(20);
                System.out.println("Task2: " + i);
            } catch (Exception ignored) {}
        }
    }

    public static void task3() {
        for (int i = 0; i<=3; i++) {
            try {
                Thread.sleep(20);
                System.out.println("Task3: " + i);
            } catch (Exception ignored) {}
        }
    }
}