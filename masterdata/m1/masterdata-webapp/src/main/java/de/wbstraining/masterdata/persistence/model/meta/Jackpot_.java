package de.wbstraining.masterdata.persistence.model.meta;

import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import de.wbstraining.masterdata.persistence.model.Gewinnklasse;
import de.wbstraining.masterdata.persistence.model.Jackpot;
import de.wbstraining.masterdata.persistence.model.Ziehung;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Jackpot.class)
public abstract class Jackpot_ {

	public static volatile SingularAttribute<Jackpot, Long> betragkumuliert;
	public static volatile SingularAttribute<Jackpot, Integer> anzahlziehungen;
	public static volatile SingularAttribute<Jackpot, Long> jackpotid;
	public static volatile SingularAttribute<Jackpot, LocalDateTime> created;
	public static volatile SingularAttribute<Jackpot, LocalDateTime> lastmodified;
	public static volatile SingularAttribute<Jackpot, Long> betrag;
	public static volatile SingularAttribute<Jackpot, String> name;
	public static volatile SingularAttribute<Jackpot, Ziehung> ziehung;
	public static volatile SingularAttribute<Jackpot, Gewinnklasse> gewinnklasse;
	public static volatile SingularAttribute<Jackpot, Integer> version;

	public static final String BETRAGKUMULIERT = "betragkumuliert";
	public static final String ANZAHLZIEHUNGEN = "anzahlziehungen";
	public static final String JACKPOTID = "jackpotid";
	public static final String CREATED = "created";
	public static final String LASTMODIFIED = "lastmodified";
	public static final String BETRAG = "betrag";
	public static final String NAME = "name";
	public static final String ZIEHUNG = "ziehung";
	public static final String GEWINNKLASSE = "gewinnklasse";
	public static final String VERSION = "version";

}
