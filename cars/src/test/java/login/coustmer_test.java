package login;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;
import io.cucumber.junit.CucumberOptions.SnippetType;
@RunWith(Cucumber.class)
@CucumberOptions( features="Cars_Feature/log_in",glue="login" )
public class coustmer_test {

}
