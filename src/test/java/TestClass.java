import gusev.Method;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

@Slf4j
public class TestClass {
String[] mass = {"qq","hello","Qwer","ewq","qwe","blod","dima","amid","eqw","asd","dsa","sda"};
    String expectedResult = "ewq = 3, 4, 8 dima = 6, 7 asd = 9, 10, 11";

    @Test
   public void testFunction() {
        Assert.assertEquals(expectedResult, Method.compareFunction(mass));
        log.info("Тест успешно прошел проверку");
    }
}
