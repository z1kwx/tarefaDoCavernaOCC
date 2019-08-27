package com.example.tarefaDoCavernaV02.Feign;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.tarefaDoCavernaV02.Models.dto.OCCResponseDTO;

import feign.Headers;

@FeignClient(name = "OCCFeignClient", url = "https://ccadmin-test-zdqa.oracleoutsourcing.com")
public interface OCCFeignClient {
	
	@GetMapping(value = "/ccadmin/v1/orders/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@Headers("Content-Type: application/json")
	OCCResponseDTO getOneByID(@PathVariable("id") String id,
			@RequestHeader ("Authorization") String acessToken);
	
	@GetMapping(value = "/ccadmin/v1/orders", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@Headers("Content-Type: application/json")
	ResponseEntity<Map<String, Object>> getTen(@RequestHeader("Authorization") String acessToken,
											   @RequestParam ("limit") Integer limit);
	
	
	@PostMapping(value = "/ccadmin/v1/login", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	@Headers("Content-Type: application/x-www-form-urlencoded")
	ResponseEntity<Map<String, Object>> login(@RequestHeader("Authorization") String token,
			@RequestBody MultiValueMap<String, String> body);
	
}
