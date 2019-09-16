package de.wbstraining.masterdata.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import de.wbstraining.common.interfaces.IByNameApi;
import de.wbstraining.masterdata.persistence.model.Computer;

public interface IComputerJpaDao extends JpaRepository<Computer, Long>, JpaSpecificationExecutor<Computer>, IByNameApi<Computer> {
    //
}
