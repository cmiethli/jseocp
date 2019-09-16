package de.wbstraining.masterdata.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import de.wbstraining.client.spring.CommonClientConfig;
import de.wbstraining.masterdata.spring.MasterdataClientConfig;
import de.wbstraining.masterdata.spring.MasterdataContextConfig;
import de.wbstraining.masterdata.spring.MasterdataPersistenceJpaConfig;
import de.wbstraining.masterdata.spring.MasterdataServiceConfig;
import de.wbstraining.masterdata.spring.MasterdataWebConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { CommonClientConfig.class, MasterdataPersistenceJpaConfig.class, MasterdataContextConfig.class, MasterdataServiceConfig.class, MasterdataClientConfig.class, MasterdataWebConfig.class })
@WebAppConfiguration
public class WebSpringIntegrationTest {

    @Test
    public final void whenContextIsBootstrapped_thenOk() {
        //
    }

}
