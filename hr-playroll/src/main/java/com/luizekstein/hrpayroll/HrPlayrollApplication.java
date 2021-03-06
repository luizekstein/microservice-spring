package com.luizekstein.hrpayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@RibbonClient(name = "hr-worker")
@EnableFeignClients
@SpringBootApplication
public class HrPlayrollApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrPlayrollApplication.class, args);
	}

}
