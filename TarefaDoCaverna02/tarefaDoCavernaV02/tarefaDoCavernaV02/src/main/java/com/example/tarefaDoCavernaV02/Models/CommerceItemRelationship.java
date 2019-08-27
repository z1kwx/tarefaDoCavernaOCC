package com.example.tarefaDoCavernaV02.Models;

import java.time.LocalDate;

import com.example.tarefaDoCavernaV02.Models.dto.Range;

public class CommerceItemRelationship {

	private LocalDate availablePickupDate;
	private String inventoryLocationId;
	private Double amount;
	private Double quantity;
	private Boolean pointOfNoRevision;
	private String relationshipType;
	private Double returnedQuantity;
	private LocalDate preferredPickupDate;
	private Range range;
	private String commerceItemExternalId;
	private String commerceItemId;
	private String state;
	private String id;
	
	
	public LocalDate getAvailablePickupDate() {
		return availablePickupDate;
	}
	public void setAvailablePickupDate(LocalDate availablePickupDate) {
		this.availablePickupDate = availablePickupDate;
	}
	public String getInventoryLocationId() {
		return inventoryLocationId;
	}
	public void setInventoryLocationId(String inventoryLocationId) {
		this.inventoryLocationId = inventoryLocationId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	public Boolean getPointOfNoRevision() {
		return pointOfNoRevision;
	}
	public void setPointOfNoRevision(Boolean pointOfNoRevision) {
		this.pointOfNoRevision = pointOfNoRevision;
	}
	public String getRelationshipType() {
		return relationshipType;
	}
	public void setRelationshipType(String relationshipType) {
		this.relationshipType = relationshipType;
	}
	public Double getReturnedQuantity() {
		return returnedQuantity;
	}
	public void setReturnedQuantity(Double returnedQuantity) {
		this.returnedQuantity = returnedQuantity;
	}
	public LocalDate getPreferredPickupDate() {
		return preferredPickupDate;
	}
	public void setPreferredPickupDate(LocalDate preferredPickupDate) {
		this.preferredPickupDate = preferredPickupDate;
	}
	public Range getRange() {
		return range;
	}
	public void setRange(Range range) {
		this.range = range;
	}
	public String getCommerceItemExternalId() {
		return commerceItemExternalId;
	}
	public void setCommerceItemExternalId(String commerceItemExternalId) {
		this.commerceItemExternalId = commerceItemExternalId;
	}
	public String getCommerceItemId() {
		return commerceItemId;
	}
	public void setCommerceItemId(String commerceItemId) {
		this.commerceItemId = commerceItemId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
