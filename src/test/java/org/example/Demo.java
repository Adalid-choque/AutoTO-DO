package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Demo {
    @Test
    public void demo(){
        // libreria puente de comunicacion con el browser
        WebDriverManager.chromedriver().setup();

        // puente -> open the browser
        ChromeDriver driver = new ChromeDriver();

        // timepo de espera para encontrar  el elemento
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //  cargar local url
        driver.get("https://formy-project.herokuapp.com/form");

        // find the element
        driver.findElement(By.cssSelector("#checkbox-2")).click();

        //driver.findElement(By.cssSelector(".not-exist")).click();

        // deja el puente abierto no lo cierra
//        driver.close();

        //cimpre se habre un proceso cerrarlo para que haya  1000 procesos abiertos
        driver.quit();

        // para encontrar  no usar es redundante y se puede deprecar
//        By.id(); #
//        By.name(); [name= '']
//        By.className(); .
//        By.tagName(); //
//        By.partialLinkText(); // [contains(test(), '')]
//        By.linkText(); //[text()=""]

        // siempre tratar de usar estos metodos
//        By.cssSelector();
//        By.xpath();
    }
}



