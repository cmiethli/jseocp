package de.wbstraining.masterdata.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
// @ComponentScan({ "de.wbstraining.um.model" })
@ComponentScan({ "de.wbstraining.masterdata.model" })
@PropertySource({ "classpath:web-${webTarget:local}.properties" })
public class MasterdataLiveTestConfig {

    public MasterdataLiveTestConfig() {
        super();
    }

    // beans

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        final PropertySourcesPlaceholderConfigurer pspc = new PropertySourcesPlaceholderConfigurer();
        return pspc;
    }
}
