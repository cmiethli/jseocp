package de.wbstraining.masterdata.client.template;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import de.wbstraining.masterdata.client.MasterdataPaths;
import de.wbstraining.masterdata.persistence.model.Privilege;
import de.wbstraining.masterdata.util.Masterdata;
import de.wbstraining.test.common.client.template.AbstractRestClient;

@Component
@Profile("client")
public final class PrivilegeRestClient extends AbstractRestClient<Privilege> {

    @Autowired
    protected MasterdataPaths paths;

    public PrivilegeRestClient() {
        super(Privilege.class);
    }

    // template method

    @Override
    public final String getUri() {
        return paths.getPrivilegeUri();
    }

    @Override
    public final Pair<String, String> getDefaultCredentials() {
        return new ImmutablePair<>(Masterdata.ADMIN_EMAIL, Masterdata.ADMIN_PASS);
    }

}
