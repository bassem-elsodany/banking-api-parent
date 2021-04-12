package com.epam.boot.api.banking.integration;

import com.epam.boot.api.banking.domain.aggregate.Type;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * A bean that returns a message when you call the {@link #saySomething()} method.
 * <p/>
 * Uses <tt>@Component("myBean")</tt> to register this bean with the name <tt>myBean</tt>
 * that we use in the Camel route to lookup this bean.
 */
@Component("myBean")
public class SampleBean {

    @Value("${greeting}")
    private String say;

    public String saySomething() {
        return say;
    }

    public Type generateResponse(String statusCode,String message ){
        Type type=new Type();
        type.message(message);
        type.statusCode(statusCode);
        return type;
    }

}
