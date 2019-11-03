package es.esoftwares.init;

import es.esoftwares.config.ThymeleafApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

@SpringBootApplication
//@EnableWebMvc
@ComponentScan(basePackages = {"es.esoftwares"})
public class InitWebApplication  {

    public static void main(String[] args) {

        SpringApplication.run(InitWebApplication.class, args);
    }

}
