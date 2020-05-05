package de.wbstraining.client.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "de.wbstraining.common.client", "de.wbstraining.client" })
public class CommonClientConfig {

    public CommonClientConfig() {
        super();
    }

}
