package com.example.tarefaDoCavernaV02.Service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ResponseStatusException;

import com.example.tarefaDoCavernaV02.Feign.OCCFeignClient;
import com.example.tarefaDoCavernaV02.Feign.OCCTokenClient;
import com.example.tarefaDoCavernaV02.Models.dto.OCCMultipleResponseDTO;
import com.example.tarefaDoCavernaV02.Models.dto.OCCResponseDTO;
import com.example.tarefaDoCavernaV02.Models.dto.TokenResponseDTO;
import com.example.tarefaDoCavernaV02.domain.Time;
import com.example.tarefaDoCavernaV02.domain.Token;

@Service
public class CavernaService {

	private static final Logger log = LoggerFactory.getILoggerFactory().getLogger(CavernaService.class.getName());
	
	@Autowired
	private OCCFeignClient occFeignClient;
	
	@Autowired
	private OCCTokenClient occTokenClient;
	
	@Autowired
	private Time time;
	
	@Autowired
	private Token token;
	
	public OCCResponseDTO findOneById(String id) {
		log.debug("findOneById(String id) - start - params: {}", id);
		
		if(shouldLogin()) {
			token.setToken(login());
		}
		
//		Map<String, String> headers = new HashMap<>();
//		headers.put("Content-Type", "application/json");
		
		log.warn("FeignClient - start - method - getOneByID(String id, String token) - params: {} {}", id, token.getToken());
		OCCResponseDTO newResponse = occFeignClient.getOneByID(id, token.getToken());
		
		return newResponse;
	}
	
	public OCCMultipleResponseDTO findTen() {
		log.debug("findTen() - start ");
		
		if(shouldLogin()) {
			token.setToken(login());
		}

		Integer limit = 10;
		log.warn("FeignClient - start - method - getTen(String token, Integer limit) - params: {} {}", token.getToken(), limit);
		OCCMultipleResponseDTO response = occFeignClient.getTen(token.getToken(), limit);
			
		return response;
	}
	
	protected Boolean shouldLogin() {
		log.debug("shouldLogin() - start ");
		Date newDate = new Date(System.currentTimeMillis());
		if(newDate.after(time.getData())) {
			log.warn("shouldLogin() - token expired");
			return true;
		}else {
			log.warn("shouldLogin() - token not expired");
			return false;
		}
	}
	

	protected String login() {
		log.debug("login() - start ");
		
		MultiValueMap<String, String> bodyRequest = new LinkedMultiValueMap<String, String>();
		bodyRequest.add("mode", "raw");
		bodyRequest.add("grant_type", "client_credentials");

		Date newDate = new Date(System.currentTimeMillis());
		newDate.setTime(newDate.getTime() + 290000);
		time.setData(newDate);
		
		String token = "Bearer ".concat("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYTc0NTc3MS02OTNkLTQxODUtOWM1OC05ODJhNTU0YzczOTgiLCJpc3MiOiJhcHBsaWNhdGlvbkF1dGgiLCJleHAiOjE1OTgwMTg5NDksImlhdCI6MTU2NjQ4Mjk0OX0=.zePYV3XnRPEFpsAgoeibgWVMGXUqHAcE9tU10Y4oRN8=");

		try {
			log.warn("FeignClient - start - method - login(String token, MultiValueMap<String, String> bodyRequest - params: {} {})", token, bodyRequest);
			TokenResponseDTO login = occTokenClient.login(token, bodyRequest);


			return "Bearer ".concat(login.getAccess_token());
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.CONFLICT, e.getLocalizedMessage());
		}

	}



	
}
