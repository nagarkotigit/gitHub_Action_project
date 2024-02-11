package com.example.githubAction.gitHub_Action_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitHubActionProjectApplication {

	/**
	 * A description of the entire Java function.
	 *
	 * @return         	description of return value
	 */
	@GetMapping("/login")
	public String login(){
		return "login welcome";
	}


	public static void main(String[] args) {
		SpringApplication.run(GitHubActionProjectApplication.class, args);
	}

}
