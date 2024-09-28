package annotation.exam;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	 public static void main(String[] args) throws BeansException {
		/* ApplicationContext con =new AnnotationConfigApplicationContext(college_config.class);
		    admin obj =cont.getBean(admin.class);
		     obj.display();*/
		     ApplicationContext cont =new AnnotationConfigApplicationContext(college_config.class);
			    student obje =cont.getBean(student.class);
			     obje.display();
			     faculty object =cont.getBean(faculty.class);
			     object.display();
			    /* admin obj =cont.getBean(admin.class);
			     obj.display();*/
	}
	
    
}
