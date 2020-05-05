package de.wbstraining.masterdata.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "de.wbstraining.masterdata.service" })
public class MasterdataServiceConfig {

    public MasterdataServiceConfig() {
        super();
    }

    // beans

}
