package de.wbstraining.masterdata.service.impl;

import org.apache.commons.lang3.tuple.Triple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.wbstraining.common.persistence.service.AbstractService;
import de.wbstraining.common.search.ClientOperation;
import de.wbstraining.masterdata.persistence.dao.IBankverbindungJpaDao;
import de.wbstraining.masterdata.persistence.model.Bankverbindung;
import de.wbstraining.masterdata.persistence.util.SearchUtilSec;
import de.wbstraining.masterdata.service.IBankverbindungService;

@Service
@Transactional
public class BankverbindungServiceImpl extends AbstractService<Bankverbindung>
	implements IBankverbindungService {

	@Autowired
	IBankverbindungJpaDao dao;

	public BankverbindungServiceImpl() {
		super(Bankverbindung.class);
	}

	// API

	// find

	@Override
	public Bankverbindung findByName(final String name) {
		return getDao().findByName(name);
	}

	// Spring

	@Override
	protected final IBankverbindungJpaDao getDao() {
		return dao;
	}

	@Override
	public Specification<Bankverbindung> resolveConstraint(
		final Triple<String, ClientOperation, String> constraint) {
		return SearchUtilSec.resolveConstraint(constraint, Bankverbindung.class);
	}

	@Override
	protected JpaSpecificationExecutor<Bankverbindung> getSpecificationExecutor() {
		return dao;
	}
}
