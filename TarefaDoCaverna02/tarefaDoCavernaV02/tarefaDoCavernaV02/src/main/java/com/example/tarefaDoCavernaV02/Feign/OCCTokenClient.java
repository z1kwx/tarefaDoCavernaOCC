package com.example.tarefaDoCavernaV02.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.example.tarefaDoCavernaV02.Models.dto.TokenResponseDTO;

import feign.Headers;

@FeignClient(name = "OCCTokenClient", url = "https://ccadmin-test-zdqa.oracleoutsourcing.com")
public interface OCCTokenClient {

	@PostMapping(value = "/ccadmin/v1/login", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	@Headers("Content-Type: application/x-www-form-urlencoded")
	TokenResponseDTO login(@RequestHeader("Authorization") String token,
							@RequestBody MultiValueMap<String, String> body);
	
}
