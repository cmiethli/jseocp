package de.wbstraining.masterdata.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import de.wbstraining.client.spring.CommonClientConfig;
import de.wbstraining.common.spring.CommonWebConfig;

@Configuration
@ComponentScan({ "de.wbstraining.masterdata.client" })
@Import({ CommonClientConfig.class, CommonWebConfig.class })
public class MasterdataClientConfig {

    public MasterdataClientConfig() {
        super();
    }

}
