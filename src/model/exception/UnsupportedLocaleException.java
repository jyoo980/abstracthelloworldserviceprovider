package model.exception;

public class UnsupportedLocaleException extends Exception {

    public UnsupportedLocaleException(String locale) {
        super("The following locale is unsupported: " + locale);
    }
}
