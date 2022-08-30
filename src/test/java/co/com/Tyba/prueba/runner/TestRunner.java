package co.com.Tyba.prueba.runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/co/com/Tyba/prueba/features/",
        glue = {"co.com.Tyba.prueba.stepDefinitions", "co.com.Tyba.prueba.set.hook"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true,
        tags = "@ShoppingTest"

)
public class TestRunner {
}
