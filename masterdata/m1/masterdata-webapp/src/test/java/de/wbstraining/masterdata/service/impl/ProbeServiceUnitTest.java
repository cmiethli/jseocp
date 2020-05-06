package de.wbstraining.masterdata.service.impl;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Before;
import org.springframework.data.jpa.repository.JpaRepository;

import com.google.common.collect.Lists;

import de.wbstraining.masterdata.common.FixtureEntityFactory;
import de.wbstraining.masterdata.persistence.dao.IProbeJpaDao;
import de.wbstraining.masterdata.persistence.model.Probe;
import de.wbstraining.test.common.service.AbstractServiceUnitTest;
import de.wbstraining.test.common.util.IDUtil;

public class ProbeServiceUnitTest extends AbstractServiceUnitTest<Probe> {

	private ProbeServiceImpl instance;

	private IProbeJpaDao daoMock;

	// fixtures

	@Override
	@Before
	public final void before() {
		instance = new ProbeServiceImpl();

		daoMock = mock(IProbeJpaDao.class);
		when(daoMock.save(any(Probe.class))).thenReturn(new Probe());
		when(daoMock.findAll()).thenReturn(Lists.<Probe>newArrayList());
		instance.dao = daoMock;
		super.before();
	}

	// get

	// mocking behavior

	@Override
	protected final Probe configureGet(final long id) {
		final Probe entity = new Probe();
		entity.setId(id);
		when(daoMock.findById(id)).thenReturn(Optional.of(entity));
		return entity;
	}

	// template method

	@Override
	protected final ProbeServiceImpl getApi() {
		return instance;
	}

	@Override
	protected final JpaRepository<Probe, Long> getDAO() {
		return daoMock;
	}

	@Override
	protected Probe createNewEntity() {
		final Probe newProbe = FixtureEntityFactory.createNewProbe();
		newProbe.setId(IDUtil.randomPositiveLong());
		return newProbe;
	}

	@Override
	protected void changeEntity(final Probe entity) {
		entity.setName(randomAlphabetic(8));
	}

}
