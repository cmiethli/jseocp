package de.wbstraining.masterdata.service;

import de.wbstraining.common.persistence.service.IService;
import de.wbstraining.masterdata.persistence.model.Computer;

public interface IComputerService extends IService<Computer> {
    public Computer findOne(String macAddress);
}
