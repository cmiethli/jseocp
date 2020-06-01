package de.wbstraining.masterdata.service.impl;

import org.apache.commons.lang3.tuple.Triple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.wbstraining.common.persistence.service.AbstractService;
import de.wbstraining.common.search.ClientOperation;
import de.wbstraining.masterdata.persistence.dao.IUsersJpaDao;
import de.wbstraining.masterdata.persistence.model.Users;
import de.wbstraining.masterdata.persistence.util.SearchUtilSec;
import de.wbstraining.masterdata.service.IUsersService;

@Service
@Transactional
public class UsersServiceImpl extends AbstractService<Users>
	implements IUsersService {

	@Autowired
	IUsersJpaDao dao;

	public UsersServiceImpl() {
		super(Users.class);
	}

	// API

	// find

	@Override
	public Users findByName(final String name) {
		return getDao().findByName(name);
	}

	// Spring

	@Override
	protected final IUsersJpaDao getDao() {
		return dao;
	}

	@Override
	public Specification<Users> resolveConstraint(
		final Triple<String, ClientOperation, String> constraint) {
		return SearchUtilSec.resolveConstraint(constraint, Users.class);
	}

	@Override
	protected JpaSpecificationExecutor<Users> getSpecificationExecutor() {
		return dao;
	}
}
