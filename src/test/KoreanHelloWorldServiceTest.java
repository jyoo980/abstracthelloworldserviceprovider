package test;

import model.IHelloWorldService;
import model.KoreanHelloWorldService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KoreanHelloWorldServiceTest {

    private IHelloWorldService koreanService;

    @BeforeEach
    void setUp() {
        koreanService = new KoreanHelloWorldService();
    }

    @Test
    void testKoreanServiceGetHelloString() {
        assertEquals("안녕하세요, 세상!", koreanService.getHelloWorldString());
    }

}
