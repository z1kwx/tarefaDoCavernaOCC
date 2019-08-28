package com.example.tarefaDoCavernaV02.Controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.tarefaDoCavernaV02.Models.dto.OCCMultipleResponseDTO;
import com.example.tarefaDoCavernaV02.Models.dto.OCCResponseDTO;
import com.example.tarefaDoCavernaV02.Service.CavernaService;


@RestController
public class CavernaController {

	private static final Logger log = LoggerFactory.getILoggerFactory().getLogger(CavernaController.class.getName());
	
	@Autowired
	private CavernaService cavernaService;
	
	@GetMapping("/occ/{id}")
	public ResponseEntity<OCCResponseDTO> findOneById(@PathVariable("id") String id){
		log.debug("findOneById(String id) - start - params: {}", id);
		OCCResponseDTO occResponseDTO = new OCCResponseDTO();
		occResponseDTO = cavernaService.findOneById(id);
		return ResponseEntity.status(HttpStatus.OK).body(occResponseDTO);
	}
	
	@GetMapping("/occ")
	public ResponseEntity<OCCMultipleResponseDTO> findTen(){
		log.debug("findTen() - start");
		OCCMultipleResponseDTO response = cavernaService.findTen(); 
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
}
