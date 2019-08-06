package aspect;

public aspect HelloWorld {

    pointcut callSayHello(): call(void helloWorld());

    before (): callSayHello() {
        System.out.println("Before a call to sayHello in subtypes of IHelloWorldService...");
    }

}
