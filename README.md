# SpringAOP-AfterAdvice
Aspect Oriented Programming (AOP) compliments OOPs in the sense that it also provides modularity. But the key unit of modularity is aspect than class.

AOP breaks the program logic into distinct parts (called concerns). It is used to increase modularity by cross-cutting concerns.
After Advice: it executes after a join point. We use Interface In Spring for After Advice
### AfterReturningAdvice interface extends the AfterAdvice interface.

```
public class RunAfterExecution implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object retVal, Method methodArg, Object[] args,
                               Object target) throws Throwable {

        System.out.println("Inside RunAfterExecution.afterReturning() method...");
        System.out.println("Running after advice...");
    }
}
```
### OutPUT:
```
Running business logic...
Inside RunAfterExecution.afterReturning() method...
Running after advice...

Process finished with exit code 0
```
