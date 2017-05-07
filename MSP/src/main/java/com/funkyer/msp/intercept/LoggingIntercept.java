package com.funkyer.msp.intercept;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by dell on 2017/5/7.
 */
public class LoggingIntercept implements MethodInterceptor {

    private static Logger logger = Logger.getLogger(LoggingIntercept.class);

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        if(logger.isDebugEnabled())
        {
            logger.debug("LoggingIntercept invoking ...");
        }
        Method method = methodInvocation.getMethod();
        printEnter(method,methodInvocation.getArguments());

       Object reslut =  methodInvocation.proceed();

       printExit(method,reslut);

        return reslut;
    }

    private void printExit(Method method,Object reslut) {
        if(logger.isDebugEnabled())
        {
            logger.debug("Exit "+method.toString()+" reslut:"+ reslut.toString());
        }
    }

    private void printEnter(Method method, Object[] arguments) {
        if(logger.isDebugEnabled())
        {
            logger.debug("Enter "+method.toString()+" arguments:"+ Arrays.toString(arguments));
        }
    }
}
