package lab.spring.test;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lab.spring.service.HelloService;
import lab.spring.service.UserService;

public class MessageTest {

	public static void main(String[] args) {
		//Ŭ�����н��� ���������������� ������� ������ �����̳� ��ü�� ���� 
		//ApplicationContext context =new ClassPathXmlApplicationContext("application.xml");
		ApplicationContext context =new ClassPathXmlApplicationContext("annotConfig.xml");
		HelloService service = null;
		//������ �����̳ʿ��� "hello"�̸��� �� ��û
		service = (HelloService)context.getBean("hello", "HelloService.class"); 
		service.sayHello();
		
		Locale locale_en = Locale.ENGLISH;
		String greet = context.getMessage("greeting", new Object[0], locale_en);
		System.out.println("ENGLISH locale �λ� :"+greet);
		
		Locale locale = Locale.getDefault();
		greet = context.getMessage("greeting", new Object[0], locale);
		System.out.println("default locale �λ� :"+greet);
		
		UserService proc =context.getBean("loginService", UserService.class);
		String[] results =proc.login("test", "0000");
		for (String m: results) {
			System.out.println(m);
		}
	}

}
