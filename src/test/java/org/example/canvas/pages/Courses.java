package org.example.canvas.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Courses {

    private WebDriver driver;

public Courses(WebDriver driver){
    this.driver = driver;

}
public void clickOnCourses(){

}
    public void quit() {
        if (driver != null) {
            driver.quit();
        }
    }

}
