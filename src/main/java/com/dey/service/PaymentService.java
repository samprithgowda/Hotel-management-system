package com.dey.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dey.dao.PaymentRepository;
import com.dey.model.Payment;

@Service
public class PaymentService {

	
	@Autowired
	PaymentRepository pmtRepo;

	public List<Payment> Payment() {
		// TODO Auto-generated method stub
		return pmtRepo.findAll();
	}

	
}
