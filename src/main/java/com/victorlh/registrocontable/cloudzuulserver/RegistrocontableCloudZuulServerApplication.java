package com.victorlh.registrocontable.cloudzuulserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class RegistrocontableCloudZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrocontableCloudZuulServerApplication.class, args);
	}

}

//TODO - Cambiar direccion ip de boostrap.yml