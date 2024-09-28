package annotation.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class faculty implements college {
	@Autowired
private subject sub;
	
	public void display() {
		System.out.println(" the faculty teaches"+sub);
	}
}
