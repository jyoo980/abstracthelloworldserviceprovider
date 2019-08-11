package model;

public class ChineseHelloWorldService implements IHelloWorldService {

    private String greetingString = "你好";
    private String worldString = "世界";

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
