package com.example.tarefaDoCavernaV02.Models;

public class Relationship {

	private String paymentGroupId;
	private Double amount;
	private String relationshipType;
	private String id;
	
	
	public String getPaymentGroupId() {
		return paymentGroupId;
	}
	public void setPaymentGroupId(String paymentGroupId) {
		this.paymentGroupId = paymentGroupId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getRelationshipType() {
		return relationshipType;
	}
	public void setRelationshipType(String relationshipType) {
		this.relationshipType = relationshipType;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
