package com.lamah.obs;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(int newState) {
        System.out.println("================================");
        System.out.println("ObserverImpl1 state: " + newState);
        System.out.println("================================");
    }
}
