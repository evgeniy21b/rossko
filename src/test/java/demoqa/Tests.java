package demoqa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Tests extends BaseTest {


    @BeforeEach //Проходит ПЕРЕД каждым тестом
    public void beforeEach() {
        chromeDriver.get("https://demoqa.com/text-box");
    }

    @Test
    void demoqa() {
        Elements elements = new Elements(chromeDriver);
        elements.textBox();
    }
}