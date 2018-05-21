package com.github.xenteros.utils;

class InputTimedOutException extends RuntimeException {

    public InputTimedOutException() {
        super("Timed out...");
    }
}
