package de.wbstraining.masterdata.service;

import de.wbstraining.common.persistence.service.IService;
import de.wbstraining.masterdata.persistence.model.User;

public interface IUserService extends IService<User> {

    User getCurrentUser();

}
