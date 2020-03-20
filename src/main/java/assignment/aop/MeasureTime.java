package assignment.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

@Service("measureTime")
@Aspect
public class MeasureTime {
    private StopWatch stopWatch;

    public MeasureTime() {
        stopWatch = new StopWatch("measure");
    }

    @Around("execution(* assignment.service.*Impl.*Search(..))")
    public void measureTime(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();

        stopWatch.start();
        joinPoint.proceed();
        stopWatch.stop();

        System.out.println(methodName + "() 걸린 시간: " + stopWatch.getLastTaskTimeMillis() + "(ms)초");
    }
}
