package model;

import model.IHelloWorldService;

public class KoreanHelloWorldService implements IHelloWorldService {

    private String greetingString = "안녕하세요";
    private String worldString = "세상";

    @Override
    public void helloWorld() {
        String localizedHelloWorldString = greetingString + " " + worldString + "!";
        System.out.println(localizedHelloWorldString);
    }
}
