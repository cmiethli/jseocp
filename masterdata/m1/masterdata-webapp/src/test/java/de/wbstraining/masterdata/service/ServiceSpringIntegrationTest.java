package de.wbstraining.masterdata.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import de.wbstraining.masterdata.spring.MasterdataPersistenceJpaConfig;
import de.wbstraining.masterdata.spring.MasterdataServiceConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { MasterdataPersistenceJpaConfig.class, MasterdataServiceConfig.class }, loader = AnnotationConfigContextLoader.class)
public class ServiceSpringIntegrationTest {

    @Test
    public final void whenContextIsBootstrapped_thenOk() {
        //
    }

}
