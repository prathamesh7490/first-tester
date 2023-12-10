package testscenarios;

import firstapplication.TestBaseTest;
import org.openqa.selenium.devtools.v85.io.IO;
import org.testng.annotations.Test;

import java.io.IOException;

public class AppTests extends TestBaseTest {

    @Test
     void landingPage()throws IOException{

        driver =initilisedriver();
        String baseURL ="https://www.saucedemo.com/v1/";
        driver.get(baseURL);
        System.out.println("Account open");
    }



}
