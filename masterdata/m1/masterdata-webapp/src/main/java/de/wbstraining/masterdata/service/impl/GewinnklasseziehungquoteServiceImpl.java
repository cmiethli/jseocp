package de.wbstraining.masterdata.service.impl;

import org.apache.commons.lang3.tuple.Triple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.wbstraining.common.persistence.service.AbstractService;
import de.wbstraining.common.search.ClientOperation;
import de.wbstraining.masterdata.persistence.dao.IGewinnklasseziehungquoteJpaDao;
import de.wbstraining.masterdata.persistence.model.Gewinnklasseziehungquote;
import de.wbstraining.masterdata.persistence.util.SearchUtilSec;
import de.wbstraining.masterdata.service.IGewinnklasseziehungquoteService;

@Service
@Transactional
public class GewinnklasseziehungquoteServiceImpl
	extends AbstractService<Gewinnklasseziehungquote>
	implements IGewinnklasseziehungquoteService {

	@Autowired
	IGewinnklasseziehungquoteJpaDao dao;

	public GewinnklasseziehungquoteServiceImpl() {
		super(Gewinnklasseziehungquote.class);
	}

	// API

	// find

	@Override
	public Gewinnklasseziehungquote findByName(final String name) {
		return getDao().findByName(name);
	}

	// Spring

	@Override
	protected final IGewinnklasseziehungquoteJpaDao getDao() {
		return dao;
	}

	@Override
	public Specification<Gewinnklasseziehungquote> resolveConstraint(
		final Triple<String, ClientOperation, String> constraint) {
		return SearchUtilSec.resolveConstraint(constraint,
			Gewinnklasseziehungquote.class);
	}

	@Override
	protected JpaSpecificationExecutor<Gewinnklasseziehungquote> getSpecificationExecutor() {
		return dao;
	}
}
