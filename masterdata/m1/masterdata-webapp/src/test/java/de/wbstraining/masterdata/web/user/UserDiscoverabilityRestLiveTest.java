package de.wbstraining.masterdata.web.user;

import org.springframework.beans.factory.annotation.Autowired;

import de.wbstraining.client.IDtoOperations;
import de.wbstraining.masterdata.client.template.UserRestClient;
import de.wbstraining.masterdata.model.UserDtoOpsImpl;
import de.wbstraining.masterdata.persistence.model.User;
import de.wbstraining.masterdata.test.live.UmDiscoverabilityRestLiveTest;

public class UserDiscoverabilityRestLiveTest extends UmDiscoverabilityRestLiveTest<User> {

    @Autowired
    private UserRestClient restTemplate;
    @Autowired
    private UserDtoOpsImpl entityOps;

    public UserDiscoverabilityRestLiveTest() {
        super(User.class);
    }

    // tests

    // template method

    @Override
    protected final String getUri() {
        return getApi().getUri();
    }

    @Override
    protected final User createNewResource() {
        return getEntityOps().createNewResource();
    }

    @Override
    protected final UserRestClient getApi() {
        return restTemplate;
    }

    @Override
    protected final IDtoOperations<User> getEntityOps() {
        return entityOps;
    }

}
