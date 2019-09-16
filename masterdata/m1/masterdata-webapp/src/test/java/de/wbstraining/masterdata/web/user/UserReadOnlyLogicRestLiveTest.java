package de.wbstraining.masterdata.web.user;

import org.springframework.beans.factory.annotation.Autowired;

import de.wbstraining.masterdata.client.template.UserRestClient;
import de.wbstraining.masterdata.persistence.model.User;
import de.wbstraining.masterdata.test.live.UmReadOnlyLogicRestLiveTest;

public class UserReadOnlyLogicRestLiveTest extends UmReadOnlyLogicRestLiveTest<User> {

    @Autowired
    private UserRestClient api;

    public UserReadOnlyLogicRestLiveTest() {
        super(User.class);
    }

    // tests

    // template method

    @Override
    protected final UserRestClient getApi() {
        return api;
    }

}
