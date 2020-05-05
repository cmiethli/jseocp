package de.wbstraining.masterdata.web.privilege;

import org.springframework.beans.factory.annotation.Autowired;

import de.wbstraining.client.IDtoOperations;
import de.wbstraining.masterdata.client.template.PrivilegeRestClient;
import de.wbstraining.masterdata.model.PrivilegeDtoOpsImpl;
import de.wbstraining.masterdata.persistence.model.Privilege;
import de.wbstraining.masterdata.test.live.UmLogicRestLiveTest;

public class PrivilegeLogicRestLiveTest extends UmLogicRestLiveTest<Privilege> {

    @Autowired
    private PrivilegeRestClient api;
    @Autowired
    private PrivilegeDtoOpsImpl entityOps;

    public PrivilegeLogicRestLiveTest() {
        super(Privilege.class);
    }

    // tests

    // template

    @Override
    protected final PrivilegeRestClient getApi() {
        return api;
    }

    @Override
    protected final IDtoOperations<Privilege> getEntityOps() {
        return entityOps;
    }

}
