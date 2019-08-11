package util;

public class Logger {

    private static Logger instance = null;

    /** Lazy instantiation for singleton Logger
     *
     * @return a non-null instance of this class.
     */
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Declaring constructor as private to ensure only one instance at a time exists.
    private Logger() {

    }

    public <T> String info(T loggingType, String msg) {
        System.out.println("INFO :: " + this.getClassName(loggingType) + " ::  " + msg);
        return "INFO :: " + this.getClassName(loggingType) + " :: " + msg;
    }

    public <T> String warn(T loggingType, String msg) {
        System.out.println("WARN :: " + this.getClassName(loggingType) + " ::  " + msg);
        return "WARN :: " + this.getClassName(loggingType) + " :: " + msg;
    }

    public <T> String error(T loggingType, String msg) {
        System.out.println("ERROR :: " + this.getClassName(loggingType) + " ::  " + msg);
        return "ERROR :: " + this.getClassName(loggingType) + " :: " + msg;
    }

    private <T> String getClassName(T loggingType) {
        return ((Object) loggingType).getClass().getSimpleName();
    }

}
