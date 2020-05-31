package de.wbstraining.masterdata.persistence.model.meta;

import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import de.wbstraining.masterdata.persistence.model.Gewinnklasse;
import de.wbstraining.masterdata.persistence.model.Gewinnklasseziehungquote;
import de.wbstraining.masterdata.persistence.model.Ziehung;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Gewinnklasseziehungquote.class)
public abstract class Gewinnklasseziehungquote_ {

	public static volatile SingularAttribute<Gewinnklasseziehungquote, Integer> anzahlgewinner;
	public static volatile SingularAttribute<Gewinnklasseziehungquote, Long> quote;
	public static volatile SingularAttribute<Gewinnklasseziehungquote, LocalDateTime> created;
	public static volatile SingularAttribute<Gewinnklasseziehungquote, LocalDateTime> lastmodified;
	public static volatile SingularAttribute<Gewinnklasseziehungquote, String> name;
	public static volatile SingularAttribute<Gewinnklasseziehungquote, Ziehung> ziehung;
	public static volatile SingularAttribute<Gewinnklasseziehungquote, Gewinnklasse> gewinnklasse;
	public static volatile SingularAttribute<Gewinnklasseziehungquote, Long> gewinnklasseziehungquoteid;
	public static volatile SingularAttribute<Gewinnklasseziehungquote, Integer> version;

	public static final String ANZAHLGEWINNER = "anzahlgewinner";
	public static final String QUOTE = "quote";
	public static final String CREATED = "created";
	public static final String LASTMODIFIED = "lastmodified";
	public static final String NAME = "name";
	public static final String ZIEHUNG = "ziehung";
	public static final String GEWINNKLASSE = "gewinnklasse";
	public static final String GEWINNKLASSEZIEHUNGQUOTEID = "gewinnklasseziehungquoteid";
	public static final String VERSION = "version";

}
