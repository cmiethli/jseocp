package de.wbstraining.masterdata.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import de.wbstraining.common.interfaces.IByNameApi;
import de.wbstraining.masterdata.persistence.model.Bankverbindung;

public interface IBankverbindungJpaDao
	extends JpaRepository<Bankverbindung, Long>,
	JpaSpecificationExecutor<Bankverbindung>, IByNameApi<Bankverbindung> {
	//
}
