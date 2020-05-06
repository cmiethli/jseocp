package de.wbstraining.masterdata.service;

import de.wbstraining.common.persistence.service.IService;
import de.wbstraining.masterdata.persistence.model.Probe;

public interface IProbeService extends IService<Probe> {
	public Probe findOne(String ergebnis);
}
