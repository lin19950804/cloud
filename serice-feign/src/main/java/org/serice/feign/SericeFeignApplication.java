package org.serice.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/*在程序的启动类ServiceFeignApplication ，加上@EnableFeignClients注解开启Feign的功能：*/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SericeFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SericeFeignApplication.class, args);
	}

}
