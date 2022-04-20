package lab.spring.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lab.spring.core.UserVO;
import lab.spring.dao.UserManageDAO;
import lab.spring.service.UserService;

public class SpringMyBatisTest {

	public static void main(String[] args) throws IOException {
		String[] configs = new String[]{"application.xml"};
		ApplicationContext context = 
				   new ClassPathXmlApplicationContext(configs);
		UserService service = 
				context.getBean("userService", UserService.class);
		
		System.out.println("#######전체 목록 ###########");
		List<UserVO> lists = service.findUserList();
		Iterator<UserVO> iter = lists.iterator();
		while (iter.hasNext()) {
			UserVO u = iter.next();
			System.out.println(u);
		}		
		UserVO vo = new UserVO();		 
		vo.setUserid("s1"); //PK 
		vo.setUsername("서울1");
		vo.setUserpwd("1234");
		vo.setEmail("seoul1@korea.or.kr");
		vo.setPhone("02-1111-2222");
		vo.setAddress("서울");
		vo.setGender("여자");
		System.out.println("insert rows = >" + service.registUser(vo));
		vo = new UserVO();	
		vo.setUserid("s5");		
		vo.setEmail("seoul5@hanmail.net");
		vo.setPhone("02-0000-1234");
		vo.setAddress("경기도");
		System.out.println("update :s5 =>"+service.updateUser(vo));
		System.out.println("delete : spring5 =>"+service.removeUser("spring5"));
		
		System.out.println("#######전체 목록 ###########");
		  lists = service.findUserList();
		  iter = lists.iterator();
		while (iter.hasNext()) {
			UserVO u = iter.next();
			System.out.println(u);
		}

	}

}
