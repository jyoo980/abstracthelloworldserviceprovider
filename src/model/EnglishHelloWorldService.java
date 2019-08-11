package model;

public class EnglishHelloWorldService implements IHelloWorldService {

    private String greetingString = "Hello";
    private String worldString = "world";

    @Override
    public void helloWorld() {
        String localizedHelloWorldString = getHelloWorldString();
        System.out.println(localizedHelloWorldString);
    }

    @Override
    public String getHelloWorldString() {
        return greetingString + ", " + worldString + "!";
    }
}
