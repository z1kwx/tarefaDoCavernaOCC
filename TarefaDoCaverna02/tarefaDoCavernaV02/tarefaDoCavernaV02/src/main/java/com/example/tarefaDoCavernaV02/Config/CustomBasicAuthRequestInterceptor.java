package com.example.tarefaDoCavernaV02.Config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import com.example.tarefaDoCavernaV02.domain.Apikey;

import feign.RequestInterceptor;
import feign.RequestTemplate;

public class CustomBasicAuthRequestInterceptor implements RequestInterceptor {

	@Autowired
	private Apikey apikey;
	
	
	@Override
	public void apply(RequestTemplate template) {
		
		Map<String, Collection<String>> headers = new LinkedHashMap<>();
		headers.put("content-type", new ArrayList<String>(Arrays.asList(MediaType.APPLICATION_JSON_UTF8_VALUE)));
		headers.put("Authorization", new ArrayList<String>(Arrays.asList(apikey.getApikey())));
		
		template.headers(headers);
	}

}
