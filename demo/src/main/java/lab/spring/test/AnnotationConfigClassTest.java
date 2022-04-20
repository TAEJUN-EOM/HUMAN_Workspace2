package lab.spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lab.spring.service.HelloService;

public class AnnotationConfigClassTest {

	public static void main(String[] args) {
		// Spring ioc �����̳� ��ü ����
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		HelloService service = context.getBean("hello", HelloService.class);
		service.sayHello();//���� �޼��� ȣ��

	}

}
