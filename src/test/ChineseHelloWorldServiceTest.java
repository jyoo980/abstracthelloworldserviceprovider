package test;

import model.ChineseHelloWorldService;
import model.IHelloWorldService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChineseHelloWorldServiceTest {

    private IHelloWorldService chineseService;

    @BeforeEach
    void setUp() {
        chineseService = new ChineseHelloWorldService();
    }

    @Test
    void testChineseServiceGetHelloWorldString() {
        assertEquals("你好, 世界!", chineseService.getHelloWorldString());
    }
}
