package com.charism.service;

import com.charism.model.Customer;
import com.charism.repository.CustomerRepository;
import com.charism.repository.HibernateCustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Pradeep on 1/5/2017.
 */
@Service("customerService")
@Scope ("singleton")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerServiceImpl() {
    }

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("Constructor injection. Java configuration.");
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
}
