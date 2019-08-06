package main;


import model.EnglishHelloWorldService;

public class MainWrapper {

    private static Main mainInstance;

    public static void main(String[] args) {
        // TODO: switch statements controlling which concrete impl. of HelloWorldService is injected
        mainInstance = new Main(new EnglishHelloWorldService());
        mainInstance.sayHello();
    }

}
