package de.wbstraining.masterdata.common.web.root;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

import java.util.List;

import org.hamcrest.Matchers;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.net.HttpHeaders;

import de.wbstraining.masterdata.client.MasterdataPaths;
import de.wbstraining.masterdata.test.live.UmGeneralRestLiveTest;
import de.wbstraining.masterdata.util.Masterdata;
import de.wbstraining.test.common.client.security.ITestAuthenticator;
import de.wbstraining.test.common.web.util.HTTPLinkHeaderUtil;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Ignore("temp")
public class RootDiscoverabilityRestLiveTest extends UmGeneralRestLiveTest {

    @Autowired
    private MasterdataPaths paths;
    @Autowired
    private ITestAuthenticator auth;

    // tests

    // GET

    @Test
    public final void whenGetIsDoneOnRoot_thenSomeURIAreDiscoverable() {
        // When
        final Response getOnRootResponse = givenAuthenticated().get(paths.getRootUri());

        // Then
        final List<String> allURIsDiscoverableFromRoot = HTTPLinkHeaderUtil.extractAllURIs(getOnRootResponse.getHeader(HttpHeaders.LINK));

        assertThat(allURIsDiscoverableFromRoot, not(Matchers.<String> empty()));
    }

    @Test
    public final void whenGetIsDoneOnRoot_thenEntityURIIsDiscoverable() {
        // When
        final Response getOnRootResponse = givenAuthenticated().get(paths.getRootUri());

        // Then
        final List<String> allURIsDiscoverableFromRoot = HTTPLinkHeaderUtil.extractAllURIs(getOnRootResponse.getHeader(HttpHeaders.LINK));
        final int indexOfEntityUri = Iterables.indexOf(allURIsDiscoverableFromRoot, Predicates.containsPattern(paths.getUserUri()));
        assertThat(indexOfEntityUri, greaterThanOrEqualTo(0));
    }

    // util

    protected final RequestSpecification givenAuthenticated() {
        return auth.givenBasicAuthenticated(Masterdata.ADMIN_USERNAME, Masterdata.ADMIN_PASS);
    }

}
