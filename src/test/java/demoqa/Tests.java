package demoqa;
import org.junit.jupiter.api.Test;
import rossko.*;

public class Tests extends BaseTest {




    @Test
    void partnumberSearchMagnifier()  {
        chromeDriver.get("https://rossko.ru/");
        InputWithMagnifier elements = new InputWithMagnifier (chromeDriver);
        elements.inputWithMagnifier();
    }

    @Test
    void vinAutoMazdaSearch()  {
        chromeDriver.get("https://rossko.ru/");
        InputWithVinMazda elements = new InputWithVinMazda (chromeDriver);
        elements.inputWithVinMazda();
    }

    @Test
    void vinAutoRenaultSearch()  {
        chromeDriver.get("https://rossko.ru/");
        InputWithVinRenault elements = new InputWithVinRenault (chromeDriver);
        elements.inputWithVinRenault();
    }

    @Test
    void vinAutoKiaSearch()  {
        chromeDriver.get("https://rossko.ru/");
        InputWithVinKia elements = new InputWithVinKia(chromeDriver);
        elements.inputWithVinKia();
    }
    @Test
    void howFindVin()  {
        chromeDriver.get("https://rossko.ru/");
        ButtonHowFindVin elements = new ButtonHowFindVin(chromeDriver);
        elements.buttonHowFindVIN();
    }

    @Test
    void popularProductsOil()  {
        chromeDriver.get("https://rossko.ru/");
        ButtonPopularProductsOil elements = new ButtonPopularProductsOil(chromeDriver);
        elements.buttonPopularProductsOil();
    }

    @Test
    void popularProductsSparkPlugs()  {
        chromeDriver.get("https://rossko.ru/");
        ButtonPopularProductsSparkPlugs elements = new ButtonPopularProductsSparkPlugs(chromeDriver);
        elements.buttonPopularProductsSparkPlugs();
    }

    @Test
    void BoxFeedbackFormTest()  {
        chromeDriver.get("https://rossko.ru/");
        BoxFeedbackForm elements = new BoxFeedbackForm(chromeDriver);
        elements.BoxFeedbackForm();
    }
}