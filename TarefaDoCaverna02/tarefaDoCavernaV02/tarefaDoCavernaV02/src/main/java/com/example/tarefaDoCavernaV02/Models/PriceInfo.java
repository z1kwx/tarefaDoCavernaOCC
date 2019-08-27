package com.example.tarefaDoCavernaV02.Models;

import java.util.List;

public class PriceInfo {

	private Boolean discounted;
	private Double amount;
	private Double secondaryCurrencyShippingSurcharge;
	private Long rawTotalPrice;
	private Long salePrice;
	private String priceListId;
	private Double quantityDiscounted;
	private Boolean amountIsFinal;
	private Boolean onSale;
	private Double shippingSurcharge;
	private Boolean discountable;
	private List<CurrentPriceDetailsSorted> currentPriceDetailsSorted;
	private String currencyCode;
	private Long listPrice;
	
	
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
	public Double getSecondaryCurrencyShippingSurcharge() {
		return secondaryCurrencyShippingSurcharge;
	}
	public void setSecondaryCurrencyShippingSurcharge(Double secondaryCurrencyShippingSurcharge) {
		this.secondaryCurrencyShippingSurcharge = secondaryCurrencyShippingSurcharge;
	}
	public Long getRawTotalPrice() {
		return rawTotalPrice;
	}
	public void setRawTotalPrice(Long rawTotalPrice) {
		this.rawTotalPrice = rawTotalPrice;
	}
	public Long getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(Long salePrice) {
		this.salePrice = salePrice;
	}
	public String getPriceListId() {
		return priceListId;
	}
	public void setPriceListId(String priceListId) {
		this.priceListId = priceListId;
	}
	public Double getQuantityDiscounted() {
		return quantityDiscounted;
	}
	public void setQuantityDiscounted(Double quantityDiscounted) {
		this.quantityDiscounted = quantityDiscounted;
	}
	public Boolean getAmountIsFinal() {
		return amountIsFinal;
	}
	public void setAmountIsFinal(Boolean amountIsFinal) {
		this.amountIsFinal = amountIsFinal;
	}
	public Boolean getOnSale() {
		return onSale;
	}
	public void setOnSale(Boolean onSale) {
		this.onSale = onSale;
	}
	public Double getShippingSurcharge() {
		return shippingSurcharge;
	}
	public void setShippingSurcharge(Double shippingSurcharge) {
		this.shippingSurcharge = shippingSurcharge;
	}
	public Boolean getDiscountable() {
		return discountable;
	}
	public void setDiscountable(Boolean discountable) {
		this.discountable = discountable;
	}
	public List<CurrentPriceDetailsSorted> getCurrentPriceDetailsSorted() {
		return currentPriceDetailsSorted;
	}
	public void setCurrentPriceDetailsSorted(List<CurrentPriceDetailsSorted> currentPriceDetailsSorted) {
		this.currentPriceDetailsSorted = currentPriceDetailsSorted;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public Long getListPrice() {
		return listPrice;
	}
	public void setListPrice(Long listPrice) {
		this.listPrice = listPrice;
	}
	
	
	
}
