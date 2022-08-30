package co.com.Tyba.prueba.stepDefinitions;

import co.com.Tyba.prueba.models.DataExcel;
import co.com.Tyba.prueba.questions.MessageAnswer;
import co.com.Tyba.prueba.tasks.*;
import co.com.Tyba.prueba.userInterfaces.HomePage;
import co.com.Tyba.prueba.userInterfaces.RegisterPage;
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
import static co.com.Tyba.prueba.enums.Message.INAVLID_EMAIL;
import static co.com.Tyba.prueba.enums.Message.WRONG_PASSWORD;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegisterUser {

    @Managed(driver = "Chrome")
    WebDriver herBrowser;
    Actor user = Actor.named(USER.getHomePage());

    @Shared
    DataExcel dataExcel;

    @Given("the user selects the register option in the menu main")
    public void theUserSelectsTheRegisterOptionInTheMenuMain() {
        user.can(BrowseTheWeb.with(herBrowser));
        user.attemptsTo(SetData.user());
        user.attemptsTo(SelectOption.menu(HomePage.BUTTON_LOGIN));
        user.attemptsTo(SelectOption.menu(HomePage.BUTTON_REGISTER));
    }


    @When("A user enters confirm password a wrong")
    public void aUserEntersConfirmPasswordAWrong() {
        user.attemptsTo(ConfirmPassword.incorrect(Converter.registre(dataExcel)));
    }

    @When("A user enters an invalid format email")
    public void aUserEntersAnInvalidFormatEmail() {
        user.attemptsTo(InvalidEmail.format(Converter.registre(dataExcel)));

    }

    @When("A user enters their data to create their account")
    public void aUserEntersTheirDataToCreateTheirAccount() {
        user.attemptsTo(Fill.form(Converter.registre(dataExcel),herBrowser));
    }


    @Then("the system cannot register it")
    public void theSystemCannotRegisterIt() {
        user.should(seeThat(MessageAnswer.is(RegisterPage.MESSAGE_PASSWORD_DOESNOT_MATCH),
                Matchers.equalTo(WRONG_PASSWORD.getInformative())));
    }

    @Then("the system going to notify her email invalid")
    public void theSystemGoingToNotifyHerEmailInvalid() {
        user.should(seeThat(MessageAnswer.is(RegisterPage.MESSAGE_INVALID_EMAIL),
                Matchers.equalTo(INAVLID_EMAIL.getInformative())));
    }

    @Then("the system create the user successful")
    public void theSystemCreateTheUserSuccessful() {
        user.attemptsTo(Create.account());
    }

}

