package test;


import main.try_2.conditions.Lesson_2_5;
import main.try_2.conditions.Lesson_2_6;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Проверка работы типографии")
public class ConditionsTest {
    private final static String TRUE = "Печать разрешена";
    private final static String FALSE = "Печать запрещена";

    @Test
    @DisplayName("Первый тест 2 5 1")
    void firstTest_2_5_1() {
        String actual = Lesson_2_5.checkTask1(530, 2000, false, 90);
        assertEquals(actual, TRUE);
    }

    @Test
    @DisplayName("Второй тест 2 5 1")
    void secondTest_2_5_1() {
        String actual = Lesson_2_5.checkTask1(530, 2001, false, 90);
        assertEquals(actual, FALSE);
    }

    @Test
    @DisplayName("Третий тест 2 5 1")
    void thirdTest_2_5_1() {
        String actual = Lesson_2_5.checkTask1(730, 2000, false, 90);
        assertEquals(actual, FALSE);
    }

    @Test
    @DisplayName("Четвертый тест 2 5 1")
    void fourthTest_2_5_1() {
        String actual = Lesson_2_5.checkTask1(530, 2000, true, 200);
        assertEquals(actual, TRUE);
    }

    @Test
    @DisplayName("Пятый тест 2 5 1")
    void fifthTest_2_5_1() {
        String actual = Lesson_2_5.checkTask1(530, 2000, true, 50);
        assertEquals(actual, TRUE);
    }

    @Test
    @DisplayName("Шестой тест 2 5 1")
    void sixthTest_2_5_1() {
        String actual = Lesson_2_5.checkTask1(530, 2000, false, 200);
        assertEquals(actual, FALSE);
    }

    @Test
    @DisplayName("Седьмой тест 2 5 1")
    void seventhTest_2_5_1() {
        String actual = Lesson_2_5.checkTask1(530, 2000, false, 50);
        assertEquals(actual, FALSE);
    }

    @Test
    @DisplayName("Первый тест 2 5 2")
    void firstTest_2_5_2() {
        String actual = Lesson_2_5.checkTask2(530, 2000, false, 90);
        assertEquals(actual, TRUE);
    }

    @Test
    @DisplayName("Второй тест 2 5 2")
    void secondTest_2_5_2() {
        String actual = Lesson_2_5.checkTask2(530, 2001, false, 90);
        assertEquals(actual, FALSE);
    }

    @Test
    @DisplayName("Третий тест 2 5 2")
    void thirdTest_2_5_2() {
        String actual = Lesson_2_5.checkTask2(730, 2000, false, 90);
        assertEquals(actual, FALSE);
    }

    @Test
    @DisplayName("Четвертый тест 2 5 2")
    void fourthTest_2_5_2() {
        String actual = Lesson_2_5.checkTask2(530, 2000, true, 200);
        assertEquals(actual, TRUE);
    }

    @Test
    @DisplayName("Пятый тест 2 5 2")
    void fifthTest_2_5_2() {
        String actual = Lesson_2_5.checkTask2(530, 2000, true, 50);
        assertEquals(actual, TRUE);
    }

    @Test
    @DisplayName("Шестой тест 2 5 2")
    void sixthTest_2_5_2() {
        String actual = Lesson_2_5.checkTask2(530, 2000, false, 200);
        assertEquals(actual, FALSE);
    }

    @Test
    @DisplayName("Седьмой тест 2 5 2")
    void seventhTest_2_5_2() {
        String actual = Lesson_2_5.checkTask2(530, 2000, false, 50);
        assertEquals(actual, FALSE);
    }

    @Test
    @DisplayName("Первый тест 2 6 1")
    void firstTest_2_6_1() {
        String actual = Lesson_2_6.checkTask1(530, 2000, false, 90);
        assertEquals(actual, TRUE);
    }

    @Test
    @DisplayName("Второй тест 2 5 1")
    void secondTest_2_6_1() {
        String actual = Lesson_2_6.checkTask1(530, 2001, false, 90);
        assertEquals(actual, FALSE);
    }

    @Test
    @DisplayName("Третий тест 2 6 1")
    void thirdTest_2_6_1() {
        String actual = Lesson_2_6.checkTask1(730, 2000, false, 90);
        assertEquals(actual, FALSE);
    }

    @Test
    @DisplayName("Четвертый тест 2 6 1")
    void fourthTest_2_6_1() {
        String actual = Lesson_2_6.checkTask1(530, 2000, true, 200);
        assertEquals(actual, TRUE);
    }

    @Test
    @DisplayName("Пятый тест 2 6 1")
    void fifthTest_2_6_1() {
        String actual = Lesson_2_6.checkTask1(530, 2000, true, 50);
        assertEquals(actual, TRUE);
    }

    @Test
    @DisplayName("Шестой тест 2 6 1")
    void sixthTest_2_6_1() {
        String actual = Lesson_2_6.checkTask1(530, 2000, false, 200);
        assertEquals(actual, FALSE);
    }

    @Test
    @DisplayName("Седьмой тест 2 6 1")
    void seventhTest_2_6_1() {
        String actual = Lesson_2_6.checkTask1(530, 2000, false, 50);
        assertEquals(actual, FALSE);
    }
}
