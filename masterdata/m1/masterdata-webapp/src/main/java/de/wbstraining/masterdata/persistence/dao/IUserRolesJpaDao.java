package de.wbstraining.masterdata.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import de.wbstraining.common.interfaces.IByNameApi;
import de.wbstraining.masterdata.persistence.model.UserRoles;

public interface IUserRolesJpaDao extends JpaRepository<UserRoles, Long>,
	JpaSpecificationExecutor<UserRoles>, IByNameApi<UserRoles> {
	//
}
