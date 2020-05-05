package de.wbstraining.masterdata.web.privilege;

import org.springframework.beans.factory.annotation.Autowired;

import de.wbstraining.masterdata.client.template.PrivilegeRestClient;
import de.wbstraining.masterdata.persistence.model.Privilege;
import de.wbstraining.masterdata.test.live.UmReadOnlyLogicRestLiveTest;

public class PrivilegeReadOnlyLogicRestLiveTest extends UmReadOnlyLogicRestLiveTest<Privilege> {

    @Autowired
    private PrivilegeRestClient api;

    public PrivilegeReadOnlyLogicRestLiveTest() {
        super(Privilege.class);
    }

    // tests

    // template

    @Override
    protected final PrivilegeRestClient getApi() {
        return api;
    }

}
