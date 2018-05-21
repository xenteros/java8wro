package com.github.xenteros;

import java.util.concurrent.Callable;

class CallableTask implements Callable<String> {


    @Override
    public String call() throws Exception {

        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start < 5000) {

        }

        return "Hello World!";
    }
}
