package com.GreetService.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "WELCOMESERVICE")
public interface WelcomeFeignClient 
{
	@GetMapping("/welcome")
	public String getWelcomeMsg();
	
}
