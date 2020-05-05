package de.wbstraining.masterdata.model;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

import org.springframework.stereotype.Component;

import com.google.common.collect.Sets;

import de.wbstraining.client.IDtoOperations;
import de.wbstraining.masterdata.persistence.model.Privilege;
import de.wbstraining.masterdata.persistence.model.Role;

@Component
public final class RoleDtoOpsImpl implements IDtoOperations<Role> {

    public RoleDtoOpsImpl() {
        super();
    }

    // API

    public final Role createNewEntity(final String name) {
        return new Role(name, Sets.<Privilege> newHashSet());
    }

    // template

    @Override
    public final Role createNewResource() {
        return new Role(randomAlphabetic(8), Sets.<Privilege> newHashSet());
    }

    @Override
    public final void invalidate(final Role entity) {
        entity.setName(null);
    }

    @Override
    public final void change(final Role resource) {
        resource.setName(randomAlphabetic(8));
    }

}
