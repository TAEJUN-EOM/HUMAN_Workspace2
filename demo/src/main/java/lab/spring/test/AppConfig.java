package lab.spring.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import lab.spring.model.SimpleMessage;
import lab.spring.service.HelloService;
import lab.spring.service.HelloServiceImpl;

@Configuration
public class AppConfig {   
	@Bean
	public  HelloService hello() {
		SimpleMessage msg = new SimpleMessage();
		HelloServiceImpl service = new HelloServiceImpl();
		service.setMsg(msg);
		return service;
	}
}
