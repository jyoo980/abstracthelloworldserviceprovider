package model;

public class EnglishHelloWorldService implements IHelloWorldService {

    private String greetingString = "Hello";
    private String worldString = "World";

    @Override
    public void helloWorld() {
        String localizedHelloWorldString = greetingString + " " + worldString + "!";
        System.out.println(localizedHelloWorldString);
    }
}
