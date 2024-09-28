package annotation.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class admin {
	@Autowired
	@Qualifier("staff")
	 private college c;
	public college getC() {
		return c;
	}
	public void setC(college c) {
		this.c = c;
	}
	public void display() {
		c.display();
}
}
