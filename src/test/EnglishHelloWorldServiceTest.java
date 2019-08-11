package test;

import model.EnglishHelloWorldService;
import model.IHelloWorldService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnglishHelloWorldServiceTest {

    private IHelloWorldService englishService;

    @BeforeEach
    void setUp() {
        englishService = new EnglishHelloWorldService();
    }

    @Test
    void testEnglishServiceGetHelloString() {
        assertEquals( "Hello, world!", englishService.getHelloWorldString());
    }
}
