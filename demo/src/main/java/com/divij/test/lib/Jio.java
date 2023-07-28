package com.divij.test.lib;

public class Jio implements Sim {

    @Override
    public void call() {
        System.out.println("Calling via Jio");
    }

    @Override
    public void internet() {
        System.out.println("Internet via Jio");
    }
}
