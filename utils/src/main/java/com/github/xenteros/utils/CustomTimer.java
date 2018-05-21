package com.github.xenteros.utils;

public class CustomTimer extends Thread {

    private int seconds;
    private boolean interrupted = false;

    public CustomTimer(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start < seconds * 1000) {

        }
        if (!interrupted) {
            throw new InputTimedOutException();
        }
    }

    public void cancel() {
        interrupted = true;
    }
}
