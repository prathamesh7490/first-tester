package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ListPracTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        driver.manage().window().maximize();

        List<WebElement> productNewList= driver.findElements(By.xpath("//div[@class='inventory_item_description']"));

        for (int i =0 ; i<productNewList.size(); i++)
        {
            String value= productNewList.get(i).getText();
            System.out.println(value);
        }


    }
}
