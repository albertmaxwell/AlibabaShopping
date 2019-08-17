package com.ocean.shopping.shoppinguserservice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@tk.mybatis.spring.annotation.MapperScan("com.ocean.shopping.shoppinguserservice.mapper")
@SpringBootApplication
public class ShoppingUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingUserServiceApplication.class, args);
	}

}
