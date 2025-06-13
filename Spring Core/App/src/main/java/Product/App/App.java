package Product.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
        
        Cart c1 = (Cart)con.getBean("c1");
        System.out.println(c1.toString());
        
        
    }
}
