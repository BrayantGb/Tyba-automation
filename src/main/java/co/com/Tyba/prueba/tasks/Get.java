package co.com.Tyba.prueba.tasks;

import co.com.Tyba.prueba.interactions.Type;
import co.com.Tyba.prueba.models.NewUser;
import co.com.Tyba.prueba.userInterfaces.RegisterItem;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Get implements Task {

    private NewUser newUser;
    private WebDriver webDriver;
    public Get(NewUser newUser, WebDriver webDriver){this.newUser = newUser; this.webDriver = webDriver;}

    @Override
    public <T extends Actor> void performAs(T actor) {
                webDriver.findElement(By.xpath("//article[@id=\"popular_items\"]//div[@class=\"grid-table center\"]//div[@name=\"popular_item_16\"]//a[@role=\"link\"]//label[@id=\"details_16\"]")).click();
                webDriver.findElement(By.xpath("//*[@id=\"productProperties\"]/div[4]/button")).click();
                webDriver.findElement(By.xpath("/html/body/div[3]/nav/a[1]")).click();
                webDriver.findElement(By.xpath("/html/body/header/nav/ul/li[6]/a")).click();
                webDriver.findElement(By.xpath("//article[@id=\"popular_items\"]//div[@name=\"popular_item_10\"]//a[@role=\"link\"]//label[@id=\"details_10\"]")).click();
                webDriver.findElement(By.xpath("//*[@id=\"productProperties\"]/div[4]/button")).click();
                webDriver.findElement(By.xpath("//*[@id=\"menuCart\"]")).click();
                webDriver.findElement(By.xpath("//*[@id=\"checkOutButton\"]")).click();
                webDriver.findElement(By.xpath("//*[@id=\"next_btn\"]")).click();
                webDriver.findElement(By.xpath("//*[@id=\"paymentMethod\"]/div/div[2]/sec-form/sec-view[1]/div/input")).click();
            actor.attemptsTo(
                Type.on(RegisterItem.INPUT_SAFEPAY_USERNAME, newUser.getUsername())

            );
                webDriver.findElement(By.xpath("//*[@id=\"paymentMethod\"]/div/div[2]/sec-form/sec-view[2]/div/input")).click();
            actor.attemptsTo(
                        Type.on(RegisterItem.INPUT_SAFEPAY_PASSWORD,newUser.getPassword())
            );
                webDriver.findElement(By.xpath("//*[@id=\"pay_now_btn_SAFEPAY\"]")).click();

    }

    public static Get items(NewUser newUser, WebDriver webDriver){return  Tasks.instrumented(Get.class, newUser, webDriver);}

}
