package br.com.lead.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class SpringboottestApplication {
	
	@RequestMapping("/hello-spring-boot")
    @ResponseBody
    public String helloSpringBoot(){
		return "Spring boot em execução.";
		}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringboottestApplication.class, args);
	}

}
