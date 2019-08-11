package main;

import model.EnglishHelloWorldService;
import model.IHelloWorldService;
import model.UserLanguageProviderService;

import java.util.Scanner;

public class MainWrapper {

    private static Main mainInstance;

    public static void main(String[] args) {
        UserLanguageProviderService userLanguage  = new UserLanguageProviderService();
        try {
            IHelloWorldService concreteHelloWorldService = userLanguage.getSupportedLocale();
            mainInstance = new Main(concreteHelloWorldService);
            mainInstance.sayHello();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
