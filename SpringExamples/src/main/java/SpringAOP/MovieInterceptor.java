package SpringAOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;


@Aspect
class MovieInterceptor{
	
	
	
	
	@Before("execution(void Movie.displayMovieInfo(..))") // DisplayMovieInfo Of Movie class which returns String
	public void logBefore(JoinPoint joinPoint) {
System.out.print("******");
		System.out.print("Following are the movie method details=="+joinPoint.getSignature().getName());
		System.out.println("******");
	}
	@After("execution(void Movie.displayMovieInfo(..))") // DisplayMovieInfo Of Movie class which returns String
	public void logAfter(JoinPoint joinPoint) {
		System.out.print("******");
		System.out.print("Details of Movie has been displayed");
		System.out.println("******");
	}
	
}