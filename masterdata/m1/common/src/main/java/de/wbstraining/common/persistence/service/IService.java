package de.wbstraining.common.persistence.service;

import de.wbstraining.common.interfaces.IByNameApi;
import de.wbstraining.common.persistence.model.INameableEntity;

public interface IService<T extends INameableEntity> extends IRawService<T>, IByNameApi<T> {

    //

}
