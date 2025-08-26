package org.learning.JPA.service;

import java.util.Optional;

import org.learning.JPA.Entity.Purchase;
import org.learning.JPA.Entity.Supplier;
import org.learning.JPA.Repository.PurchaseRepo;
import org.learning.JPA.Repository.SupplierRepo;
//import org.learning.JPA.dto.PurchaseRequest;
import org.learning.JPA.dto.Responce;
//import org.learning.JPA.dto.SupplierRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierPurchaseService {
	
	@Autowired
	private PurchaseRepo purchaseRepo;
	@Autowired
	private SupplierRepo supplierRepo;
	
	public Responce AddingData()
	{
		Supplier supplier=new Supplier();
		supplier.setName("Shridhar Hardas");
		supplier.setMobile_no(7071701188l);
		
		Purchase purchase=new Purchase();
		purchase.setProduct_name("Steel Road");
		purchase.setTotal_cost(45000l);
		purchase.setSupplier(supplier);
		
		Supplier supplierTable=supplierRepo.save(supplier);
		Purchase purchaseTable=purchaseRepo.save(purchase);
		Responce responce=new Responce();
		responce.setMessage("Adding Data Successfully..!");
		responce.setStatusCode("00000");
		return responce;
		
	}
	
	public Optional<Supplier> getSupplierById(Long id)
	{
		return supplierRepo.findById(id);
	}
	public Optional<Purchase> getPurchaseById(Long id)
	{
		return purchaseRepo.findById(id);
	}

}
