package de.wbstraining.masterdata.persistence.model.meta;

import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import de.wbstraining.masterdata.persistence.model.Gewinnklasse;
import de.wbstraining.masterdata.persistence.model.Lottoschein;
import de.wbstraining.masterdata.persistence.model.Lottoscheinziehung;
import de.wbstraining.masterdata.persistence.model.Lottoscheinziehung6aus49;
import de.wbstraining.masterdata.persistence.model.Ziehung;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Lottoscheinziehung.class)
public abstract class Lottoscheinziehung_ {

	public static volatile SingularAttribute<Lottoscheinziehung, Long> gewinnspiel77;
	public static volatile SingularAttribute<Lottoscheinziehung, LocalDateTime> created;
	public static volatile SingularAttribute<Lottoscheinziehung, Boolean> isabgeschlossen;
	public static volatile SingularAttribute<Lottoscheinziehung, Integer> ziehungnr;
	public static volatile SingularAttribute<Lottoscheinziehung, Lottoschein> lottoschein;
	public static volatile SingularAttribute<Lottoscheinziehung, Integer> version;
	public static volatile SingularAttribute<Lottoscheinziehung, Long> gewinnsuper6;
	public static volatile SingularAttribute<Lottoscheinziehung, Gewinnklasse> gewinnklassespiel77;
	public static volatile ListAttribute<Lottoscheinziehung, Lottoscheinziehung6aus49> lottoscheinziehung6aus49List;
	public static volatile SingularAttribute<Lottoscheinziehung, LocalDateTime> lastmodified;
	public static volatile SingularAttribute<Lottoscheinziehung, String> name;
	public static volatile SingularAttribute<Lottoscheinziehung, Gewinnklasse> gewinnklassesuper6;
	public static volatile SingularAttribute<Lottoscheinziehung, Ziehung> ziehung;
	public static volatile SingularAttribute<Lottoscheinziehung, Long> lottoscheinziehungid;
	public static volatile SingularAttribute<Lottoscheinziehung, Boolean> isletzteziehung;

	public static final String GEWINNSPIEL77 = "gewinnspiel77";
	public static final String CREATED = "created";
	public static final String ISABGESCHLOSSEN = "isabgeschlossen";
	public static final String ZIEHUNGNR = "ziehungnr";
	public static final String LOTTOSCHEIN = "lottoschein";
	public static final String VERSION = "version";
	public static final String GEWINNSUPER6 = "gewinnsuper6";
	public static final String GEWINNKLASSESPIEL77 = "gewinnklassespiel77";
	public static final String LOTTOSCHEINZIEHUNG6AUS49_LIST = "lottoscheinziehung6aus49List";
	public static final String LASTMODIFIED = "lastmodified";
	public static final String NAME = "name";
	public static final String GEWINNKLASSESUPER6 = "gewinnklassesuper6";
	public static final String ZIEHUNG = "ziehung";
	public static final String LOTTOSCHEINZIEHUNGID = "lottoscheinziehungid";
	public static final String ISLETZTEZIEHUNG = "isletzteziehung";

}
