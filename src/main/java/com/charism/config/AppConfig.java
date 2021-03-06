package com.charism.config;

import com.charism.repository.CustomerRepository;
import com.charism.repository.HibernateCustomerRepositoryImpl;
import com.charism.service.CustomerService;
import com.charism.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by Pradeep on 1/8/2017.
 */
@Configuration
@ComponentScan ({"com.charism"})
@PropertySource("app.properties")
public class AppConfig {

    @Bean
    public PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    /*@Bean (name = "customerService")
    public CustomerService getCustomerService(){
//        CustomerService customerService = new CustomerServiceImpl(getCustomerRepository());
        CustomerService customerService = new CustomerServiceImpl();
        return customerService;
    }*/

    /*@Bean (name = "customerRepository")
    public CustomerRepository getCustomerRepository(){
        CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
        return customerRepository;
    }*/
}
