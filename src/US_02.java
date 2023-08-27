import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
// Mesaj kutusu Kontrolü
public class US_02 extends BaseDriver {
    @Test
    public void T1() {

        driver.get("https://www.akakce.com/");
        MyFunc.Bekle(2);

        WebElement giris = driver.findElement(By.linkText("Giriş Yap"));
        giris.click();

        WebElement eposta = driver.findElement(By.id("life"));
        eposta.sendKeys("wamixa3224@stypedia.com");

        WebElement sifre = driver.findElement(By.id("lifp"));
        sifre.sendKeys("Mahmut1234");

        WebElement giris1 = driver.findElement(By.id("lfb"));
        giris1.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement Hesabim = driver.findElement(By.id("H_a_v8"));


        Actions aksiyonDriver = new Actions(driver);
        aksiyonDriver.moveToElement(Hesabim).build().perform();

        WebElement Hesap = driver.findElement(By.linkText("Mahmut"));
        Hesap.click();

        WebElement Mesajlarim = driver.findElement(By.linkText("Mesajlarım"));
        Mesajlarim.click();

        WebElement mesaj =driver.findElement(By.xpath("//p[text()='Listelenecek mesaj bulunamadı.']"));
        Assert.assertTrue("mesaj kontrolü gözüktü = ", mesaj.isDisplayed());



    }
}
