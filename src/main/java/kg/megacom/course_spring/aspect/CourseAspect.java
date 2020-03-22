package kg.megacom.course_spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
public class CourseAspect {

    private Logger logger=Logger.getLogger(CourseAspect.class.getName());

    @Before(value = "execution( * kg.megacom.course_spring.controllers.*(..)) ")
    public void before(JoinPoint joinPoint){
        logger.info(joinPoint.getSignature().getName());
        System.out.println(joinPoint.getSignature());
    }


}
