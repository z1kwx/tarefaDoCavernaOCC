package com.example.tarefaDoCavernaV02.domain;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Time {

	//System.currentTimeMillis()
	
	Date data = new Date();

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
}
