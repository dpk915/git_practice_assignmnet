package answer1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
public static void main(String[] args) {
 ApplicationContext apx=new ClassPathXmlApplicationContext("applicationContext.xml");
 Clientside cs= apx.getBean("cs",Clientside.class);
 cs.execute();
 

}

}
