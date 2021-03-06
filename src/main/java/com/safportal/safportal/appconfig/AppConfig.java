/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safportal.safportal.appconfig;

import com.safportal.safportal.services.SiteService;
import com.safportal.safportal.services.SiteServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 *
 * @author user
 */
@Configuration
@ComponentScan(basePackages = "com.safportal.safportal")
public class AppConfig extends WebMvcConfigurationSupport {

    //Static resources
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**","/images/**")
                .addResourceLocations("classpath:/static/", "classpath:/static/images/");
    }

    //resolve jsps
    @Bean
    public InternalResourceViewResolver jspViewResolver(){
        InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/jsp/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        return viewResolver;
    }

    @Bean
    public SiteService siteService(){
<<<<<<< HEAD
        return new SiteServiceImpl();
=======
        return  new SiteServiceImpl();
>>>>>>> a0ad67fe3c46ef9edd46dce34770079e6fa03a51
    }
}
