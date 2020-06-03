package de.wbstraining.masterdata.persistence.model.meta;

import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import de.wbstraining.masterdata.persistence.model.Gewinnklasse;
import de.wbstraining.masterdata.persistence.model.Spiel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Spiel.class)
public abstract class Spiel_ {

	public static volatile ListAttribute<Spiel, Gewinnklasse> gewinnklasseList;
	public static volatile SingularAttribute<Spiel, LocalDateTime> created;
	public static volatile SingularAttribute<Spiel, LocalDateTime> lastmodified;
	public static volatile SingularAttribute<Spiel, String> name;
	public static volatile SingularAttribute<Spiel, Long> spielid;
	public static volatile SingularAttribute<Spiel, String> beschreibung;
	public static volatile SingularAttribute<Spiel, Integer> version;
	public static volatile SingularAttribute<Spiel, String> pfadanleitung;

	public static final String GEWINNKLASSE_LIST = "gewinnklasseList";
	public static final String CREATED = "created";
	public static final String LASTMODIFIED = "lastmodified";
	public static final String NAME = "name";
	public static final String SPIELID = "spielid";
	public static final String BESCHREIBUNG = "beschreibung";
	public static final String VERSION = "version";
	public static final String PFADANLEITUNG = "pfadanleitung";

}
