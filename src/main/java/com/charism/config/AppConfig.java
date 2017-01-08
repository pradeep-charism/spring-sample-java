package com.charism.config;

import com.charism.repository.CustomerRepository;
import com.charism.repository.HibernateCustomerRepositoryImpl;
import com.charism.service.CustomerService;
import com.charism.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Pradeep on 1/8/2017.
 */
@Configuration
public class AppConfig {

    @Bean
    public CustomerService getCustomerService(){
        CustomerService customerService = new CustomerServiceImpl(getCustomerRepository());
        return customerService;
    }

    @Bean
    public CustomerRepository getCustomerRepository(){
        CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
        return customerRepository;
    }
}
