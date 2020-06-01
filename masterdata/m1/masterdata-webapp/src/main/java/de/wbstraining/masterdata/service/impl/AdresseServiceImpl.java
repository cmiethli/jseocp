package de.wbstraining.masterdata.service.impl;

import org.apache.commons.lang3.tuple.Triple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.wbstraining.common.persistence.service.AbstractService;
import de.wbstraining.common.search.ClientOperation;
import de.wbstraining.masterdata.persistence.dao.IAdresseJpaDao;
import de.wbstraining.masterdata.persistence.model.Adresse;
import de.wbstraining.masterdata.persistence.util.SearchUtilSec;
import de.wbstraining.masterdata.service.IAdresseService;

@Service
@Transactional
public class AdresseServiceImpl extends AbstractService<Adresse>
	implements IAdresseService {

	@Autowired
	IAdresseJpaDao dao;

	public AdresseServiceImpl() {
		super(Adresse.class);
	}

	// API

	// find

	@Override
	public Adresse findByName(final String name) {
		return getDao().findByName(name);
	}

	// Spring

	@Override
	protected final IAdresseJpaDao getDao() {
		return dao;
	}

	@Override
	public Specification<Adresse> resolveConstraint(
		final Triple<String, ClientOperation, String> constraint) {
		return SearchUtilSec.resolveConstraint(constraint, Adresse.class);
	}

	@Override
	protected JpaSpecificationExecutor<Adresse> getSpecificationExecutor() {
		return dao;
	}
}
