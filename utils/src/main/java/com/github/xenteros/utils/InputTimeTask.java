package com.github.xenteros.utils;

import java.util.TimerTask;

public class InputTimeTask extends TimerTask {

    private String input;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    @Override
    public void run() {
        if (input == null) {
            throw new InputTimedOutException();
        }
    }
}
