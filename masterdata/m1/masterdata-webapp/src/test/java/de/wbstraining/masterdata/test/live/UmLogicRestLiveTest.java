package de.wbstraining.masterdata.test.live;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import de.wbstraining.common.interfaces.INameableDto;
import de.wbstraining.masterdata.spring.CommonTestConfig;
import de.wbstraining.masterdata.spring.MasterdataClientConfig;
import de.wbstraining.masterdata.spring.MasterdataLiveTestConfig;
import de.wbstraining.test.common.web.AbstractLogicLiveTest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { MasterdataLiveTestConfig.class, MasterdataClientConfig.class, CommonTestConfig.class }, loader = AnnotationConfigContextLoader.class)
public abstract class UmLogicRestLiveTest<T extends INameableDto> extends AbstractLogicLiveTest<T> {

    public UmLogicRestLiveTest(final Class<T> clazzToSet) {
        super(clazzToSet);
    }

}
