package test;

import org.junit.jupiter.api.Test;
import util.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LoggerTest {

    Logger logger = Logger.getInstance();

    @Test
    void testLogInfo() {
        assertEquals("INFO :: LoggerTest :: testing info log",
                logger.info(this, "testing info log"));
    }

    @Test
    void testLogWarn() {
        assertEquals("WARN :: LoggerTest :: testing warn log",
                logger.warn(this, "testing warn log"));
    }

    @Test
    void testLogError() {
        assertEquals("ERROR :: LoggerTest :: testing error log",
                logger.error(this, "testing error log"));
    }
}

