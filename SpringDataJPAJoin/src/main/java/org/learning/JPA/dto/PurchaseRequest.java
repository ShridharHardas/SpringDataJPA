package org.learning.JPA.dto;

import org.learning.JPA.Entity.Supplier;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;

@Component
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PurchaseRequest {


	private String product_name;
	private long total_cost;
	private Supplier supplier;
	
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public long getTotal_cost() {
		return total_cost;
	}
	public void setTotal_cost(long total_cost) {
		this.total_cost = total_cost;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	
}
