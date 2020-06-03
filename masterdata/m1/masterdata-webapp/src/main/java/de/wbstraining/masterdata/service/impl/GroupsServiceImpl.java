package de.wbstraining.masterdata.service.impl;

import org.apache.commons.lang3.tuple.Triple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.wbstraining.common.persistence.service.AbstractService;
import de.wbstraining.common.search.ClientOperation;
import de.wbstraining.masterdata.persistence.dao.IGroupsJpaDao;
import de.wbstraining.masterdata.persistence.model.Groups;
import de.wbstraining.masterdata.persistence.util.SearchUtilSec;
import de.wbstraining.masterdata.service.IGroupsService;

@Service
@Transactional
public class GroupsServiceImpl extends AbstractService<Groups>
	implements IGroupsService {

	@Autowired
	IGroupsJpaDao dao;

	public GroupsServiceImpl() {
		super(Groups.class);
	}

	// API

	// find

	@Override
	public Groups findByName(final String name) {
		return getDao().findByName(name);
	}

	// Spring

	@Override
	protected final IGroupsJpaDao getDao() {
		return dao;
	}

	@Override
	public Specification<Groups> resolveConstraint(
		final Triple<String, ClientOperation, String> constraint) {
		return SearchUtilSec.resolveConstraint(constraint, Groups.class);
	}

	@Override
	protected JpaSpecificationExecutor<Groups> getSpecificationExecutor() {
		return dao;
	}
}
