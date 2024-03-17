package demoqa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Tests extends BaseTest {


    //@BeforeEach //Проходит ПЕРЕД каждым тестом
    public void beforeEach() {
        chromeDriver.get("https://demoqa.com/text-box");
    }

    @Test
    void demoqa() {
        chromeDriver.get("https://demoqa.com/text-box");
        Elements elements = new Elements(chromeDriver);
        elements.textBox();
    }

    @Test
     void demoqa1() {
        chromeDriver.get("https://demoqa.com/checkbox");
        Checkbox elements = new Checkbox(chromeDriver);
         elements.checkBox();
    }

    @Test
    void demoqa2() {
        chromeDriver.get("https://demoqa.com/radio-button");
        Radiobutton elements = new Radiobutton(chromeDriver);
        elements.radioButton();
    }

    @Test
    void demoqa3()  {
        chromeDriver.get("https://demoqa.com/webtables");
        WebTables elements = new WebTables(chromeDriver);
        elements.webTables();
    }

    @Test
    void demoqa4()  {
        chromeDriver.get("https://demoqa.com/webtables");
        WebTablesAdd elements = new WebTablesAdd(chromeDriver);
        elements.webTablesAdd();
    }
}