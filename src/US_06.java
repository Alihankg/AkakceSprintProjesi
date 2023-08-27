import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class US_06 extends BaseDriver {
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

        WebElement Hesap = driver.findElement(By.id("H_a_v8"));
        Hesap.click();

        WebElement Çık = driver.findElement(By.linkText("Çık"));
        Çık.click();

        BekleVeKapat();
    }
}
