package org.ash.experiments.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by az on 15/06/2016.
 */
@RestController
public class HelloWorld {

	@RequestMapping("/")
	public String sayHello(){
		return "Hello";
	}
}
