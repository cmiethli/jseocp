package de.wbstraining.masterdata.service.main;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import de.wbstraining.common.persistence.service.IService;
import de.wbstraining.common.util.RandomDataUtil;
import de.wbstraining.masterdata.persistence.model.Probe;
import de.wbstraining.masterdata.service.IProbeService;

public class ProbeServiceIntegrationTest
		extends SecServiceIntegrationTest<Probe> {

	@Autowired
	private IProbeService probeService;

	// create

	@Test
	public void whenSaveIsPerformed_thenNoException() {
		probeService.create(createNewEntity());
	}

	@Test(expected = DataAccessException.class)
	public void whenAUniqueConstraintIsBroken_thenSpringSpecificExceptionIsThrown() {
		final String name = randomAlphabetic(8);

		probeService.create(createNewEntity(name));
		probeService.create(createNewEntity(name));
	}

	// template method

	@Override
	protected final IService<Probe> getApi() {
		return probeService;
	}

	@Override
	protected final Probe createNewEntity() {
		return new Probe(RandomDataUtil.randomLocalDateTime(),
				RandomDataUtil.randomProbeMesswert());
	}

	// util

	protected final Probe createNewEntity(final String name) {
		return new Probe(RandomDataUtil.randomLocalDateTime(),
				RandomDataUtil.randomProbeMesswert());
	}

	@Override
	protected void invalidate(final Probe entity) {
		entity.setName(null);
	}

	@Override
	protected void change(final Probe entity) {
		entity.setName(randomAlphabetic(6));
	}

}
