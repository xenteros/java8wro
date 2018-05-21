package com.github.xenteros;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Test {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableTask callableTask = new CallableTask();
        Future<String> future = Executors.newSingleThreadExecutor()
                .submit(callableTask);
        System.out.println(future.get());

    }

}