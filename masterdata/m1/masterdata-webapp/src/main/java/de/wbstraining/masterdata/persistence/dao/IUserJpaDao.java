package de.wbstraining.masterdata.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import de.wbstraining.common.interfaces.IByNameApi;
import de.wbstraining.masterdata.persistence.model.User;

public interface IUserJpaDao extends
	JpaRepository<User, Long>, JpaSpecificationExecutor<User>, IByNameApi<User> {
    //
}
