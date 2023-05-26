package com.MutualAuth.MtlsPracticeService2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MtlsPracticeService2Application {

	public static void main(String[] args) {
		SpringApplication.run(MtlsPracticeService2Application.class, args);
	}

}
