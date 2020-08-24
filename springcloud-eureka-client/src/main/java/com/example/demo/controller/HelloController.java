package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author   czq
 * @Date 2020-08-24 15:56:13    
 */
@RestController
public class HelloController {

	@Value("${server.port}")
	public String port;
	
	@RequestMapping(path = "/hello")
	public String hello() {
		return "hello springcloud-client "+port;
	}
}
