import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import prictice.StringExperiments3;

@DisplayName("Эксперименты со строками(задание 9.3")
public class StringExperiments3Test {

    @Test
    @DisplayName("1. 653 + 90 = 743")
    void test1() {
        String a = "653";
        String b = "90";
        String opr = "+";
        String result = "653 + 90 = 743";
        launchWith(a, b, opr, result);
    }

    @Test
    @DisplayName("2. 22 * 85 = 1870")
    void test2() {
        String a = "22";
        String b = "85";
        String opr = "*";
        String result = "22 * 85 = 1870";
        launchWith(a, b, opr, result);
    }

    @Test
    @DisplayName("3. 34 / 2 = 17")
    void test3() {
        String a = "34";
        String b = "2";
        String opr = "/";
        String result = "34 / 2 = 17";
        launchWith(a, b, opr, result);
    }

    @Test
    @DisplayName("4. 987 − 800 = 187")
    void test4() {
        String a = "987";
        String b = "800";
        String opr = "-";
        String result = "987 - 800 = 187";
        launchWith(a, b, opr, result);
    }

    private void launchWith(String a, String b, String opr, String exp) {
        String result = StringExperiments3.operations(a, b, opr);
        Assertions.assertEquals(exp, result);
    }
}
