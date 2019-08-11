package test;

import model.*;
import model.exception.UnsupportedLocaleException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserLanguageProviderStrategyTest {

    @Test
    void testGetSupportedLocaleThrowsException() {
        // We need to have an instance of UserLanguageProviderService because we set system variables here.
        System.setProperty("user.country", "japan");
        System.setProperty("user.language", "jp");
        UserLanguageProviderStrategy service = new UserLanguageProviderStrategy();
        assertThrows(UnsupportedLocaleException.class, () -> {
            service.getSupportedLocale();
        });
    }

    @Test
    void testGetSupportedLocalesForKoreanHelloWorldService() {
        // We need to have an instance of UserLanguageProviderService because we set system variables here.
        System.setProperty("user.country", "Korea");
        System.setProperty("user.language", "ko");
        UserLanguageProviderStrategy service = new UserLanguageProviderStrategy();
        try {
            IHelloWorldService helloWorld = service.getSupportedLocale();
            assertTrue(helloWorld instanceof KoreanHelloWorldService);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            fail();
        }
    }

    @Test
    void testGetSupportedLocalesForEnglishHelloWorldService() {
        System.setProperty("user.country", "Canada");
        System.setProperty("user.language", "en");
        UserLanguageProviderStrategy service = new UserLanguageProviderStrategy();
        try {
            IHelloWorldService helloWorld = service.getSupportedLocale();
            assertTrue(helloWorld instanceof EnglishHelloWorldService);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            fail();
        }
    }

    @Test
    void testGetSupportedLocalesForChineseHelloWorldService() {
        // We need to have an instance of UserLanguageProviderService because we set system variables here.
        System.setProperty("user.country", "China");
        System.setProperty("user.language", "zh");
        UserLanguageProviderStrategy service = new UserLanguageProviderStrategy();
        try {
            IHelloWorldService helloWorld = service.getSupportedLocale();
            assertTrue(helloWorld instanceof ChineseHelloWorldService);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            fail();
        }
    }
}
