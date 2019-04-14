package com.threebody.tbmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.threebody.tbmall.mapper")
public class TbmallApplication {

	public static void main(String[] args) {
		SpringApplication.run(TbmallApplication.class, args);
	}

}
