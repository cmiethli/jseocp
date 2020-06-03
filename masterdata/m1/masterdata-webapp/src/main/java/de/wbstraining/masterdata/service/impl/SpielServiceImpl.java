package de.wbstraining.masterdata.service.impl;

import org.apache.commons.lang3.tuple.Triple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.wbstraining.common.persistence.service.AbstractService;
import de.wbstraining.common.search.ClientOperation;
import de.wbstraining.masterdata.persistence.dao.ISpielJpaDao;
import de.wbstraining.masterdata.persistence.model.Spiel;
import de.wbstraining.masterdata.persistence.util.SearchUtilSec;
import de.wbstraining.masterdata.service.ISpielService;

@Service
@Transactional
public class SpielServiceImpl extends AbstractService<Spiel>
	implements ISpielService {

	@Autowired
	ISpielJpaDao dao;

	public SpielServiceImpl() {
		super(Spiel.class);
	}

	// API

	// find

	@Override
	public Spiel findByName(final String name) {
		return getDao().findByName(name);
	}

	// Spring

	@Override
	protected final ISpielJpaDao getDao() {
		return dao;
	}

	@Override
	public Specification<Spiel> resolveConstraint(
		final Triple<String, ClientOperation, String> constraint) {
		return SearchUtilSec.resolveConstraint(constraint, Spiel.class);
	}

	@Override
	protected JpaSpecificationExecutor<Spiel> getSpecificationExecutor() {
		return dao;
	}
}
