package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class InsideHome {
    By productTitles = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    WebDriver driver;

    public InsideHome(WebDriver driver){
        this.driver = driver;
    }

    public void validateElement(){
        driver.findElement(productTitles).isDisplayed();
        Assert.assertTrue(driver.findElement(productTitles).isDisplayed());
        Assert.assertEquals("Sauce Labs Backpack", driver.findElement(productTitles).getText());
    }
    public void takeScreenshot() throws IOException, InterruptedException {
        new File("screenshots").mkdirs();
        Thread.sleep(5000);
        Screenshot screenshot = new AShot().takeScreenshot(driver);
        File actualFile = new File("screenshots/homepage.png");
        ImageIO.write(screenshot.getImage(), "PNG", actualFile);
    }
    public void PBtakeScreenshot() throws IOException, InterruptedException {
        new File("PBscreenshots").mkdirs();
        Thread.sleep(5000);
        Screenshot screenshot = new AShot().takeScreenshot(driver);
        File PBFile = new File("PBscreenshots/PBhomepage.png");
        ImageIO.write(screenshot.getImage(), "PNG", PBFile);

    }
    public void compareScreenshots() throws IOException {
        ImageDiffer imageDiffer = new ImageDiffer();
        ImageDiff diff = imageDiffer.makeDiff(
                ImageIO.read(new File("screenshots/homepage.png")),
                ImageIO.read(new File("PBscreenshots/PBhomepage.png"))
        );

        if (diff.hasDiff()) {
            new File("Difference").mkdirs();
           File diffile = new File("Difference/Problem.png");
            ImageIO.write(diff.getMarkedImage(), "PNG", diffile);
            System.out.println("Images are different. See Problem.png for details.");
        } else {
            System.out.println("Images are the same");
        }
        Assert.assertFalse(diff.hasDiff());
    }
}
