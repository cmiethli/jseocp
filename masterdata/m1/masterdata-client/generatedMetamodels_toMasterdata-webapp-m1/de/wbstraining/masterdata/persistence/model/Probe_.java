package de.wbstraining.masterdata.persistence.model;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Probe.class)
public abstract class Probe_ {

	public static volatile SingularAttribute<Probe, Integer> messwert;
	public static volatile SingularAttribute<Probe, Long> probeId;
	public static volatile SingularAttribute<Probe, String> name;
	public static volatile SingularAttribute<Probe, LocalDateTime> zeitpunkt;
	public static volatile SingularAttribute<Probe, String> ergebnis;

	public static final String MESSWERT = "messwert";
	public static final String PROBE_ID = "probeId";
	public static final String NAME = "name";
	public static final String ZEITPUNKT = "zeitpunkt";
	public static final String ERGEBNIS = "ergebnis";

}

