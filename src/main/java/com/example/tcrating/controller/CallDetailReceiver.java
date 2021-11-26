package com.example.tcrating.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.tcrating.Service.RestDataService;
import com.example.tcrating.prod.pojo.RestDataConsumer;

@RestController
public class CallDetailReceiver {
	
	@Autowired
	public  RestDataService restDataService;

	@PostMapping("/sendingEvent")
	public ResponseEntity<RestDataConsumer> receiver(@RequestBody RestDataConsumer restData )
	{
	
	restDataService.addNumber(restData);
	return new ResponseEntity<RestDataConsumer>(restData,HttpStatus.OK);
		
	}
	
}
