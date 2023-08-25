import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
// Hesap açma
public class US_01 extends BaseDriver {

    @Test
    public void T1() {

        driver.get("https://www.akakce.com/");
        MyFunc.Bekle(2);

        WebElement life = driver.findElement(By.linkText("Hesap Aç"));
        life.click();

        WebElement name = driver.findElement(By.id("rnufn"));
        name.sendKeys("Mahmut");

        WebElement lastname = driver.findElement(By.id("rnufs"));
        lastname.sendKeys("Yılmaz");

        WebElement gmail = driver.findElement(By.id("rnufe1"));
        gmail.sendKeys("wamixa3224@stypedia.com");

        WebElement gmail1 = driver.findElement(By.id("rnufe2"));
        gmail1.sendKeys("wamixa3224@stypedia.com");

        WebElement sifre = driver.findElement(By.id("rnufp1"));
        sifre.sendKeys("Mahmut1234");

        WebElement sifre1 = driver.findElement(By.id("rnufp2"));
        sifre1.sendKeys("Mahmut1234");

        WebElement erkek = driver.findElement(By.id("rngm"));
        erkek.click();

        WebElement il = driver.findElement(By.id("locpr"));
        il.sendKeys("");

        Select il1 = new Select(il);

        il1.selectByVisibleText("Ankara");

        WebElement ilce = driver.findElement(By.id("locds"));
        ilce.click();

        Select ilce1 = new Select(ilce);

        ilce1.selectByVisibleText("Bala");

        WebElement gun = driver.findElement(By.id("bd"));

        Select bd1 = new Select(gun);

        bd1.selectByVisibleText("5");

        WebElement ay = driver.findElement(By.id("bm"));

        Select ay1 = new Select(ay);

        ay1.selectByVisibleText("4");

        WebElement yil = driver.findElement(By.id("by"));

        Select yil1 = new Select(yil);

        yil1.selectByVisibleText("2001");

        WebElement checkbox = driver.findElement(By.id("rnufpca"));
        checkbox.click();

        WebElement hesap = driver.findElement(By.id("rfb"));
        hesap.click();



        BekleVeKapat();
    }

}
    

