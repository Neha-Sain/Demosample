import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUrl
{

    public static void main (String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.netflix.com/ca/");
    driver.manage().window().maximize();
    Thread.sleep(5000);
    System.out.println(driver.getTitle());
    driver.close();
}

}
