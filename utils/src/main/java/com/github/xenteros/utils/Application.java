package com.github.xenteros.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;

class Application {

    public static void main(String[] args) {


        List ints = Arrays.asList(new int[]{1,2,3});

        Scanner sc = new Scanner(System.in);
        Timer timer = new Timer();
        InputTimeTask task = new InputTimeTask();
        timer.schedule(task, 10*1000);
        task.setInput(sc.nextLine());
        timer.cancel();
        System.out.println(task.getInput());


        try {


            CustomTimer customTimer = new CustomTimer(1);
            customTimer.start();
            String input = sc.nextLine();
            customTimer.cancel();
            System.out.println(input);
        } catch (InputTimedOutException e) {
            System.out.println("Timed out");
        }
    }
}
