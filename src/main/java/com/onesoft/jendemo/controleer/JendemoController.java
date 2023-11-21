package com.onesoft.jendemo.controleer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JendemoController {
	
	@GetMapping(value = "/get")
	public String getMsg() {
		return "Check Check";
	}

}
