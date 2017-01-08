package com.charism.repository;

import com.charism.model.Customer;

import java.util.List;

/**
 * Created by Pradeep on 1/5/2017.
 */
public interface CustomerRepository {
    List<Customer> findAll();
}
