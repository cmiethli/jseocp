package de.wbstraining.masterdata.service.impl;

import org.apache.commons.lang3.tuple.Triple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.wbstraining.common.persistence.service.AbstractService;
import de.wbstraining.common.search.ClientOperation;
import de.wbstraining.masterdata.persistence.dao.IJackpotJpaDao;
import de.wbstraining.masterdata.persistence.model.Jackpot;
import de.wbstraining.masterdata.persistence.util.SearchUtilSec;
import de.wbstraining.masterdata.service.IJackpotService;

@Service
@Transactional
public class JackpotServiceImpl extends AbstractService<Jackpot>
	implements IJackpotService {

	@Autowired
	IJackpotJpaDao dao;

	public JackpotServiceImpl() {
		super(Jackpot.class);
	}

	// API

	// find

	@Override
	public Jackpot findByName(final String name) {
		return getDao().findByName(name);
	}

	// Spring

	@Override
	protected final IJackpotJpaDao getDao() {
		return dao;
	}

	@Override
	public Specification<Jackpot> resolveConstraint(
		final Triple<String, ClientOperation, String> constraint) {
		return SearchUtilSec.resolveConstraint(constraint, Jackpot.class);
	}

	@Override
	protected JpaSpecificationExecutor<Jackpot> getSpecificationExecutor() {
		return dao;
	}
}
