package co.com.Tyba.prueba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Select implements Task {

    private WebDriver webDriver;
    public Select(WebDriver webDriver){this.webDriver = webDriver;}


    @Override
    public <T extends Actor> void performAs(T actor) {

        webDriver.findElement(By.xpath("/html/body/header/nav/ul/li[6]/a")).click();

        //JavascriptExecutor js = (JavascriptExecutor) BrowseTheWeb.as(actor).getDriver();
        //WebElement asyncElement = BrowseTheWeb.as(actor).getDriver().findElement(By.xpath("//*[contains(text(),'POPULAR ITEMS')]"));
        //actor.attemptsTo(
                //Click.on(asyncElement)
            //Click.on(PopularItems.BUTTON_POPULAR_ITEMS)
        //);


    }

    public static Select option(WebDriver webDriver){return Tasks.instrumented(Select.class, webDriver);
    }
}
