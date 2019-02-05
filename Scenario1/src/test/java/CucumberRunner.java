import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Алексей on 31.01.2019.
 */

@RunWith(Cucumber.class)
@CucumberOptions (
        features = {"src/test/resources/"},
        glue = {"steps"},
        plugin = {"util.AllureReporter"}
)

public class CucumberRunner {
}
