package com.ndivhuho.corejava.threads;

import java.util.concurrent.Callable;

public class Task3 implements Callable<String> {
    @Override
    public String call() throws Exception {
        Main.task3();
        return "Task3: Completed";
    }
}
