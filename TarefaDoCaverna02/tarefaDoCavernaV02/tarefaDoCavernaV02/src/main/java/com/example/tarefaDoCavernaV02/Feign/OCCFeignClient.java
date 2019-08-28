package com.example.tarefaDoCavernaV02.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.tarefaDoCavernaV02.Models.dto.OCCMultipleResponseDTO;
import com.example.tarefaDoCavernaV02.Models.dto.OCCResponseDTO;

import feign.Headers;

@FeignClient(name = "OCCFeignClient", url = "https://ccadmin-test-zdqa.oracleoutsourcing.com")
public interface OCCFeignClient {
	
	@GetMapping(value = "/ccadmin/v1/orders/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@Headers("Content-Type: application/json")
	OCCResponseDTO getOneByID(@PathVariable("id") String id,
							  @RequestHeader("Authorization") String acessToken);
	
	@GetMapping(value = "/ccadmin/v1/orders", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@Headers("Content-Type: application/json")
	OCCMultipleResponseDTO getTen(@RequestHeader("Authorization") String acessToken,
								  @RequestParam ("limit") Integer limit);
	
	

	
}
