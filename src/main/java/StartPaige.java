import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Provider;


public class StartPaige {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\bin\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium.dev");

        driver.close();
    }
}
