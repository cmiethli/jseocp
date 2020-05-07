package de.wbstraining.masterdata.web.probe;

import org.springframework.beans.factory.annotation.Autowired;

import de.wbstraining.client.IDtoOperations;
import de.wbstraining.masterdata.client.template.ProbeRestClient;
import de.wbstraining.masterdata.model.ProbeDtoOpsImpl;
import de.wbstraining.masterdata.persistence.model.Probe;
import de.wbstraining.masterdata.test.live.UmDiscoverabilityRestLiveTest;

public class ProbeDiscoverabilityRestLiveTest
		extends UmDiscoverabilityRestLiveTest<Probe> {

	@Autowired
	private ProbeRestClient restTemplate;
	@Autowired
	private ProbeDtoOpsImpl entityOps;

	public ProbeDiscoverabilityRestLiveTest() {
		super(Probe.class);
	}

	// tests

	// template method

	@Override
	protected final Probe createNewResource() {
		return getEntityOps().createNewResource();
	}

	@Override
	protected final String getUri() {
		return getApi().getUri();
	}

	@Override
	protected final ProbeRestClient getApi() {
		return restTemplate;
	}

	@Override
	protected final IDtoOperations<Probe> getEntityOps() {
		return entityOps;
	}

}
