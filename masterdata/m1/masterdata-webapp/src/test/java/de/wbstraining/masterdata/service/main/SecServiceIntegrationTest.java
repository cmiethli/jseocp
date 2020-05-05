package de.wbstraining.masterdata.service.main;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import de.wbstraining.common.persistence.model.INameableEntity;
import de.wbstraining.masterdata.spring.MasterdataClientConfig;
import de.wbstraining.masterdata.spring.MasterdataContextConfig;
import de.wbstraining.masterdata.spring.MasterdataPersistenceJpaConfig;
import de.wbstraining.masterdata.spring.MasterdataServiceConfig;
import de.wbstraining.test.common.service.AbstractServiceIntegrationTest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { MasterdataPersistenceJpaConfig.class, MasterdataServiceConfig.class, MasterdataContextConfig.class, MasterdataClientConfig.class }, loader = AnnotationConfigContextLoader.class)
public abstract class SecServiceIntegrationTest<T extends INameableEntity> extends AbstractServiceIntegrationTest<T> {

    //

}
