package com.skycrumb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//通过RestTemplate+Ribbon去消费服务
@SpringBootApplication
@EnableEurekaClient
//消费者服务通过@EnableDiscoveryClient向服务中心注册
@EnableDiscoveryClient
//开启Hystrix
@EnableHystrix
public class ServiceRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRibbonApplication.class, args);
	}

	@Bean
//	@LoadBalanced注解表明这个restRemplate开启负载均衡的功能。
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
