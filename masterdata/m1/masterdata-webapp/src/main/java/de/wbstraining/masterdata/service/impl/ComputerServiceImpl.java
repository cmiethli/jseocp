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
import de.wbstraining.masterdata.persistence.dao.IComputerJpaDao;
import de.wbstraining.masterdata.persistence.model.Computer;
import de.wbstraining.masterdata.persistence.util.SearchUtilSec;
import de.wbstraining.masterdata.service.IComputerService;

@Service
@Transactional
public class ComputerServiceImpl extends AbstractService<Computer> implements IComputerService {

	@Autowired
	IComputerJpaDao dao;

	public ComputerServiceImpl() {
		super(Computer.class);
	}

	// API

	// find

	@Override
	public Computer findByName(final String name) {
		return getDao().findByName(name);
	}

	// Spring

	@Override
	protected final IComputerJpaDao getDao() {
		return dao;
	}

	@Override
	public Specification<Computer> resolveConstraint(final Triple<String, ClientOperation, String> constraint) {
		return SearchUtilSec.resolveConstraint(constraint, Computer.class);
	}

	@Override
	protected JpaSpecificationExecutor<Computer> getSpecificationExecutor() {
		return dao;
	}

	@Override
	public Computer findOne(String macAddress) {
		Computer computer = new Computer();
		computer.setMacAddress(macAddress);
		Example<Computer> example = Example.of(computer);
		return dao.findOne(example).get();
	}
}
