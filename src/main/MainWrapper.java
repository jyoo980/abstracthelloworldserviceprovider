package main;

import model.EnglishHelloWorldService;
import java.util.Scanner;

public class MainWrapper {

    private static Main mainInstance;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select from the following supported locales:");
        // TODO: Switch on enums of SupportedLocales
        mainInstance = new Main(new EnglishHelloWorldService());
        mainInstance.sayHello();
    }

}
