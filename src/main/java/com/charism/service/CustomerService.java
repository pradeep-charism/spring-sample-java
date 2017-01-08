package com.charism.service;

import com.charism.model.Customer;

import java.util.List;

/**
 * Created by Pradeep on 1/5/2017.
 */
public interface CustomerService {
    List<Customer> findAll();
}
