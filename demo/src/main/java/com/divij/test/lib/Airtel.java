package com.divij.test.lib;

public class Airtel implements Sim {

    @Override
    public void call() {
        System.out.println("Calling via Airtel");
    }

    @Override
    public void internet() {
        System.out.println("Internet via Airtel");
    }
}
