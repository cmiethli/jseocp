package de.wbstraining.common.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "de.wbstraining.common.web" })
public class CommonWebConfig {

    public CommonWebConfig() {
        super();
    }

}
