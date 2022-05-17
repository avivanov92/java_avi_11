package ru.stqa.java_avi.addressbook.tests;// Generated by Selenium IDE

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.java_avi.addressbook.model.ContactsData;

import java.util.Map;

public class ContactCreationTests extends TestBase {
  private FirefoxDriver wd;
  private Map<String, Object> vars;
  JavascriptExecutor js;

  @Test
  public void testContactCreation() {
    wd.get("http://localhost/addressbook/");
    wd.manage().window().setSize(new Dimension(1037, 1040));
    wd.findElement(By.name("user")).sendKeys("admin");
    wd.findElement(By.name("pass")).sendKeys("secret");
    wd.findElement(By.xpath("//form[@id=\'LoginForm\']/input[3]")).click();
    wd.findElement(By.linkText("add new")).click();
    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).sendKeys("Artur");
    wd.findElement(By.name("lastname")).click();
    wd.findElement(By.name("lastname")).sendKeys("Ivanov");
    wd.findElement(By.name("address")).click();
    wd.findElement(By.name("address")).sendKeys("Cherepovets");
    wd.findElement(By.name("mobile")).click();
    wd.findElement(By.name("mobile")).sendKeys("+7985456213");
    wd.findElement(By.name("email")).click();
    wd.findElement(By.name("email")).sendKeys("av.ivanov@mail.com");
    wd.findElement(By.xpath("//div[@id=\'content\']/form/input[21]")).click();
    wd.findElement(By.linkText("home page")).click();
  }
}