package de.wbstraining.masterdata.service.impl;

import org.apache.commons.lang3.tuple.Triple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.wbstraining.common.persistence.service.AbstractService;
import de.wbstraining.common.search.ClientOperation;
import de.wbstraining.masterdata.persistence.dao.IGewinnklasseJpaDao;
import de.wbstraining.masterdata.persistence.model.Gewinnklasse;
import de.wbstraining.masterdata.persistence.util.SearchUtilSec;
import de.wbstraining.masterdata.service.IGewinnklasseService;

@Service
@Transactional
public class GewinnklasseServiceImpl extends AbstractService<Gewinnklasse>
	implements IGewinnklasseService {

	@Autowired
	IGewinnklasseJpaDao dao;

	public GewinnklasseServiceImpl() {
		super(Gewinnklasse.class);
	}

	// API

	// find

	@Override
	public Gewinnklasse findByName(final String name) {
		return getDao().findByName(name);
	}

	// Spring

	@Override
	protected final IGewinnklasseJpaDao getDao() {
		return dao;
	}

	@Override
	public Specification<Gewinnklasse> resolveConstraint(
		final Triple<String, ClientOperation, String> constraint) {
		return SearchUtilSec.resolveConstraint(constraint, Gewinnklasse.class);
	}

	@Override
	protected JpaSpecificationExecutor<Gewinnklasse> getSpecificationExecutor() {
		return dao;
	}
}
