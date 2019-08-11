package test;

import model.*;
import model.exception.UnsupportedLocaleException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserLanguageProviderServiceTest {

    @Test
    void testGetSupportedLocaleThrowsException() {
        // We need to have an instance of UserLanguageProviderService because we set system variables here.
        System.setProperty("user.country", "japan");
        System.setProperty("user.language", "jp");
        UserLanguageProviderService service = new UserLanguageProviderService();
        assertThrows(UnsupportedLocaleException.class, () -> {
            service.getSupportedLocale();
        });
    }

    @Test
    void testGetSupportedLocalesForKoreanHelloWorldService() {
        // We need to have an instance of UserLanguageProviderService because we set system variables here.
        System.setProperty("user.country", "Korea");
        System.setProperty("user.language", "ko");
        UserLanguageProviderService service = new UserLanguageProviderService();
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
        UserLanguageProviderService service = new UserLanguageProviderService();
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
        UserLanguageProviderService service = new UserLanguageProviderService();
        try {
            IHelloWorldService helloWorld = service.getSupportedLocale();
            assertTrue(helloWorld instanceof ChineseHelloWorldService);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            fail();
        }
    }
}
