package test;

import main.try_2.hometasks.lesson_2.ageComparator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Проверка сравнения возрастов")
public class ageComparatorTest {

    public static String getTemplate(int max, int min, int middle) {
        return "Minimal age: " + min + "\n" +
                "Middle age: " + middle + "\n" +
                "Maximal age: " + max;
    }

    @Test
    @DisplayName("Первый тест")
    void firstTest() {
        String actual = ageComparator.checkAge(60, 35, 15);
        String expected = getTemplate(60, 15, 35);
        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Второй тест")
    void secondTest() {
        String actual = ageComparator.checkAge(45, 17, 17);
        String expected = getTemplate(45, 17, 17);
        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Третий тест")
    void thirdTest() {
        String actual = ageComparator.checkAge(55, 55, 55);
        String expected = getTemplate(55, 55, 55);
        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Четвертый тест")
    void fourthTest() {
        String actual = ageComparator.checkAge(29, 14, 36);
        String expected = getTemplate(36, 14, 29);
        assertEquals(actual, expected);
    }
}
