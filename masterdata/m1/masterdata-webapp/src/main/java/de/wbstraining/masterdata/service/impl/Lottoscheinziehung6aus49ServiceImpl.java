package de.wbstraining.masterdata.service.impl;

import org.apache.commons.lang3.tuple.Triple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.wbstraining.common.persistence.service.AbstractService;
import de.wbstraining.common.search.ClientOperation;
import de.wbstraining.masterdata.persistence.dao.ILottoscheinziehung6aus49JpaDao;
import de.wbstraining.masterdata.persistence.model.Lottoscheinziehung6aus49;
import de.wbstraining.masterdata.persistence.util.SearchUtilSec;
import de.wbstraining.masterdata.service.ILottoscheinziehung6aus49Service;

@Service
@Transactional
public class Lottoscheinziehung6aus49ServiceImpl
	extends AbstractService<Lottoscheinziehung6aus49>
	implements ILottoscheinziehung6aus49Service {

	@Autowired
	ILottoscheinziehung6aus49JpaDao dao;

	public Lottoscheinziehung6aus49ServiceImpl() {
		super(Lottoscheinziehung6aus49.class);
	}

	// API

	// find

	@Override
	public Lottoscheinziehung6aus49 findByName(final String name) {
		return getDao().findByName(name);
	}

	// Spring

	@Override
	protected final ILottoscheinziehung6aus49JpaDao getDao() {
		return dao;
	}

	@Override
	public Specification<Lottoscheinziehung6aus49> resolveConstraint(
		final Triple<String, ClientOperation, String> constraint) {
		return SearchUtilSec.resolveConstraint(constraint,
			Lottoscheinziehung6aus49.class);
	}

	@Override
	protected JpaSpecificationExecutor<Lottoscheinziehung6aus49> getSpecificationExecutor() {
		return dao;
	}
}
