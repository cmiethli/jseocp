package de.wbstraining.masterdata.test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ LiveSuite.class, UnitSuite.class })
public final class AllSuite {
    //
}
