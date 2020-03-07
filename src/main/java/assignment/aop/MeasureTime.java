package assignment.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component("measureTime")
public class MeasureTime {

    private StopWatch stopWatch;

    public MeasureTime() {
        stopWatch = new StopWatch("measure");
    }

    @Around("execution(* assignment.service.*.*Search(..))")
    public void measureTime(ProceedingJoinPoint joinPoint) throws Throwable {
        stopWatch.start();
        joinPoint.proceed();
        stopWatch.stop();
        System.out.println(stopWatch.shortSummary() + stopWatch.getTotalTimeMillis() + stopWatch.prettyPrint());
    }
}
