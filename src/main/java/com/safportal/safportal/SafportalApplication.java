package com.safportal.safportal;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SafportalApplication extends SpringBootServletInitializer {
  
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);
    }
   
    public static void main(String[] args) {
            SpringApplication.run(SafportalApplication.class, args);
    }

}
