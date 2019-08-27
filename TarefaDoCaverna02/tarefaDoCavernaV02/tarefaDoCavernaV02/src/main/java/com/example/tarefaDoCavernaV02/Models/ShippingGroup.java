package com.example.tarefaDoCavernaV02.Models;

import java.time.LocalDate;
import java.util.List;

public class ShippingGroup {

	private String shippingMethod;
	private String description;
	private LocalDate submittedDate;
	private ShippingGroupPriceInfoResumeDTO priceInfo;
	private LocalDate shipOnDate;
	private LocalDate actualShipDate;
	private List<Object> trackingInfo;
	private Object specialInstructions;
	private ShippingAddress shippingAddress;
	private List<CommerceItemRelationship> commerceItemRelationships;
	private String state;
	private String id;
	private Object stateDetail;
	private String trackingNumber;
	private List<Object> handlingInstructions;
    private String shippingGroupClassType;
    
    
	public String getShippingMethod() {
		return shippingMethod;
	}
	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getSubmittedDate() {
		return submittedDate;
	}
	public void setSubmittedDate(LocalDate submittedDate) {
		this.submittedDate = submittedDate;
	}
	public ShippingGroupPriceInfoResumeDTO getPriceInfo() {
		return priceInfo;
	}
	public void setPriceInfo(ShippingGroupPriceInfoResumeDTO priceInfo) {
		this.priceInfo = priceInfo;
	}
	public LocalDate getShipOnDate() {
		return shipOnDate;
	}
	public void setShipOnDate(LocalDate shipOnDate) {
		this.shipOnDate = shipOnDate;
	}
	public LocalDate getActualShipDate() {
		return actualShipDate;
	}
	public void setActualShipDate(LocalDate actualShipDate) {
		this.actualShipDate = actualShipDate;
	}
	public List<Object> getTrackingInfo() {
		return trackingInfo;
	}
	public void setTrackingInfo(List<Object> trackingInfo) {
		this.trackingInfo = trackingInfo;
	}
	public Object getSpecialInstructions() {
		return specialInstructions;
	}
	public void setSpecialInstructions(Object specialInstructions) {
		this.specialInstructions = specialInstructions;
	}
	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public List<CommerceItemRelationship> getCommerceItemRelationships() {
		return commerceItemRelationships;
	}
	public void setCommerceItemRelationships(List<CommerceItemRelationship> commerceItemRelationships) {
		this.commerceItemRelationships = commerceItemRelationships;
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
	public Object getStateDetail() {
		return stateDetail;
	}
	public void setStateDetail(Object stateDetail) {
		this.stateDetail = stateDetail;
	}
	public String getTrackingNumber() {
		return trackingNumber;
	}
	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}
	public List<Object> getHandlingInstructions() {
		return handlingInstructions;
	}
	public void setHandlingInstructions(List<Object> handlingInstructions) {
		this.handlingInstructions = handlingInstructions;
	}
	public String getShippingGroupClassType() {
		return shippingGroupClassType;
	}
	public void setShippingGroupClassType(String shippingGroupClassType) {
		this.shippingGroupClassType = shippingGroupClassType;
	}
	
    
    
}
