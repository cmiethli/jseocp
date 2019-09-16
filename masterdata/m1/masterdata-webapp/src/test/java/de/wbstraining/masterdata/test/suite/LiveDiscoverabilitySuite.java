package de.wbstraining.masterdata.test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import de.wbstraining.masterdata.common.web.root.RootDiscoverabilityRestLiveTest;
import de.wbstraining.masterdata.web.privilege.PrivilegeDiscoverabilityRestLiveTest;
import de.wbstraining.masterdata.web.role.RoleDiscoverabilityRestLiveTest;
import de.wbstraining.masterdata.web.user.UserDiscoverabilityRestLiveTest;

@RunWith(Suite.class)
@SuiteClasses({ UserDiscoverabilityRestLiveTest.class, RoleDiscoverabilityRestLiveTest.class, PrivilegeDiscoverabilityRestLiveTest.class, RootDiscoverabilityRestLiveTest.class })
public final class LiveDiscoverabilitySuite {
    //
}
