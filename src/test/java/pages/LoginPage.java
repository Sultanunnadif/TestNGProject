package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import java.io.File;

public class LoginPage {
        WebDriver driver;

        By usernameInput = By.cssSelector("input#user-name");
        By passwordInput = By.xpath("//*[@id=\"password\"]");
        By loginButton = By.id("login-button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void loginHomepage(){
        driver.get("https://www.saucedemo.com/");
    }
    public void inputUsername(String username){
        driver.findElement(usernameInput).sendKeys(username);
    }
    public void inputPassword(String password){
        driver.findElement(passwordInput).sendKeys(password);
    }
    public void loginButton(){
        driver.findElement(loginButton).click();
    }
}
