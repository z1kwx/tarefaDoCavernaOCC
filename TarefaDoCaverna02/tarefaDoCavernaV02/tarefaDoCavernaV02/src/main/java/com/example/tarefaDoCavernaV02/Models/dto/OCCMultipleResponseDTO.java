package com.example.tarefaDoCavernaV02.Models.dto;

import java.util.List;

import com.example.tarefaDoCavernaV02.Models.Link;
import com.example.tarefaDoCavernaV02.Models.Sort;

public class OCCMultipleResponseDTO {

	
	private Double total;
	private Double totalResults;
	private Double offset;
	private Double limit;
	private List<Link> links;
	private List<Sort> sort;
	private List<OCCResponseDTO> items;
	
	
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Double getTotalResults() {
		return totalResults;
	}
	public void setTotalResults(Double totalResults) {
		this.totalResults = totalResults;
	}
	public Double getOffset() {
		return offset;
	}
	public void setOffset(Double offset) {
		this.offset = offset;
	}
	public Double getLimit() {
		return limit;
	}
	public void setLimit(Double limit) {
		this.limit = limit;
	}
	public List<Sort> getSort() {
		return sort;
	}
	public void setSort(List<Sort> sort) {
		this.sort = sort;
	}
	public List<OCCResponseDTO> getItems() {
		return items;
	}
	public void setItems(List<OCCResponseDTO> items) {
		this.items = items;
	}
	public List<Link> getLinks() {
		return links;
	}
	public void setLinks(List<Link> links) {
		this.links = links;
	}
	
	
}
