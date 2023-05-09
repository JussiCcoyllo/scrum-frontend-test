package LoginE2E;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginBySms {

    private String firstName = "Jussi";
    private String password = "";

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1.Go to localhost
        driver.get("http://localhost:4200/");
        String title = driver.getTitle();

        //2.Enter your phone number
        WebElement enterPhone = driver.findElement(By.xpath("//input[@id='c']"));
        WebElement enterCode= driver.findElement(By.xpath("//input[@id='mat-input-1']"));
        WebElement submitButton = driver.findElement(By.xpath("//class[@class='login-button mdc-button mdc-button--raised mat-mdc-raised-button mat-primary mat-mdc-button-base']"));

    }
}
