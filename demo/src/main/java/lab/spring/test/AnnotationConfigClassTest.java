package lab.spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lab.spring.service.HelloService;

public class AnnotationConfigClassTest {

	public static void main(String[] args) {
		// Spring ioc 컨테이너 객체 생성
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		HelloService service = context.getBean("hello", HelloService.class);
		service.sayHello();//서비스 메서드 호출

	}

}
