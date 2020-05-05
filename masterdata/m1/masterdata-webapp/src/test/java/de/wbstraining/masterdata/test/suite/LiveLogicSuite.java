package de.wbstraining.masterdata.test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import de.wbstraining.masterdata.web.privilege.PrivilegeLogicRestLiveTest;
import de.wbstraining.masterdata.web.privilege.PrivilegeReadOnlyLogicRestLiveTest;
import de.wbstraining.masterdata.web.role.RoleLogicRestLiveTest;
import de.wbstraining.masterdata.web.role.RoleReadOnlyLogicRestLiveTest;
import de.wbstraining.masterdata.web.user.UserLogicRestLiveTest;
import de.wbstraining.masterdata.web.user.UserReadOnlyLogicRestLiveTest;

@RunWith(Suite.class)
@SuiteClasses({ // @formatter:off
    PrivilegeLogicRestLiveTest.class
    , PrivilegeReadOnlyLogicRestLiveTest.class

    , RoleLogicRestLiveTest.class
    , RoleReadOnlyLogicRestLiveTest.class

    , UserLogicRestLiveTest.class
    , UserReadOnlyLogicRestLiveTest.class
})
// @formatter:off
public final class LiveLogicSuite {
    //
}
