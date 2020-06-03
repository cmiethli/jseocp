package de.wbstraining.masterdata.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import de.wbstraining.common.interfaces.IByNameApi;
import de.wbstraining.masterdata.persistence.model.Users2;

public interface IUsers2JpaDao extends JpaRepository<Users2, Long>,
	JpaSpecificationExecutor<Users2>, IByNameApi<Users2> {
	//
}
