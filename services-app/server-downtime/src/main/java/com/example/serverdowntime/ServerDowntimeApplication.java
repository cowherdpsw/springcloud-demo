package com.example.serverdowntime;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = {"com.example.servicescore.component","com.example.serverdowntime"})
@EnableFeignClients
public class ServerDowntimeApplication {

	public static void main(String[] args) throws UnknownHostException {
		SpringApplication app = new SpringApplication(ServerDowntimeApplication.class);
		Environment env = app.run(args).getEnvironment();
		log.info("\n----------------------------------------------------------\n\t" +
						"Application '{}' is running! Access URLs:\n\t" +
						"Local: \t\thttp://localhost:{}\n\t" +
						"External: \thttp://{}:{}\n\t" +
						"SwaggerUI: \thttp://localhost:{}/swagger-ui.html\n" +
						"----------------------------------------------------------",
				env.getProperty("spring.application.name"),
				env.getProperty("server.port"),
				InetAddress.getLocalHost().getHostAddress(),
				env.getProperty("server.port"),
				env.getProperty("server.port"));
	}

}
