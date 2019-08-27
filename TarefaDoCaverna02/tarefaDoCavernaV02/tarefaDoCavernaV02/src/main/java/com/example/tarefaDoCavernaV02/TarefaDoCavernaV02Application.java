package com.example.tarefaDoCavernaV02;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.example.tarefaDoCavernaV02.Service.CavernaService;
import com.example.tarefaDoCavernaV02.domain.Time;
import com.example.tarefaDoCavernaV02.domain.Token;

@SpringBootApplication
@EnableFeignClients
public class TarefaDoCavernaV02Application {

	@Autowired
	private CavernaService service;
	
	@Autowired
	private Token token;
	
	@Autowired
	private Time time;
	
//	@PostConstruct
//	public void init() {
//		token.setToken(service.login());
//		Date newDate = new Date(System.currentTimeMillis());
//		newDate.setTime(newDate.getTime() + 290000);
//		time.setData(newDate);
//	}
	
	public static void main(String[] args) {
		SpringApplication.run(TarefaDoCavernaV02Application.class, args);
	}

}
