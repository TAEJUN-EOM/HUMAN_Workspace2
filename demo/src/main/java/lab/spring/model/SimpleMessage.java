package lab.spring.model;

import org.springframework.stereotype.Component;

@Component("msg")
public class SimpleMessage {
    public String getMessage() {
    	return "Hello~ Annotation��� ���� �׽�Ʈ";
    }
}
