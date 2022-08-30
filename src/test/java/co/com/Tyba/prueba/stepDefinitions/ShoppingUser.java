package co.com.Tyba.prueba.stepDefinitions;

import co.com.Tyba.prueba.execptions.UnexpectedMessage;
import co.com.Tyba.prueba.models.DataExcel;
import co.com.Tyba.prueba.questions.MessageAnswer;
import co.com.Tyba.prueba.tasks.Get;
import co.com.Tyba.prueba.tasks.Select;
import co.com.Tyba.prueba.tasks.SetData;
import co.com.Tyba.prueba.userInterfaces.RegisterShipping;
import co.com.Tyba.prueba.utils.Converter;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Shared;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static co.com.Tyba.prueba.enums.HomePage.USER;
import static co.com.Tyba.prueba.enums.Message.SHIPPING_SUCCESSFUL;
import static co.com.Tyba.prueba.execptions.UnexpectedMessage.UNEXPECTED_MESSAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ShoppingUser {

    @Managed(driver = "Chrome")
    WebDriver herBrowser;
    Actor user = Actor.named(USER.getHomePage());

    @Shared
    DataExcel dataExcel;
    
    @Given("the user selects the option in menu popular items")
    public void theUserSelectsTheOptionInMenuPopularItems(){
        user.can(BrowseTheWeb.with(herBrowser));
        user.attemptsTo(SetData.user());
        user.attemptsTo(Select.option(herBrowser));
    }

    @When("A user select items in the page for purchase")
    public void aUserSelectItemsInThePageForPurchase() {
        user.attemptsTo(Get.items(Converter.registre(dataExcel),herBrowser));
    }

    @Then("make the purchase successfully")
    public void makeThePurchaseSuccessfully() {
        user.should(seeThat(MessageAnswer.is(RegisterShipping.SHIPPING_SUCCESSFUL), Matchers.equalTo(SHIPPING_SUCCESSFUL.getInformative())).orComplainWith(UnexpectedMessage.class, UNEXPECTED_MESSAGE));
    }
}
