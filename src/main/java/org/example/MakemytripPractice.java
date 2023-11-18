package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakemytripPractice {


    public static void main(String[] args) throws InterruptedException {
        String baseURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

        WebDriver driver = new ChromeDriver();

        driver.get(baseURL);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //driver.findElement(By.id("email")).sendKeys("Smith");
        //driver.findElement(By.id("pass")).sendKeys("1234");
        //driver.findElement(By.id("u_0_b")).click();

        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(2000);
        String s = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();

        System.out.println("Text capture & validated as " + s);
        
    }
}


