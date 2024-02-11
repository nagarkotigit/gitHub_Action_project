package com.example.githubAction.gitHub_Action_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class GitHubActionProjectApplication {


	@GetMapping("/login")
	public String login(){
		return "login welcome";
	}
/*	echo "# gitHub_Action_project" >> README.md
	git init
	git add README.md
	git commit -m "first commit"
	git branch -M main
	git remote add origin https://github.com/nagarkotigit/gitHub_Action_project.git
	git push -u origin main*/

	public static void main(String[] args) {
		SpringApplication.run(GitHubActionProjectApplication.class, args);
	}

}
