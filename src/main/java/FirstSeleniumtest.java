import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumtest {
    public static void main(String[] args) {

        String baseURL ="https://demo.guru99.com/test/facebook.html";

        WebDriver driver = new ChromeDriver();

        driver.get(baseURL);
        driver.manage().window().maximize();
        //driver.findElement(By.id("email")).sendKeys("Smith");
        //driver.findElement(By.id("pass")).sendKeys("1234");
        //driver.findElement(By.id("u_0_b")).click();

        //driver.findElement(By.name("email")).sendKeys("Smith");
        //driver.findElement(By.name("pass")).sendKeys("1234");
        //driver.findElement(By.id("u_0_b")).click();

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test");

    }
}


