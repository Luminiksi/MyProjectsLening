package test;


import main.try_2.conditions.Lesson_2_5;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Проверка работы типографии")
public class ConditionsTest {
    private final static String TRUE = "Печать разрешена";
    private final static String FALSE = "Печать запрещена";

    @ParameterizedTest
    @DisplayName("Первый тест 2 5 1")
    @CsvSource({ "530", "2000", "false", "90" })
    void firstTest_2_5_1() {
        String actual = Lesson_2_5.checkTask1(530, 2000, false, 90);
        assertEquals(actual, TRUE);
    }

    @ParameterizedTest
    @DisplayName("Второй тест 2 5 1")
    @CsvSource({ "530", "2001", "false", "90" })
    void secondTest_2_5_1() {
        String actual = Lesson_2_5.checkTask1(530, 2001, false, 90);
        assertEquals(actual, FALSE);
    }

    @ParameterizedTest
    @DisplayName("Третий тест 2 5 1")
    @CsvSource({ "730", "2000", "false", "90" })
    void thirdTest_2_5_1() {
        String actual = Lesson_2_5.checkTask1(730, 2000, false, 90);
        assertEquals(actual, FALSE);
    }

    @ParameterizedTest
    @DisplayName("Четвертый тест 2 5 1")
    @CsvSource({ "530", "2000", "true", "200" })
    void fourthTest_2_5_1() {
        String actual = Lesson_2_5.checkTask1(530, 2000, true, 200);
        assertEquals(actual, TRUE);
    }

    @ParameterizedTest
    @DisplayName("Пятый тест 2 5 1")
    @CsvSource({ "530", "2000", "true", "200" })
    void fifthTest_2_5_1() {
        String actual = Lesson_2_5.checkTask1(530, 2000, true, 50);
        assertEquals(actual, TRUE);
    }

    @ParameterizedTest
    @DisplayName("Шестой тест 2 5 1")
    @CsvSource({ "530", "2000", "false", "200" })
    void sixthTest_2_5_1() {
        String actual = Lesson_2_5.checkTask1(530, 2000, false, 200);
        assertEquals(actual, FALSE);
    }

    @ParameterizedTest
    @DisplayName("Седьмой тест 2 5 1")
    @CsvSource({ "530", "2000", "false", "50" })
    void seventhTest_2_5_1() {
        String actual = Lesson_2_5.checkTask1(530, 2000, false, 50);
        assertEquals(actual, FALSE);
    }

    @ParameterizedTest
    @DisplayName("Первый тест 2 5 2")
    @CsvSource({ "530", "2000", "false", "90" })
    void firstTest_2_5_2() {
        String actual = Lesson_2_5.checkTask2(530, 2000, false, 90);
        assertEquals(actual, TRUE);
    }

    @ParameterizedTest
    @DisplayName("Второй тест 2 5 2")
    @CsvSource({ "530", "2001", "false", "90" })
    void secondTest_2_5_2() {
        String actual = Lesson_2_5.checkTask2(530, 2001, false, 90);
        assertEquals(actual, FALSE);
    }

    @ParameterizedTest
    @DisplayName("Третий тест 2 5 2")
    @CsvSource({ "730", "2000", "false", "90" })
    void thirdTest_2_5_2() {
        String actual = Lesson_2_5.checkTask2(730, 2000, false, 90);
        assertEquals(actual, FALSE);
    }

    @ParameterizedTest
    @DisplayName("Четвертый тест 2 5 2")
    @CsvSource({ "530", "2000", "true", "200" })
    void fourthTest_2_5_2() {
        String actual = Lesson_2_5.checkTask2(530, 2000, true, 200);
        assertEquals(actual, TRUE);
    }

    @ParameterizedTest
    @DisplayName("Пятый тест 2 5 2")
    @CsvSource({ "530", "2000", "true", "200" })
    void fifthTest_2_5_2() {
        String actual = Lesson_2_5.checkTask2(530, 2000, true, 50);
        assertEquals(actual, TRUE);
    }

    @ParameterizedTest
    @DisplayName("Шестой тест 2 5 2")
    @CsvSource({ "530", "2000", "false", "200" })
    void sixthTest_2_5_2() {
        String actual = Lesson_2_5.checkTask2(530, 2000, false, 200);
        assertEquals(actual, FALSE);
    }

    @ParameterizedTest
    @DisplayName("Седьмой тест 2 5 2")
    @CsvSource({ "530", "2000", "false", "50" })
    void seventhTest_2_5_2() {
        String actual = Lesson_2_5.checkTask2(530, 2000, false, 50);
        assertEquals(actual, FALSE);
    }
}
