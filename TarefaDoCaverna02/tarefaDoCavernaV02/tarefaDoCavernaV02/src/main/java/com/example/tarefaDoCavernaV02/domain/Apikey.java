package com.example.tarefaDoCavernaV02.domain;

import org.springframework.stereotype.Component;

@Component
public class Apikey {

	private final String apikey = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYTc0NTc3MS02OTNkLTQxODUtOWM1OC05ODJhNTU0YzczOTgiLCJpc3MiOiJhcHBsaWNhdGlvbkF1dGgiLCJleHAiOjE1OTgwMTg5NDksImlhdCI6MTU2NjQ4Mjk0OX0=.zePYV3XnRPEFpsAgoeibgWVMGXUqHAcE9tU10Y4oRN8=";

	public String getApikey() {
		return apikey;
	}
	
}
