package de.wbstraining.masterdata.service.impl;

import org.apache.commons.lang3.tuple.Triple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.wbstraining.common.persistence.service.AbstractService;
import de.wbstraining.common.search.ClientOperation;
import de.wbstraining.masterdata.persistence.dao.IKundeJpaDao;
import de.wbstraining.masterdata.persistence.model.Kunde;
import de.wbstraining.masterdata.persistence.util.SearchUtilSec;
import de.wbstraining.masterdata.service.IKundeService;

@Service
@Transactional
public class KundeServiceImpl extends AbstractService<Kunde>
	implements IKundeService {

	@Autowired
	IKundeJpaDao dao;

	public KundeServiceImpl() {
		super(Kunde.class);
	}

	// API

	// find

	@Override
	public Kunde findByName(final String name) {
		return getDao().findByName(name);
	}

	// Spring

	@Override
	protected final IKundeJpaDao getDao() {
		return dao;
	}

	@Override
	public Specification<Kunde> resolveConstraint(
		final Triple<String, ClientOperation, String> constraint) {
		return SearchUtilSec.resolveConstraint(constraint, Kunde.class);
	}

	@Override
	protected JpaSpecificationExecutor<Kunde> getSpecificationExecutor() {
		return dao;
	}
}
