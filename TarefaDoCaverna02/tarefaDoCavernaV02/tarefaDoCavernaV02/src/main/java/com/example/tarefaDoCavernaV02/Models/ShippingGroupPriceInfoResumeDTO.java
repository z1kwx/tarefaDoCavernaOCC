package com.example.tarefaDoCavernaV02.Models;

public class ShippingGroupPriceInfoResumeDTO {

	private Double secondaryCurrencyTaxAmount;
	private Boolean discounted;
	private Double shippingTax;
	private Double secondaryCurrencyShippingAmount;
	private Double amount;
	private Double rawShipping;
	private Boolean amountIsFinal;
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
	public Double getShippingTax() {
		return shippingTax;
	}
	public void setShippingTax(Double shippingTax) {
		this.shippingTax = shippingTax;
	}
	public Double getSecondaryCurrencyShippingAmount() {
		return secondaryCurrencyShippingAmount;
	}
	public void setSecondaryCurrencyShippingAmount(Double secondaryCurrencyShippingAmount) {
		this.secondaryCurrencyShippingAmount = secondaryCurrencyShippingAmount;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getRawShipping() {
		return rawShipping;
	}
	public void setRawShipping(Double rawShipping) {
		this.rawShipping = rawShipping;
	}
	public Boolean getAmountIsFinal() {
		return amountIsFinal;
	}
	public void setAmountIsFinal(Boolean amountIsFinal) {
		this.amountIsFinal = amountIsFinal;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	
}
