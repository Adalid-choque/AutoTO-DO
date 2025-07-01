package org.example.canvas.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class Login {

    private WebDriver driver;

    @FindBy(css = "#username")
    private WebElement usernameField;

    @FindBy(css = "#password")
    private WebElement passwordField;

    @FindBy(css = "button[data-testid='login-button']")
    private WebElement loginButton;

    public Login() {

        // Configurar opciones para Chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://canvas.instructure.com");
        PageFactory.initElements(driver, this);
    }

    public Home loginAs(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
        return new Home(driver);

    }
}
