/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.app;

import com.component.SplashScreen;
import com.scene.LoginForm;
/**
 *
 * @author mayank
 */
public class Application {

    
    public static void main(String[] args) throws InterruptedException{
       SplashScreen splash = new SplashScreen();

        for (int i = 0; i <= 100; i++) {
            Thread.sleep(20);
            splash.setVisible(true);
            splash.progressBar.setValue(i);

            if (i == 100) {
                splash.dispose();
               LoginForm lf = new LoginForm();
               lf.setVisible(true);
            }
        }
    }
    
}
