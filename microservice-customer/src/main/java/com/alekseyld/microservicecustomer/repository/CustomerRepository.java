package com.alekseyld.microservicecustomer.repository;

import com.alekseyld.microservicecustomer.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
}
