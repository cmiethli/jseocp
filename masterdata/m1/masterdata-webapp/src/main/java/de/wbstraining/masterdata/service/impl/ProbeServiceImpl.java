package de.wbstraining.masterdata.service.impl;

import org.apache.commons.lang3.tuple.Triple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.wbstraining.common.persistence.service.AbstractService;
import de.wbstraining.common.search.ClientOperation;
import de.wbstraining.masterdata.persistence.dao.IProbeJpaDao;
import de.wbstraining.masterdata.persistence.model.Probe;
import de.wbstraining.masterdata.persistence.util.SearchUtilSec;
import de.wbstraining.masterdata.service.IProbeService;

@Service
@Transactional
public class ProbeServiceImpl extends AbstractService<Probe>
		implements IProbeService {

	@Autowired
	IProbeJpaDao dao;

	public ProbeServiceImpl() {
		super(Probe.class);
	}

	// API

	// find

	@Override
	public Probe findByName(final String name) {
		return getDao().findByName(name);
	}

	// Spring

	@Override
	protected final IProbeJpaDao getDao() {
		return dao;
	}

	@Override
	public Specification<Probe> resolveConstraint(
			final Triple<String, ClientOperation, String> constraint) {
		return SearchUtilSec.resolveConstraint(constraint, Probe.class);
	}

	@Override
	protected JpaSpecificationExecutor<Probe> getSpecificationExecutor() {
		return dao;
	}

	@Override
	public Probe findOne(String ergebnis) {
		Probe computer = new Probe();
		computer.setErgebnis(ergebnis);
		Example<Probe> example = Example.of(computer);
		return dao.findOne(example)
				.get();
	}
}
