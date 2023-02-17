package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//springのデフォルトの設定などを簡潔に表したもの。
@SpringBootApplication
public class MyFirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstApplication.class, args);
	}

}
