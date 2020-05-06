package de.wbstraining.masterdata.persistence.model.meta;

import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import de.wbstraining.masterdata.persistence.model.Probe;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Probe.class)
public abstract class Probe_ {

	public static volatile SingularAttribute<Probe, Long> id;
	public static volatile SingularAttribute<Probe, String> name;
	public static volatile SingularAttribute<Probe, LocalDateTime> zeitpunkt;
	public static volatile SingularAttribute<Probe, Integer> messwert;
	public static volatile SingularAttribute<Probe, String> ergebnis;

}
