import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class Finder {
    private WebDriver driver;
    private static final String CHROME_DRIVER_LOCATION = "C://Java/Driver/chromedriver.exe";
    public Finder() {
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_LOCATION);
        this.driver = new ChromeDriver();
    }
    @Test
    public void firstTest() {

        driver.manage().window().maximize();

        driver.get("http://automationpractice.com/index.php");

        driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")).click();

        driver.findElement(By.xpath("//*[@id=\"layered_category_8\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"layered_id_attribute_group_13\"]")).click();


        //driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]"));
        //driver.findElement(By.xpath("///*[@id=\"center_column\"]/ul/li[2]")).click();

        WebElement we = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]"));
        Actions builder = new Actions(driver);
        builder.moveToElement(we).build().perform();

        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")).click();

        //driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")).click();

        //driver.navigate().back();

        // driver.close();

    }
}
