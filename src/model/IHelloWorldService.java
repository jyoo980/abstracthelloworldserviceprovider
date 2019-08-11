package model;

public interface IHelloWorldService {

    /** Prints out "Hello, world!" in the locale specific to the concrete implementation of
     *  this interface to the console.
     *
     */
    void helloWorld();

    /** Simple getter method for the "Hello, world!" string for the locale specific to the
     *  concrete implementation of this interface.
     *
     * @return the "Hello, world!" with the language of the locale specific to the concrete
     *         implementation of this interface.
     */
    String getHelloWorldString();
}
