package de.wbstraining.masterdata.service.impl;

import org.apache.commons.lang3.tuple.Triple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.wbstraining.common.persistence.service.AbstractService;
import de.wbstraining.common.search.ClientOperation;
import de.wbstraining.masterdata.persistence.dao.ILottoscheinJpaDao;
import de.wbstraining.masterdata.persistence.model.Lottoschein;
import de.wbstraining.masterdata.persistence.util.SearchUtilSec;
import de.wbstraining.masterdata.service.ILottoscheinService;

@Service
@Transactional
public class LottoscheinServiceImpl extends AbstractService<Lottoschein>
	implements ILottoscheinService {

	@Autowired
	ILottoscheinJpaDao dao;

	public LottoscheinServiceImpl() {
		super(Lottoschein.class);
	}

	// API

	// find

	@Override
	public Lottoschein findByName(final String name) {
		return getDao().findByName(name);
	}

	// Spring

	@Override
	protected final ILottoscheinJpaDao getDao() {
		return dao;
	}

	@Override
	public Specification<Lottoschein> resolveConstraint(
		final Triple<String, ClientOperation, String> constraint) {
		return SearchUtilSec.resolveConstraint(constraint, Lottoschein.class);
	}

	@Override
	protected JpaSpecificationExecutor<Lottoschein> getSpecificationExecutor() {
		return dao;
	}
}
