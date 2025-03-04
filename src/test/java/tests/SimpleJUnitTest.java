package tests;

import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.$;

public class SimpleJUnitTest {

    int result;

    @BeforeAll
    static void beforeAll() {
        System.out.println("\n### beforeAll()\n");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("###   beforeEach()");
        result = getResult();

    }

    @AfterEach
    void afterEach() {
        System.out.println("###   afterEach()\n");
        result = 0;

    }

    @AfterAll
    static void afterAll() {
        System.out.println("\n### afterAll()\n");
    }

    @Test
    void firstTest() {
        int result = getResult();
        System.out.println("###     firstTest()");
        Assertions.assertTrue(3 > 2);

    }

    @Test
    void secondTest() {
        int result = getResult();
        System.out.println("###     secondTest()");
        Assertions.assertTrue(3 > 2);

    }

    @Test
    void thirdTest() {
        int result = getResult();
        System.out.println("###     thirdTest()");
        Assertions.assertTrue(3 > 2);

    }

    private int getResult() {
        return 3;
    }

}
