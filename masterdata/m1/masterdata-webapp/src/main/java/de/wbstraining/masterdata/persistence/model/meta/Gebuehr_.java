package de.wbstraining.masterdata.persistence.model.meta;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import de.wbstraining.masterdata.persistence.model.Gebuehr;

/*
 * Zu aendern vom GeneratedMetamodel:
 * eventuell:
 * package de.wbstraining.masterdata.persistence.model.meta;
 * 
 * import de.wbstraining.masterdata.persistence.model.Gebuehr;
 */
@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Gebuehr.class)
public abstract class Gebuehr_ {

	public static volatile SingularAttribute<Gebuehr, Long> gebuehrid;
	public static volatile SingularAttribute<Gebuehr, Integer> einsatzspiel77;
	public static volatile SingularAttribute<Gebuehr, LocalDateTime> created;
	public static volatile SingularAttribute<Gebuehr, LocalDateTime> lastmodified;
	public static volatile SingularAttribute<Gebuehr, String> name;
	public static volatile SingularAttribute<Gebuehr, Integer> grundgebuehr;
	public static volatile SingularAttribute<Gebuehr, LocalDate> gueltigab;
	public static volatile SingularAttribute<Gebuehr, LocalDate> gueltigbis;
	public static volatile SingularAttribute<Gebuehr, Integer> einsatzsuper6;
	public static volatile SingularAttribute<Gebuehr, Integer> version;
	public static volatile SingularAttribute<Gebuehr, Integer> einsatzprotipp;

	public static final String GEBUEHRID = "gebuehrid";
	public static final String EINSATZSPIEL77 = "einsatzspiel77";
	public static final String CREATED = "created";
	public static final String LASTMODIFIED = "lastmodified";
	public static final String NAME = "name";
	public static final String GRUNDGEBUEHR = "grundgebuehr";
	public static final String GUELTIGAB = "gueltigab";
	public static final String GUELTIGBIS = "gueltigbis";
	public static final String EINSATZSUPER6 = "einsatzsuper6";
	public static final String VERSION = "version";
	public static final String EINSATZPROTIPP = "einsatzprotipp";

}
