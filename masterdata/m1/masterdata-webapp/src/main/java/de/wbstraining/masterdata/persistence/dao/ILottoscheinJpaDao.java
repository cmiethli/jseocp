package de.wbstraining.masterdata.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import de.wbstraining.common.interfaces.IByNameApi;
import de.wbstraining.masterdata.persistence.model.Lottoschein;

public interface ILottoscheinJpaDao extends JpaRepository<Lottoschein, Long>,
	JpaSpecificationExecutor<Lottoschein>, IByNameApi<Lottoschein> {
	//
}
