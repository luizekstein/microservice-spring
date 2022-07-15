package com.luizekstein.hrpayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class HrPlayrollApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrPlayrollApplication.class, args);
	}

}
