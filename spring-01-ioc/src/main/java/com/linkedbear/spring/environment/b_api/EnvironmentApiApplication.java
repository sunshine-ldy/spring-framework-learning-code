package com.linkedbear.spring.environment.b_api;

import com.linkedbear.spring.environment.b_api.bean.EnvironmentHolder;
import com.linkedbear.spring.environment.b_api.config.EnvironmentPropertyConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EnvironmentApiApplication {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EnvironmentPropertyConfiguration.class);
        EnvironmentHolder environmentHolder = ctx.getBean(EnvironmentHolder.class);
        environmentHolder.printEnvironment();
    }
}
