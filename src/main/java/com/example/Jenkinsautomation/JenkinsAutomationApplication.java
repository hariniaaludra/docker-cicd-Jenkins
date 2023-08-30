package com.example.Jenkinsautomation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsAutomationApplication {

	@GetMapping("/jenkins")
	public String mainMethod(){
		return "Hello Jenkins-Docker CI/CD !....";
	}
	public static void main(String[] args) {
		SpringApplication.run(JenkinsAutomationApplication.class, args);
	}

}
