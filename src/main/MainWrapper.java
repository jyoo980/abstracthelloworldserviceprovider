package main;

import model.IHelloWorldService;
import model.UserLanguageProviderStrategy;

public class MainWrapper {

    private static Main mainInstance;

    public static void main(String[] args) {
        UserLanguageProviderStrategy userLanguage  = new UserLanguageProviderStrategy();
        try {
            IHelloWorldService concreteHelloWorldService = userLanguage.getSupportedLocale();
            mainInstance = new Main(concreteHelloWorldService);
            mainInstance.sayHello();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
