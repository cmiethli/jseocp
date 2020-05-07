package de.wbstraining.masterdata.model;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

import org.springframework.stereotype.Component;

import de.wbstraining.client.IDtoOperations;
import de.wbstraining.common.util.RandomDataUtil;
import de.wbstraining.masterdata.persistence.model.Probe;

@Component
public final class ProbeDtoOpsImpl implements IDtoOperations<Probe> {

	public ProbeDtoOpsImpl() {
		super();
	}

	// template method

	@Override
	public final Probe createNewResource() {
		return new Probe(RandomDataUtil.randomLocalDateTime(),
				RandomDataUtil.randomProbeMesswert());
	}

	@Override
	public final void invalidate(final Probe entity) {
		entity.setName(null);
	}

	@Override
	public void change(final Probe resource) {
		resource.setName(randomAlphabetic(8));
	}

}
