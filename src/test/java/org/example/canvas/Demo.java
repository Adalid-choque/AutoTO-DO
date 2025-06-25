package org.example.canvas;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo {
    private static final Logger logger = LoggerFactory.getLogger(Demo.class);
    
    @Test
    public void demo(){
        logger.info("Iniciando prueba de automatización");
        
        // libreria puente de comunicacion con el browser
        WebDriverManager.chromedriver().setup();
        
        // Configurar opciones para Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        // Ignorar errores de certificados SSL
        options.addArguments("--ignore-certificate-errors");
        // Desactivar logs de DevTools
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-logging"});
        
        // puente -> open the browser
        ChromeDriver driver = new ChromeDriver(options);

        // tiempo de espera para encontrar el elemento
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(15));

        //  cargar local url
        driver.get("https://formy-project.herokuapp.com/form");

        // find the element
        driver.findElement(By.cssSelector("#checkbox-2")).click();

        //driver.findElement(By.cssSelector(".not-exist")).click();

        // deja el puente abierto no lo cierra
        // driver.close();

        //cimpre se habre un proceso cerrarlo para que haya  1000 procesos abiertos
        driver.quit();

        // para encontrar  no usar es redundante y se puede deprecar
        // By.id(); #
        // By.name(); [name= '']
        // By.className(); .
        // By.tagName(); //
        // By.partialLinkText(); // [contains(test(), '')]
        // By.linkText(); //[text()=""]

        // siempre tratar de usar estos metodos
        // By.cssSelector();
        // By.xpath();


    }
    @Test
    public void demoClassroom(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(15));
        driver.get("https://canvas.instructure.com");
        driver.findElement(By.cssSelector("input#IDToken2")).sendKeys("adalid.choque.cuba@gmail.com");
        driver.findElement(By.cssSelector("input#IDToken3")).sendKeys("CambASAdAdCu790");
        driver.findElement(By.cssSelector("#root span form span:nth-child(2) button")).click();

        // Click en el enlace de courses
        driver.findElement(By.cssSelector("#global_nav_courses_link")).click();
        
        // Click en All Courses
        driver.findElement(By.cssSelector("a[href='/courses']")).click();
        
        // Click en botón Course
        driver.findElement(By.cssSelector("#start_new_course")).click();
        
        // Escribir nombre del curso
        driver.findElement(By.cssSelector("#TextInput___0")).sendKeys("Demo");
        
        // Click en botón Create - probar selector simple
        driver.findElement(By.cssSelector("div[class*='modalFooter'] button:last-child")).click();


        //finalizar el drier de pruebas 
        driver.quit();

    }
}