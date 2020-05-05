package de.wbstraining.masterdata.web.privilege;

import org.springframework.beans.factory.annotation.Autowired;

import de.wbstraining.client.IDtoOperations;
import de.wbstraining.masterdata.client.template.PrivilegeRestClient;
import de.wbstraining.masterdata.model.PrivilegeDtoOpsImpl;
import de.wbstraining.masterdata.persistence.model.Privilege;
import de.wbstraining.masterdata.test.live.UmDiscoverabilityRestLiveTest;

public class PrivilegeDiscoverabilityRestLiveTest extends UmDiscoverabilityRestLiveTest<Privilege> {

    @Autowired
    private PrivilegeRestClient restTemplate;
    @Autowired
    private PrivilegeDtoOpsImpl entityOps;

    public PrivilegeDiscoverabilityRestLiveTest() {
        super(Privilege.class);
    }

    // tests

    // template method

    @Override
    protected final Privilege createNewResource() {
        return getEntityOps().createNewResource();
    }

    @Override
    protected final String getUri() {
        return getApi().getUri();
    }

    @Override
    protected final PrivilegeRestClient getApi() {
        return restTemplate;
    }

    @Override
    protected final IDtoOperations<Privilege> getEntityOps() {
        return entityOps;
    }

}
