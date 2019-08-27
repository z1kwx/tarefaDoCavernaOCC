package com.example.tarefaDoCavernaV02.Models.dto;

import java.util.List;

import com.example.tarefaDoCavernaV02.Models.Link;

public class TokenResponseDTO {

    private String access_token;
    private List<Link> links;
    private String token_type;
    private Integer expires_in;
    
    
    
    
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public List<Link> getLinks() {
		return links;
	}
	public void setLinks(List<Link> links) {
		this.links = links;
	}
	public String getToken_type() {
		return token_type;
	}
	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}
	public Integer getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(Integer expires_in) {
		this.expires_in = expires_in;
	}
    
	
}
