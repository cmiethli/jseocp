package de.wbstraining.common.persistence.service;

import de.wbstraining.common.persistence.model.INameableEntity;

public abstract class AbstractService<T extends INameableEntity> extends AbstractRawService<T> implements IService<T> {

    public AbstractService(final Class<T> clazzToSet) {
        super(clazzToSet);
    }

    // API

    // find - one

}
