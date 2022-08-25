package day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExampleSelenium {
    public static void main(String[] args) {
        String browser = "Chrome";
        WebDriver driver=null;
        if(browser=="Chrome"){
            System.out.println("Opening Chrome");
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        else if(browser=="Firefox") {
            System.out.println("Opening FireFox");
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else{
            System.out.println("Enter Correct Browser");
        }
        driver.get("https://www.amazon.in");
    }
}
