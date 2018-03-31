package com.shopping.cloud.demo.web.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@Value("${info.app_name:World!}")
	String bar;

	@RequestMapping("/")
	String hello() {
		return "Hello " + bar + "!";
	}
}
