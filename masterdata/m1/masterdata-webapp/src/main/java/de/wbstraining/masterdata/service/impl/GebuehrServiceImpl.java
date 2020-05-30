package de.wbstraining.masterdata.service.impl;

import org.apache.commons.lang3.tuple.Triple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.wbstraining.common.persistence.service.AbstractService;
import de.wbstraining.common.search.ClientOperation;
import de.wbstraining.masterdata.persistence.dao.IGebuehrJpaDao;
import de.wbstraining.masterdata.persistence.model.Gebuehr;
import de.wbstraining.masterdata.persistence.util.SearchUtilSec;
import de.wbstraining.masterdata.service.IGebuehrService;

@Service
@Transactional
public class GebuehrServiceImpl extends AbstractService<Gebuehr>
	implements IGebuehrService {

	@Autowired
	IGebuehrJpaDao dao;

	public GebuehrServiceImpl() {
		super(Gebuehr.class);
	}

	// API

	// find

	@Override
	public Gebuehr findByName(final String name) {
		return getDao().findByName(name);
	}

	// Spring

	@Override
	protected final IGebuehrJpaDao getDao() {
		return dao;
	}

	@Override
	public Specification<Gebuehr> resolveConstraint(
		final Triple<String, ClientOperation, String> constraint) {
		return SearchUtilSec.resolveConstraint(constraint, Gebuehr.class);
	}

	@Override
	protected JpaSpecificationExecutor<Gebuehr> getSpecificationExecutor() {
		return dao;
	}
}
