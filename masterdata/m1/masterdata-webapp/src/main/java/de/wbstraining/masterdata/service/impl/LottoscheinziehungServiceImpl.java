package de.wbstraining.masterdata.service.impl;

import org.apache.commons.lang3.tuple.Triple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.wbstraining.common.persistence.service.AbstractService;
import de.wbstraining.common.search.ClientOperation;
import de.wbstraining.masterdata.persistence.dao.ILottoscheinziehungJpaDao;
import de.wbstraining.masterdata.persistence.model.Lottoscheinziehung;
import de.wbstraining.masterdata.persistence.util.SearchUtilSec;
import de.wbstraining.masterdata.service.ILottoscheinziehungService;

@Service
@Transactional
public class LottoscheinziehungServiceImpl extends
	AbstractService<Lottoscheinziehung> implements ILottoscheinziehungService {

	@Autowired
	ILottoscheinziehungJpaDao dao;

	public LottoscheinziehungServiceImpl() {
		super(Lottoscheinziehung.class);
	}

	// API

	// find

	@Override
	public Lottoscheinziehung findByName(final String name) {
		return getDao().findByName(name);
	}

	// Spring

	@Override
	protected final ILottoscheinziehungJpaDao getDao() {
		return dao;
	}

	@Override
	public Specification<Lottoscheinziehung> resolveConstraint(
		final Triple<String, ClientOperation, String> constraint) {
		return SearchUtilSec.resolveConstraint(constraint,
			Lottoscheinziehung.class);
	}

	@Override
	protected JpaSpecificationExecutor<Lottoscheinziehung> getSpecificationExecutor() {
		return dao;
	}
}
