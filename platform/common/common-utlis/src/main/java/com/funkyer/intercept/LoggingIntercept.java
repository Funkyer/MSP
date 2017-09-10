package com.funkyer.intercept;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.lang.ArrayUtils;
import org.apache.log4j.Logger;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

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
            logger.debug("Exit "+method.toString()+" reslut="+ printObject(reslut));
        }
    }

    private void printEnter(Method method, Object[] arguments) {
        if(logger.isDebugEnabled())
        {
            logger.debug("Enter "+method.toString()+" arguments="+ printArguments(arguments));
        }
    }

    private String printArguments(Object[] arguments)
    {
        StringBuffer sb = new StringBuffer(128);
        sb.append("{");
        if(ArrayUtils.isNotEmpty(arguments))
        {
            for(Object object:arguments)
            {
                sb.append(printObject(object));
                sb.append("\n");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    private String printObject(Object object){
        if(null == object){
            return null;
        }
        Class cl = object.getClass();
        Field[] fields = cl.getDeclaredFields();
        StringBuffer stringBuffer = new StringBuffer(64);
        stringBuffer.append(cl.getName());
        stringBuffer.append("[");
        if(ArrayUtils.isNotEmpty(fields))
        {
            for (Field field : fields)
            {
                field.setAccessible(true);
                stringBuffer.append(field.getName());
                stringBuffer.append("=");
                try {

                    stringBuffer.append(field.get(object));

                }catch (IllegalAccessException e)
                {
                    logger.error("can not print "+field.getName()+ " value.");
                }
                stringBuffer.append("\n");
            }
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
