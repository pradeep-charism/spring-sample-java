package com.charism;

import com.charism.config.AppConfig;
import com.charism.model.Customer;
import com.charism.service.CustomerService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Pradeep on 1/5/2017.
 */
public class Application {

    private static AnnotationConfigApplicationContext context;

    public static void main(String[] args) {
        try{
            setup();
            CustomerService customerService = context.getBean("customerService", CustomerService.class);
            System.out.println(customerService.findAll());
            printBeanScope();

        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            context.close();
            context.destroy();
        }
    }

    private static void printBeanScope() {
        System.out.println(context.getBean("customerService", CustomerService.class));
        System.out.println(context.getBean("customerService", CustomerService.class));
    }

    private static void setup() {
        context = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}
