package SpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to movie information display!" );
		ApplicationContext  ac = new ClassPathXmlApplicationContext("springmodule.xml");
		Movie movie = (Movie)ac.getBean("movie");
		movie.displayMovieInfo();
    }
}
