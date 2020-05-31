package de.wbstraining.masterdata.persistence.model.meta;

import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import de.wbstraining.masterdata.persistence.model.Gewinnklasse;
import de.wbstraining.masterdata.persistence.model.Lottoscheinziehung;
import de.wbstraining.masterdata.persistence.model.Lottoscheinziehung6aus49;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Lottoscheinziehung6aus49.class)
public abstract class Lottoscheinziehung6aus49_ {

	public static volatile SingularAttribute<Lottoscheinziehung6aus49, Lottoscheinziehung> lottoscheinziehung;
	public static volatile SingularAttribute<Lottoscheinziehung6aus49, LocalDateTime> created;
	public static volatile SingularAttribute<Lottoscheinziehung6aus49, LocalDateTime> lastmodified;
	public static volatile SingularAttribute<Lottoscheinziehung6aus49, Integer> tippnr;
	public static volatile SingularAttribute<Lottoscheinziehung6aus49, String> name;
	public static volatile SingularAttribute<Lottoscheinziehung6aus49, Long> gewinn;
	public static volatile SingularAttribute<Lottoscheinziehung6aus49, Gewinnklasse> gewinnklasse;
	public static volatile SingularAttribute<Lottoscheinziehung6aus49, Integer> version;
	public static volatile SingularAttribute<Lottoscheinziehung6aus49, Long> lottoscheinziehung6aus49id;

	public static final String LOTTOSCHEINZIEHUNG = "lottoscheinziehung";
	public static final String CREATED = "created";
	public static final String LASTMODIFIED = "lastmodified";
	public static final String TIPPNR = "tippnr";
	public static final String NAME = "name";
	public static final String GEWINN = "gewinn";
	public static final String GEWINNKLASSE = "gewinnklasse";
	public static final String VERSION = "version";
	public static final String LOTTOSCHEINZIEHUNG6AUS49ID = "lottoscheinziehung6aus49id";

}
