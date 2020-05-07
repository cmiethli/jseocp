package de.wbstraining.masterdata.web.probe;

import org.springframework.beans.factory.annotation.Autowired;

import de.wbstraining.client.IDtoOperations;
import de.wbstraining.masterdata.client.template.ProbeRestClient;
import de.wbstraining.masterdata.model.ProbeDtoOpsImpl;
import de.wbstraining.masterdata.persistence.model.Probe;
import de.wbstraining.masterdata.test.live.UmLogicRestLiveTest;

public class ProbeLogicRestLiveTest extends UmLogicRestLiveTest<Probe> {

	@Autowired
	private ProbeRestClient api;
	@Autowired
	private ProbeDtoOpsImpl entityOps;

	public ProbeLogicRestLiveTest() {
		super(Probe.class);
	}

	// tests

	// template

	@Override
	protected final ProbeRestClient getApi() {
		return api;
	}

	@Override
	protected final IDtoOperations<Probe> getEntityOps() {
		return entityOps;
	}

}
