package de.wbstraining.masterdata.web.role;

import org.springframework.beans.factory.annotation.Autowired;

import de.wbstraining.masterdata.client.template.PrivilegeRestClient;
import de.wbstraining.masterdata.client.template.RoleRestClient;
import de.wbstraining.masterdata.persistence.model.Role;
import de.wbstraining.masterdata.test.live.UmReadOnlyLogicRestLiveTest;

public class RoleReadOnlyLogicRestLiveTest extends UmReadOnlyLogicRestLiveTest<Role> {

    @Autowired
    private RoleRestClient api;
    @Autowired
    private PrivilegeRestClient associationApi;

    public RoleReadOnlyLogicRestLiveTest() {
        super(Role.class);
    }

    // tests

    // template

    @Override
    protected final RoleRestClient getApi() {
        return api;
    }

    // util

    final PrivilegeRestClient getAssociationAPI() {
        return associationApi;
    }

}
