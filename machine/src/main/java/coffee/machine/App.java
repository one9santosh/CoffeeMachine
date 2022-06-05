package coffee.machine;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
    	 Cap c=ac.getBean(Cap.class);
           System.out.println(c);
           c.tasteofcoffee();
           c.costofcoffee();
           System.out.println(c.getAddCream());


    }
}
