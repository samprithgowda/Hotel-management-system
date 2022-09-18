package com.dey.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dey.model.Customer;
@Repository
public interface CustRepository extends JpaRepository<Customer,Long> {

}
