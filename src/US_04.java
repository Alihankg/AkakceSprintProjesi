import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
// Login and Hesap doğrulama
public class US_04 extends BaseDriver {
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

        WebElement  Kisisel= driver.findElement(By.cssSelector("[href='/akakcem/kullanici-bilgilerim/bilgi-guncelle/']"));
        Kisisel.click();

        WebElement ad=driver.findElement(By.id("umdna"));
        Assert.assertTrue("ad gözüktü = ", ad.isDisplayed());

        WebElement soyad=driver.findElement(By.id("umdsu"));
        Assert.assertTrue("soyad gözüktü = ", soyad.isDisplayed());

        WebElement cinsiyet =driver.findElement(By.id("umdgm"));
        Assert.assertTrue("cinsiyet gözüktü = ", cinsiyet.isDisplayed());

        WebElement dogum =driver.findElement(By.id("umdgm"));
        Assert.assertTrue("dogum tarihi gözüktü = ", dogum.isDisplayed());

        WebElement il =driver.findElement(By.id("locpr"));
        Assert.assertTrue("il gözüktü = ", il.isDisplayed());

        WebElement ilce =driver.findElement(By.id("locds"));
        Assert.assertTrue("ilce gözüktü = ", ilce.isDisplayed());

        BekleVeKapat();
    }
}
