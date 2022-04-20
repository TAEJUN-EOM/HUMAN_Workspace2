package lab.spring.model;

import org.springframework.stereotype.Component;

@Component("msg")
public class SimpleMessage {
    public String getMessage() {
    	return "Hello~ Annotation기반 설정 테스트";
    }
}
