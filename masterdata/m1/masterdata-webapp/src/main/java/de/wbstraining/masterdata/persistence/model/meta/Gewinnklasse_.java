package de.wbstraining.masterdata.persistence.model.meta;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import de.wbstraining.masterdata.persistence.model.Gewinnklasse;
import de.wbstraining.masterdata.persistence.model.Gewinnklasseziehungquote;
import de.wbstraining.masterdata.persistence.model.Jackpot;
import de.wbstraining.masterdata.persistence.model.Lottoscheinziehung;
import de.wbstraining.masterdata.persistence.model.Lottoscheinziehung6aus49;
import de.wbstraining.masterdata.persistence.model.Spiel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Gewinnklasse.class)
public abstract class Gewinnklasse_ {

	public static volatile ListAttribute<Gewinnklasse, Lottoscheinziehung> lottoscheinziehungList1;
	public static volatile ListAttribute<Gewinnklasse, Gewinnklasseziehungquote> gewinnklasseziehungquoteList;
	public static volatile SingularAttribute<Gewinnklasse, Long> gewinnklasseid;
	public static volatile SingularAttribute<Gewinnklasse, String> bezeichnunglatein;
	public static volatile SingularAttribute<Gewinnklasse, LocalDateTime> created;
	public static volatile SingularAttribute<Gewinnklasse, Long> betrag;
	public static volatile SingularAttribute<Gewinnklasse, Integer> gewinnklassenr;
	public static volatile SingularAttribute<Gewinnklasse, String> beschreibung;
	public static volatile SingularAttribute<Gewinnklasse, Integer> version;
	public static volatile ListAttribute<Gewinnklasse, Jackpot> jackpotList;
	public static volatile ListAttribute<Gewinnklasse, Lottoscheinziehung6aus49> lottoscheinziehung6aus49List;
	public static volatile ListAttribute<Gewinnklasse, Lottoscheinziehung> lottoscheinziehungList;
	public static volatile SingularAttribute<Gewinnklasse, LocalDateTime> lastmodified;
	public static volatile SingularAttribute<Gewinnklasse, String> name;
	public static volatile SingularAttribute<Gewinnklasse, LocalDate> gueltigab;
	public static volatile SingularAttribute<Gewinnklasse, LocalDate> gueltigbis;
	public static volatile SingularAttribute<Gewinnklasse, Spiel> spiel;
	public static volatile SingularAttribute<Gewinnklasse, Boolean> isabsolut;

	public static final String LOTTOSCHEINZIEHUNG_LIST1 = "lottoscheinziehungList1";
	public static final String GEWINNKLASSEZIEHUNGQUOTE_LIST = "gewinnklasseziehungquoteList";
	public static final String GEWINNKLASSEID = "gewinnklasseid";
	public static final String BEZEICHNUNGLATEIN = "bezeichnunglatein";
	public static final String CREATED = "created";
	public static final String BETRAG = "betrag";
	public static final String GEWINNKLASSENR = "gewinnklassenr";
	public static final String BESCHREIBUNG = "beschreibung";
	public static final String VERSION = "version";
	public static final String JACKPOT_LIST = "jackpotList";
	public static final String LOTTOSCHEINZIEHUNG6AUS49_LIST = "lottoscheinziehung6aus49List";
	public static final String LOTTOSCHEINZIEHUNG_LIST = "lottoscheinziehungList";
	public static final String LASTMODIFIED = "lastmodified";
	public static final String NAME = "name";
	public static final String GUELTIGAB = "gueltigab";
	public static final String GUELTIGBIS = "gueltigbis";
	public static final String SPIEL = "spiel";
	public static final String ISABSOLUT = "isabsolut";

}
