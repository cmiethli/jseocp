package de.wbstraining.masterdata.test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import de.wbstraining.masterdata.common.search.ConstructQueryStringUnitTest;
import de.wbstraining.masterdata.service.impl.PrivilegeServiceUnitTest;
import de.wbstraining.masterdata.service.impl.RoleServiceUnitTest;
import de.wbstraining.masterdata.service.impl.UserServiceUnitTest;

@RunWith(Suite.class)
@SuiteClasses({ UserServiceUnitTest.class, RoleServiceUnitTest.class, PrivilegeServiceUnitTest.class, ConstructQueryStringUnitTest.class })
public final class UnitSuite {
    //
}
