package com.demoqa.automation.utils;

public class SpecialMetthods {
    public static void waitFor(int millis){
        try {
            Thread.sleep(millis);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
