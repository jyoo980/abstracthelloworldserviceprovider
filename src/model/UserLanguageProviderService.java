package model;

import model.exception.UnsupportedLocaleException;

import java.util.Locale;

public class UserLanguageProviderService {

    private Locale userLocale;

    public UserLanguageProviderService() {
        String userLanguage = System.getProperty("user.language");
        String userCountry = System.getProperty("user.country");
        this.userLocale = new Locale(userLanguage, userCountry);
    }

    public IHelloWorldService getSupportedLocale() throws UnsupportedLocaleException {
        String language = this.userLocale.getLanguage();
        switch (language) {
            case "en":
                return new EnglishHelloWorldService();
            case "zh":
                return new ChineseHelloWorldService();
            default:
                throw new UnsupportedLocaleException(language);
        }
    }

}
