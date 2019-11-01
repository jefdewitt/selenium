package com.playground;

// import java.com.playground.jefs.ObjectPlayground;

public class Main {
    public static void main(String[] args) {

        System.out.println("Main class is wired up!");
        ObjectPlayground obj = new ObjectPlayground();

        UserInput ui = new UserInput();
        ui.getSomeUserInfo();
    }
}
