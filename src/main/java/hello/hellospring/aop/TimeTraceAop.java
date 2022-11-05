package hello.hellospring.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect // AOP는 Aspect를 적어줘야됨
@Component
public class TimeTraceAop {

    @Around("execution(* hello.hellospring..*(..))") //Around 적어줘야됨
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {
         long start = System.currentTimeMillis();
         System.out.println("START : " +joinPoint.toString());
         try {
             return joinPoint.proceed();
         } finally {
             long finish = System.currentTimeMillis();
             long timeMs = finish - start;
             System.out.println("END : " +joinPoint.toString()+ " "+timeMs+"ms");
         }
    }
}
