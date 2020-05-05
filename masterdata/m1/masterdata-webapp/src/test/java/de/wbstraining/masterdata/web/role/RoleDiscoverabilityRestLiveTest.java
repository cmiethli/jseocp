package de.wbstraining.masterdata.web.role;

import org.springframework.beans.factory.annotation.Autowired;

import de.wbstraining.client.IDtoOperations;
import de.wbstraining.masterdata.client.template.RoleRestClient;
import de.wbstraining.masterdata.model.RoleDtoOpsImpl;
import de.wbstraining.masterdata.persistence.model.Role;
import de.wbstraining.masterdata.test.live.UmDiscoverabilityRestLiveTest;

public class RoleDiscoverabilityRestLiveTest extends UmDiscoverabilityRestLiveTest<Role> {

    @Autowired
    private RoleRestClient restTemplate;
    @Autowired
    private RoleDtoOpsImpl entityOps;

    public RoleDiscoverabilityRestLiveTest() {
        super(Role.class);
    }

    // tests

    // template method

    @Override
    protected final Role createNewResource() {
        return getEntityOps().createNewResource();
    }

    @Override
    protected final String getUri() {
        return getApi().getUri();
    }

    @Override
    protected final RoleRestClient getApi() {
        return restTemplate;
    }

    @Override
    protected final IDtoOperations<Role> getEntityOps() {
        return entityOps;
    }

}
