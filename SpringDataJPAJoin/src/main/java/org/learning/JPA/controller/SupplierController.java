package org.learning.JPA.controller;

import java.util.Optional;

import org.learning.JPA.Entity.Purchase;
import org.learning.JPA.Entity.Supplier;
//import org.learning.JPA.dto.PurchaseRequest;
import org.learning.JPA.dto.Responce;
//import org.learning.JPA.dto.SupplierRequest;
import org.learning.JPA.service.SupplierPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SupplierController {

	@Autowired
	SupplierPurchaseService service;
	
	@PostMapping("/stock/addData")
	public Responce getAddingData()
	{
		return service.AddingData();
	}
	
	@GetMapping("/stock/getSupplierData/{id}")
	public Optional<Supplier> getSupplierById(@PathVariable Long id)
	{
		return service.getSupplierById(id);
	}
	
	@GetMapping("/stock/getPurchaseData/{id}")
	public Optional<Purchase> getPurchaseById(@PathVariable Long id)
	{
		return service.getPurchaseById(id);
	}
}
