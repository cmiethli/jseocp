package de.wbstraining.masterdata.web.probe;

import org.springframework.beans.factory.annotation.Autowired;

import de.wbstraining.masterdata.client.template.ProbeRestClient;
import de.wbstraining.masterdata.persistence.model.Probe;
import de.wbstraining.masterdata.test.live.UmReadOnlyLogicRestLiveTest;

public class ProbeReadOnlyLogicRestLiveTest
		extends UmReadOnlyLogicRestLiveTest<Probe> {

	@Autowired
	private ProbeRestClient api;

	public ProbeReadOnlyLogicRestLiveTest() {
		super(Probe.class);
	}

	// tests

	// template

	@Override
	protected final ProbeRestClient getApi() {
		return api;
	}

}
