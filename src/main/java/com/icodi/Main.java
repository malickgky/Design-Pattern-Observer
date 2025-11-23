package com.icodi;

import com.icodi.obs.*;

public class Main {
    public static void main(String[] args) {

        ObservableImpl observable = new ObservableImpl();
        Observer observer1 = new ObserverImpl1();
        Observer observer2 = new ObserverImpl2();

        observable.subscribe(observer1);
        observable.subscribe(observer2);

        observable.subscribe(newState -> {
            System.out.println("-----------------------------------------");
            System.out.println("Résultat ObserverImpl3 = " + newState*Math.cos(newState));
            System.out.println("-----------------------------------------");
        });

        observable.setState(25);
        observable.setState(58);
        observable.setState(60);
        observable.setState(70);

    }
}