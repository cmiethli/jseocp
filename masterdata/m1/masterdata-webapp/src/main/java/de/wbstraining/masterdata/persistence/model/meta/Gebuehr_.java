package de.wbstraining.masterdata.persistence.model.meta;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import de.wbstraining.masterdata.persistence.model.Gebuehr;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Gebuehr.class)
public abstract class Gebuehr_ {

	public static volatile SingularAttribute<Gebuehr, Long> id;
	public static volatile SingularAttribute<Gebuehr, String> name;
	public static volatile SingularAttribute<Gebuehr, Integer> grundgebuehr;
	public static volatile SingularAttribute<Gebuehr, Integer> einsatzprotipp;
	public static volatile SingularAttribute<Gebuehr, Integer> einsatzspiel77;
	public static volatile SingularAttribute<Gebuehr, Integer> einsatzsuper6;
	public static volatile SingularAttribute<Gebuehr, LocalDate> gueltigab;
	public static volatile SingularAttribute<Gebuehr, LocalDate> gueltigbis;
	public static volatile SingularAttribute<Gebuehr, LocalDateTime> created;
	public static volatile SingularAttribute<Gebuehr, LocalDateTime> lastmodified;
	public static volatile SingularAttribute<Gebuehr, Integer> version;

}
