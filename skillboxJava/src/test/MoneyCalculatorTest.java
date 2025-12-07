package test;

import main.try_2.hometasks.lesson_8.MoneyCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Проверка работы расчета коссет на количество денег")
public class MoneyCalculatorTest {

    @Test
    @DisplayName("На 1999 - 1 кассета")
    void firstTest_8_2_1() {
        int result = MoneyCalculator.calculateCassetteCount(1999);
        assertEquals(result, 1);
    }

    @Test
    @DisplayName("На 2000 - 1 кассета")
    void secondTest_8_2_1() {
        int result = MoneyCalculator.calculateCassetteCount(1999);
        assertEquals(result, 1);
    }

    @Test
    @DisplayName("На 2001 - 2 кассеты")
    void thirdTest_8_2_1() {
        int result = MoneyCalculator.calculateCassetteCount(1999);
        assertEquals(result, 1);
    }

    @Test
    @DisplayName("На 2500 - 2 кассеты")
    void fourthTest_8_2_1() {
        int result = MoneyCalculator.calculateCassetteCount(1999);
        assertEquals(result, 1);
    }

    @Test
    @DisplayName("На 4000 - 2 кассеты")
    void fifthTest_8_2_1() {
        int result = MoneyCalculator.calculateCassetteCount(1999);
        assertEquals(result, 1);
    }

    @Test
    @DisplayName("На 4001 - 3 кассеты")
    void sixthTest_8_2_1() {
        int result = MoneyCalculator.calculateCassetteCount(1999);
        assertEquals(result, 1);
    }
}
