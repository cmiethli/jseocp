package de.wbstraining.masterdata.test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ // @formatter:off
    LiveDiscoverabilitySuite.class,
    LiveLogicSuite.class,
})
// @formatter:on
public final class LiveSuite {
    //
}
