import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceLogin {
    WebDriver driver;

    @Given("user navigates to salesforce login page")
    public void homepage() {
        driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/");
    }

    @When("user enter the username {string} and password {string}")
    public void usernameandpassword(String arg0, String arg1) {
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc");
    }

    @And("user click on Login Button")
    public void loginbutton() {
        driver.findElement(By.xpath("//input[@id='Login']")).click();
    }

    @Then("user validate the navigation to home page")
    public void validatehomepage() {
        //System.out.println(driver.getTitle());
    }
    @Then("user validate by Error\" Please check your username and password. If you still can't log in, contact your Salesforce administrator.\"")
    public void Errormessage(){
      //  System.out.println();
    }
}