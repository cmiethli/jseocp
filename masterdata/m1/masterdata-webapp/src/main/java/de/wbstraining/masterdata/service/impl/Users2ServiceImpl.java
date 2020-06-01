package de.wbstraining.masterdata.service.impl;

import org.apache.commons.lang3.tuple.Triple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.wbstraining.common.persistence.service.AbstractService;
import de.wbstraining.common.search.ClientOperation;
import de.wbstraining.masterdata.persistence.dao.IUsers2JpaDao;
import de.wbstraining.masterdata.persistence.model.Users2;
import de.wbstraining.masterdata.persistence.util.SearchUtilSec;
import de.wbstraining.masterdata.service.IUsers2Service;

@Service
@Transactional
public class Users2ServiceImpl extends AbstractService<Users2>
	implements IUsers2Service {

	@Autowired
	IUsers2JpaDao dao;

	public Users2ServiceImpl() {
		super(Users2.class);
	}

	// API

	// find

	@Override
	public Users2 findByName(final String name) {
		return getDao().findByName(name);
	}

	// Spring

	@Override
	protected final IUsers2JpaDao getDao() {
		return dao;
	}

	@Override
	public Specification<Users2> resolveConstraint(
		final Triple<String, ClientOperation, String> constraint) {
		return SearchUtilSec.resolveConstraint(constraint, Users2.class);
	}

	@Override
	protected JpaSpecificationExecutor<Users2> getSpecificationExecutor() {
		return dao;
	}
}
