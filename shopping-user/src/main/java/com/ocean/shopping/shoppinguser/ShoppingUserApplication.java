package com.ocean.shopping.shoppinguser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
@tk.mybatis.spring.annotation.MapperScan("com.ocean.shopping.shoppinguser.mapper")
public class ShoppingUserApplication {

	public static void main(String[] args) {

		SpringApplication.run(ShoppingUserApplication.class, args);
	}

}
