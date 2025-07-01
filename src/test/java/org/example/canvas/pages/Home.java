package org.example.canvas.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

    private WebDriver driver;

    @FindBy(css = "#global_nav_courses_link")
    private WebElement menu;

    public Home (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    public SubMenu clickMenu(String menuName){
        menu.click();
        return new SubMenu(driver);
    }
}
