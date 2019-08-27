package com.example.tarefaDoCavernaV02.Models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class CommerceItem {

	private LocalDate deactivationDate;
	private Double returnedQuantity;
	private LocalDate availabilityDate;
	private String billingProfileId;
	private List<LocalDate> externalData;
	private String esf_additionalInfo;
	private String billingAccountId;
	private Double preOrderQuantity;
	private String assetKey;
	private String commerceItemId;
	private Object esf_sellerReasonCode;
	private PriceInfo priceInfo;
	private String catalogId;
	private Object externalRecurringChargeDetails;
	private Object esf_omsSubOrders;
	private ExternalPriceDetails externalPriceDetails;
	private String actionCode;
	private String id;
	private String state;
	private String serviceId;
	private Object locationInventoryInfoMap;
	private String serviceAccountId;
	private Double quantity;
	private Boolean pointOfNoRevision;
	private String productId;
	private String esf_itemJson;
	private String parentAssetKey;
	private String externalId;
	private String esf_productType;
	private String originalCommerceItemId;
	private String rootAssetKey;
	private LocalDateTime transactionDate;
	private String catalogRefId;
	private Object esf_itemLink;
	private String customerAccountId;
	private Object recurringChargePriceInfo;
	private List<Object> lineAttributes;
	private String catalogKey;
	private String productDisplayName;
	private Object shopperInput;
	private LocalDate activationDate;
	private Boolean asset;
	private Double backOrderQuantity;
	
	
	public LocalDate getDeactivationDate() {
		return deactivationDate;
	}
	public void setDeactivationDate(LocalDate deactivationDate) {
		this.deactivationDate = deactivationDate;
	}
	public Double getReturnedQuantity() {
		return returnedQuantity;
	}
	public void setReturnedQuantity(Double returnedQuantity) {
		this.returnedQuantity = returnedQuantity;
	}
	public LocalDate getAvailabilityDate() {
		return availabilityDate;
	}
	public void setAvailabilityDate(LocalDate availabilityDate) {
		this.availabilityDate = availabilityDate;
	}
	public String getBillingProfileId() {
		return billingProfileId;
	}
	public void setBillingProfileId(String billingProfileId) {
		this.billingProfileId = billingProfileId;
	}
	public List<LocalDate> getExternalData() {
		return externalData;
	}
	public void setExternalData(List<LocalDate> externalData) {
		this.externalData = externalData;
	}
	public String getEsf_additionalInfo() {
		return esf_additionalInfo;
	}
	public void setEsf_additionalInfo(String esf_additionalInfo) {
		this.esf_additionalInfo = esf_additionalInfo;
	}
	public String getBillingAccountId() {
		return billingAccountId;
	}
	public void setBillingAccountId(String billingAccountId) {
		this.billingAccountId = billingAccountId;
	}
	public Double getPreOrderQuantity() {
		return preOrderQuantity;
	}
	public void setPreOrderQuantity(Double preOrderQuantity) {
		this.preOrderQuantity = preOrderQuantity;
	}
	public String getAssetKey() {
		return assetKey;
	}
	public void setAssetKey(String assetKey) {
		this.assetKey = assetKey;
	}
	public String getCommerceItemId() {
		return commerceItemId;
	}
	public void setCommerceItemId(String commerceItemId) {
		this.commerceItemId = commerceItemId;
	}
	public Object getEsf_sellerReasonCode() {
		return esf_sellerReasonCode;
	}
	public void setEsf_sellerReasonCode(Object esf_sellerReasonCode) {
		this.esf_sellerReasonCode = esf_sellerReasonCode;
	}
	public PriceInfo getPriceInfo() {
		return priceInfo;
	}
	public void setPriceInfo(PriceInfo priceInfo) {
		this.priceInfo = priceInfo;
	}
	public String getCatalogId() {
		return catalogId;
	}
	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}
	public Object getExternalRecurringChargeDetails() {
		return externalRecurringChargeDetails;
	}
	public void setExternalRecurringChargeDetails(Object externalRecurringChargeDetails) {
		this.externalRecurringChargeDetails = externalRecurringChargeDetails;
	}
	public Object getEsf_omsSubOrders() {
		return esf_omsSubOrders;
	}
	public void setEsf_omsSubOrders(Object esf_omsSubOrders) {
		this.esf_omsSubOrders = esf_omsSubOrders;
	}
	public ExternalPriceDetails getExternalPriceDetails() {
		return externalPriceDetails;
	}
	public void setExternalPriceDetails(ExternalPriceDetails externalPriceDetails) {
		this.externalPriceDetails = externalPriceDetails;
	}
	public String getActionCode() {
		return actionCode;
	}
	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public Object getLocationInventoryInfoMap() {
		return locationInventoryInfoMap;
	}
	public void setLocationInventoryInfoMap(Object locationInventoryInfoMap) {
		this.locationInventoryInfoMap = locationInventoryInfoMap;
	}
	public String getServiceAccountId() {
		return serviceAccountId;
	}
	public void setServiceAccountId(String serviceAccountId) {
		this.serviceAccountId = serviceAccountId;
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
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getEsf_itemJson() {
		return esf_itemJson;
	}
	public void setEsf_itemJson(String esf_itemJson) {
		this.esf_itemJson = esf_itemJson;
	}
	public String getParentAssetKey() {
		return parentAssetKey;
	}
	public void setParentAssetKey(String parentAssetKey) {
		this.parentAssetKey = parentAssetKey;
	}
	public String getExternalId() {
		return externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
	public String getEsf_productType() {
		return esf_productType;
	}
	public void setEsf_productType(String esf_productType) {
		this.esf_productType = esf_productType;
	}
	public String getOriginalCommerceItemId() {
		return originalCommerceItemId;
	}
	public void setOriginalCommerceItemId(String originalCommerceItemId) {
		this.originalCommerceItemId = originalCommerceItemId;
	}
	public String getRootAssetKey() {
		return rootAssetKey;
	}
	public void setRootAssetKey(String rootAssetKey) {
		this.rootAssetKey = rootAssetKey;
	}
	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(LocalDateTime transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getCatalogRefId() {
		return catalogRefId;
	}
	public void setCatalogRefId(String catalogRefId) {
		this.catalogRefId = catalogRefId;
	}
	public Object getEsf_itemLink() {
		return esf_itemLink;
	}
	public void setEsf_itemLink(Object esf_itemLink) {
		this.esf_itemLink = esf_itemLink;
	}
	public String getCustomerAccountId() {
		return customerAccountId;
	}
	public void setCustomerAccountId(String customerAccountId) {
		this.customerAccountId = customerAccountId;
	}
	public Object getRecurringChargePriceInfo() {
		return recurringChargePriceInfo;
	}
	public void setRecurringChargePriceInfo(Object recurringChargePriceInfo) {
		this.recurringChargePriceInfo = recurringChargePriceInfo;
	}
	public List<Object> getLineAttributes() {
		return lineAttributes;
	}
	public void setLineAttributes(List<Object> lineAttributes) {
		this.lineAttributes = lineAttributes;
	}
	public String getCatalogKey() {
		return catalogKey;
	}
	public void setCatalogKey(String catalogKey) {
		this.catalogKey = catalogKey;
	}
	public String getProductDisplayName() {
		return productDisplayName;
	}
	public void setProductDisplayName(String productDisplayName) {
		this.productDisplayName = productDisplayName;
	}
	public Object getShopperInput() {
		return shopperInput;
	}
	public void setShopperInput(Object shopperInput) {
		this.shopperInput = shopperInput;
	}
	public LocalDate getActivationDate() {
		return activationDate;
	}
	public void setActivationDate(LocalDate activationDate) {
		this.activationDate = activationDate;
	}
	public Boolean getAsset() {
		return asset;
	}
	public void setAsset(Boolean asset) {
		this.asset = asset;
	}
	public Double getBackOrderQuantity() {
		return backOrderQuantity;
	}
	public void setBackOrderQuantity(Double backOrderQuantity) {
		this.backOrderQuantity = backOrderQuantity;
	}
	
	
}
