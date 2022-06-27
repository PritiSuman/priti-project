package teststeps;


import io.cucumber.java.en.Then;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestSteps {

    private static final Logger logger = LoggerFactory.getLogger(TestSteps.class.getSimpleName());

    @Then("java string tests")
    public void assertJavaStringMethods(){
        System.out.println("My First cucumber test run");
    }
}
