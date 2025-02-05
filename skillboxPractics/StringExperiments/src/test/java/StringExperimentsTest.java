import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import prictice.StringExperiments;

@DisplayName("Эксперименты со строками(задание 9.2")
public class StringExperimentsTest {

    @Test
    @DisplayName("1.1. С учетом регистра -> лошадь != молоко")
    void test1() {
        String str1 = "лошадь";
        String str2 = "молоко";
        String result = "лошадь != молоко";
        launchWith(str1, str2, result);
    }

    @Test
    @DisplayName("2.1. С учетом регистра -> молоко == молоко")
    void test2() {
        String str1 = "молоко";
        String str2 = "молоко";
        String result = "молоко == молоко";
        launchWith(str1, str2, result);
    }

    @Test
    @DisplayName("3.1. С учетом регистра -> лошадь != Лошадь")
    void test3() {
        String str1 = "лошадь";
        String str2 = "Лошадь";
        String result = "лошадь != Лошадь";
        launchWith(str1, str2, result);
    }

    @Test
    @DisplayName("4.1. С учетом регистра -> лошадь != ЛоШаДь")
    void test4() {
        String str1 = "лошадь";
        String str2 = "ЛоШаДь";
        String result = "лошадь != ЛоШаДь";
        launchWith(str1, str2, result);
    }

    @Test
    @DisplayName("1.2. Без учета регистра -> лошадь != молоко")
    void test5() {
        String str1 = "лошадь";
        String str2 = "молоко";
        String result = "лошадь != молоко";
        launchWithout(str1, str2, result);
    }

    @Test
    @DisplayName("2.2. Без учета регистра -> молоко == молоко")
    void test6() {
        String str1 = "молоко";
        String str2 = "молоко";
        String result = "молоко == молоко";
        launchWithout(str1, str2, result);
    }

    @Test
    @DisplayName("3.2. Без учета регистра -> лошадь == Лошадь")
    void test7() {
        String str1 = "лошадь";
        String str2 = "Лошадь";
        String result = "лошадь == Лошадь";
        launchWithout(str1, str2, result);
    }

    @Test
    @DisplayName("4.2. Без учета регистра -> лошадь == ЛоШаДь")
    void test8() {
        String str1 = "лошадь";
        String str2 = "ЛоШаДь";
        String result = "лошадь == ЛоШаДь";
        launchWithout(str1, str2, result);
    }

    private void launchWith(String str1, String str2, String exp) {
        String result = StringExperiments.equalsWithCase(str1, str2);
        Assertions.assertEquals(exp, result);
    }

    private void launchWithout(String str1, String str2, String exp) {
        String result = StringExperiments.equalsWithoutCase(str1, str2);
        Assertions.assertEquals(exp, result);
    }
}
