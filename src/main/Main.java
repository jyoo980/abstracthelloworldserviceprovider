package main;

import model.IHelloWorldService;

public class Main {

    private IHelloWorldService helloWorldService;

    public Main(IHelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public void sayHello() {
        this.helloWorldService.helloWorld();
    }
}
