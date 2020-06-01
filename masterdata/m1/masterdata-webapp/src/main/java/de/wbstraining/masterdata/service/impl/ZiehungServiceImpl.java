package de.wbstraining.masterdata.service.impl;

import org.apache.commons.lang3.tuple.Triple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.wbstraining.common.persistence.service.AbstractService;
import de.wbstraining.common.search.ClientOperation;
import de.wbstraining.masterdata.persistence.dao.IZiehungJpaDao;
import de.wbstraining.masterdata.persistence.model.Ziehung;
import de.wbstraining.masterdata.persistence.util.SearchUtilSec;
import de.wbstraining.masterdata.service.IZiehungService;

@Service
@Transactional
public class ZiehungServiceImpl extends AbstractService<Ziehung>
	implements IZiehungService {

	@Autowired
	IZiehungJpaDao dao;

	public ZiehungServiceImpl() {
		super(Ziehung.class);
	}

	// API

	// find

	@Override
	public Ziehung findByName(final String name) {
		return getDao().findByName(name);
	}

	// Spring

	@Override
	protected final IZiehungJpaDao getDao() {
		return dao;
	}

	@Override
	public Specification<Ziehung> resolveConstraint(
		final Triple<String, ClientOperation, String> constraint) {
		return SearchUtilSec.resolveConstraint(constraint, Ziehung.class);
	}

	@Override
	protected JpaSpecificationExecutor<Ziehung> getSpecificationExecutor() {
		return dao;
	}
}
