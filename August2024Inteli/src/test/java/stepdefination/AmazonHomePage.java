package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHomePage {
    WebDriver driver;
    @Given("user navigates to amazon home page")
    public void homepagelogin() {
      driver  = new ChromeDriver();
        driver.get("https://www.amazon.ca/?tag=hydcaabkg-20&hvadid=677743594501&hvpos=&hvnetw=g&hvrand=17240317412082458646&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1002216&hvtargid=kwd-126871501&ref=pd_sl_5yi4z0vbcx_e&hydadcr=20063_13508851&gad_source=1");

    }

    @When("user enter the product name {string}")
        public void productname (String productname) {
driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys(productname);
        }
        @And("user clicks the search icon")
            public void searchicon(){
driver.findElement(By.xpath("//input[@value = 'Go']")).click();
            }

            @Then("user verify the title of page")
    public void uservalidatetitle(){
System.out.println(driver.getTitle());
            }

    @When("user extracts all the values")
    public void userExtractsAllTheValues() {
WebElement DropdownElement = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        int Dropdownsize = DropdownElement.findElements(By.tagName("option")).size();

for (int i=0; i<Dropdownsize; i++) {
  String Dropdownvalue =  DropdownElement.findElements(By.tagName("option")).get(i).getText();
    System.out.println(Dropdownvalue);



}
    }
}




