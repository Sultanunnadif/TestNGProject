package basewebsite;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class foundation {
    public static WebDriver driver;

    public void driverGet(){
        driver = WebDriverManager.chromiumdriver().create();
        driver.manage().window().maximize();
    }
}
