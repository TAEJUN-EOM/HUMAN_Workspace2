package lab.spring.service;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lab.spring.model.SimpleMessage;

@Service("hello")
public class HelloServiceImpl implements HelloService{
	//@Autowired
    private SimpleMessage msg;
    
    public void setMsg(SimpleMessage msg) {
		this.msg = msg;
	}

	@Override
	public void sayHello() {
		System.out.println(msg.getMessage());		
	}

	
}
