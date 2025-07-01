package org.example.canvas.tests;

import org.example.canvas.pages.Courses;
import org.example.canvas.pages.Login;
import org.example.canvas.pages.Home;
import org.example.canvas.pages.SubMenu;
import org.junit.jupiter.api.Test;


public class CoursesTest {

    @Test
    public void editCourse() {
        // Iniciar sesión
        Login login = new Login();
        Home home = login.loginAs("adalid.choque.cuba@gmail.com", "CambASAdAdCu790");
        SubMenu subMenu = home.clickMenu("Courses");
        Courses courses = subMenu.clickAllCoursesLink();
        //SubMenu subMenu = home.clickMenu("Courses");
        //Courses courses = subMenu.clickAllCoursesLink();


        //courses.quit();
    }
}