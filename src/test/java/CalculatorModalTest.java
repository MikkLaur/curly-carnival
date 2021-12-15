import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.sleep;

public class CalculatorModalTest {
    @Test
    void defaultValuesAreCorrect() {

        open("https://ansokan.bigbank.se/?amount=85000&period=120&interestRate=10.95&lang=sv&bbsource=google&bbchannel=organic");
        //$(By.cssSelector("#.bb-edit-amount")).click();
        $(".bb-edit-amount").should(exist);
        $(".bb-edit-amount").click();
        $(".bb-calculator__result-value").should(exist);
        $("#header-calculator-amount > div.bb-slider__value > button").click();
        $("#header-calculator-amount > div.bb-slider__value > div > input").sendKeys("82000");


        $(".bb-currency-input__input");
        $(".bb-calculator__result-value");
        $(".bb-calculator__result-value").shouldHave(text("1210,38 SEK"));
        sleep(5000);

    }
}