package stepDefenition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefenitionClass1{
@Given("^Intialize the Browser$")
public void intialize_the_Browser(){
   System.out.println("Running: intialize_the_Browser");
    
}

@Given("^Navigate to \"([^\"]*)\" site$")
public void navigate_to_site(String arg1) {
    System.out.println("Running: navigate_to_site");
    
}

@Given("^Click on Login$")
public void click_on_Login(){
   System.out.println("Running: click_on_Login");
    
}

@When("^User enters username \"([^\"]*)\" and password \"([^\"]*)\" and logs in$")
public void user_enters_username_and_password_and_logs_in(String arg1, String arg2){
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Running: user_enters_username_and_password_and_logs_in");
}

@Then("^Verify login is success$")
public void verify_login_is_success() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Running: verify_login_is_success");
}

@Given("^User is on loading page$")
public void user_is_on_loading_page(){
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Running: user_is_on_loading_page");
}

@When("^User login into applicaion with \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_login_into_applicaion_with_and(String arg1, String arg2){
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Running: user_login_into_applicaion_with_and");
}

@Then("^home page populated$")
public void home_page_populated() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Running: home_page_populated");
}

@Then("^Cards are not displayed$")
public void cards_are_not_displayed() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Running: cards_are_not_displayed");
}

}
