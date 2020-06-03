package de.wbstraining.masterdata.service.impl;

import org.apache.commons.lang3.tuple.Triple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.wbstraining.common.persistence.service.AbstractService;
import de.wbstraining.common.search.ClientOperation;
import de.wbstraining.masterdata.persistence.dao.IUserRolesJpaDao;
import de.wbstraining.masterdata.persistence.model.UserRoles;
import de.wbstraining.masterdata.persistence.util.SearchUtilSec;
import de.wbstraining.masterdata.service.IUserRolesService;

@Service
@Transactional
public class UserRolesServiceImpl extends AbstractService<UserRoles>
	implements IUserRolesService {

	@Autowired
	IUserRolesJpaDao dao;

	public UserRolesServiceImpl() {
		super(UserRoles.class);
	}

	// API

	// find

	@Override
	public UserRoles findByName(final String name) {
		return getDao().findByName(name);
	}

	// Spring

	@Override
	protected final IUserRolesJpaDao getDao() {
		return dao;
	}

	@Override
	public Specification<UserRoles> resolveConstraint(
		final Triple<String, ClientOperation, String> constraint) {
		return SearchUtilSec.resolveConstraint(constraint, UserRoles.class);
	}

	@Override
	protected JpaSpecificationExecutor<UserRoles> getSpecificationExecutor() {
		return dao;
	}
}
