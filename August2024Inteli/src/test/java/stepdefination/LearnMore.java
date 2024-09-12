package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnMore {
WebDriver driver;
    @Given("User navigates to the Learnmore signup page")
    public void signuppage(){
driver = new ChromeDriver();
driver.get("https://learnmoreplayground.blogspot.com/p/loginpage.html");

    }
    @When("user enter the username {string} and password {string}")
    public void credentials(String arg0,String arg1)
    {
driver.findElement(By.id("username")).sendKeys("gvsdshdbddj");
driver.findElement(By.id("password")).sendKeys("sdfgh");
    }
    @And("user clicks the luser navigated to the learnmore home pageogin button")
    public void userlogin(){
driver.findElement(By.linkText("Login")).click();
    }
    @Then("user validate the navigation to home page")
    public void homepagelearnmore(){
        System.out.println(driver.getTitle());

    }
}
