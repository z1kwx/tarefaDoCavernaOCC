package com.example.tarefaDoCavernaV02.Models;

import com.example.tarefaDoCavernaV02.Models.dto.Range;

public class CurrentPriceDetailsSorted {

	private Double secondaryCurrencyTaxAmount;
	private Boolean discounted;
	private Double amount;
	private Double quantity;
	private Boolean amountIsFinal;
	private Range range;
	private Double tax;
	private Double orderDiscountShare;
	private Double detailedUnitPrice;
	private String currencyCode;
	
	
	public Double getSecondaryCurrencyTaxAmount() {
		return secondaryCurrencyTaxAmount;
	}
	public void setSecondaryCurrencyTaxAmount(Double secondaryCurrencyTaxAmount) {
		this.secondaryCurrencyTaxAmount = secondaryCurrencyTaxAmount;
	}
	public Boolean getDiscounted() {
		return discounted;
	}
	public void setDiscounted(Boolean discounted) {
		this.discounted = discounted;
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
	public Boolean getAmountIsFinal() {
		return amountIsFinal;
	}
	public void setAmountIsFinal(Boolean amountIsFinal) {
		this.amountIsFinal = amountIsFinal;
	}
	public Range getRange() {
		return range;
	}
	public void setRange(Range range) {
		this.range = range;
	}
	public Double getTax() {
		return tax;
	}
	public void setTax(Double tax) {
		this.tax = tax;
	}
	public Double getOrderDiscountShare() {
		return orderDiscountShare;
	}
	public void setOrderDiscountShare(Double orderDiscountShare) {
		this.orderDiscountShare = orderDiscountShare;
	}
	public Double getDetailedUnitPrice() {
		return detailedUnitPrice;
	}
	public void setDetailedUnitPrice(Double detailedUnitPrice) {
		this.detailedUnitPrice = detailedUnitPrice;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	
	
	
}
