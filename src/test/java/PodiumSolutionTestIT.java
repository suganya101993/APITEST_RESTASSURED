import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/",

        plugin = {"pretty", "html:src/test/resources/test-reports"
                , "json:src/test/resources/test-reports/cucumber.json"
                , "junit:src/test/resources/test-reports/cucumber.xml"
        })

public class PodiumSolutionTestIT {


}
