package de.wbstraining.masterdata.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import de.wbstraining.common.interfaces.IByNameApi;
import de.wbstraining.masterdata.persistence.model.Lottoscheinziehung6aus49;

public interface ILottoscheinziehung6aus49JpaDao
	extends JpaRepository<Lottoscheinziehung6aus49, Long>,
	JpaSpecificationExecutor<Lottoscheinziehung6aus49>,
	IByNameApi<Lottoscheinziehung6aus49> {
	//
}
