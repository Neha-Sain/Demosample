package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WikiSteps {
    WebDriver driver;

    @Given("user navigates to wiki home page")
    public void wikihomepage() {
        driver = new EdgeDriver();
        driver.get("https://en.wikipedia.org/wiki/Infosys");
    }

    @When("user extracts the shareholder value")
    public void userExtractsTheShareholderValue() {
        int size = driver.findElements(By.xpath("//table[@class= 'wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).size();
        for (int k = 0; k < size; k++) {
            String Shareholdervalue = driver.findElements(By.xpath("//table[@class= '//table[@class= 'wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).get(k).getText();
            System.out.println(Shareholdervalue);
        }

    }

    @And("user extracts the shareholding value")
    public void userExtractsTheShareholdingValue() {
        int d = driver.findElements(By.xpath("//table[@class= 'wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]")).size();
        for (int x = 0; x < d; x++) {
            String Shareholdingvalue = driver.findElements(By.xpath("//table[@class= '//table[@class= 'wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]")).get(x).getText();
            System.out.println(Shareholdingvalue);
        }


       int m =  driver.findElements(By.xpath("//table[@class='wikitable']/descendant::tr/child::td[2]")).size();
            for(int a= 0; a<m; a++){
               String Acussion = driver.findElements(By.xpath("//table[@class='wikitable']/descendant::tr/child::td[2]")).get(m).getText();
              System.out.println(Acussion);
            }
    }
        @Then("validate the mapping")
        public void validateTheMapping() {
    }
}
