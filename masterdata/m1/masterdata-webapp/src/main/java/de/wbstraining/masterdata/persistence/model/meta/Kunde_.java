package de.wbstraining.masterdata.persistence.model.meta;

import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import de.wbstraining.masterdata.persistence.model.Adresse;
import de.wbstraining.masterdata.persistence.model.Bankverbindung;
import de.wbstraining.masterdata.persistence.model.Kunde;
import de.wbstraining.masterdata.persistence.model.Lottoschein;
import de.wbstraining.masterdata.persistence.model.Users;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Kunde.class)
public abstract class Kunde_ {

	public static volatile SingularAttribute<Kunde, LocalDateTime> created;
	public static volatile SingularAttribute<Kunde, String> vorname;
	public static volatile SingularAttribute<Kunde, Long> guthaben;
	public static volatile ListAttribute<Kunde, Adresse> adresseList;
	public static volatile SingularAttribute<Kunde, Integer> version;
	public static volatile SingularAttribute<Kunde, Users> users;
	public static volatile SingularAttribute<Kunde, LocalDateTime> gesperrt;
	public static volatile ListAttribute<Kunde, Bankverbindung> bankverbindungList;
	public static volatile SingularAttribute<Kunde, Boolean> isannahmestelle;
	public static volatile SingularAttribute<Kunde, LocalDateTime> lastmodified;
	public static volatile SingularAttribute<Kunde, String> name;
	public static volatile ListAttribute<Kunde, Lottoschein> lottoscheinList;
	public static volatile SingularAttribute<Kunde, Long> kundeid;
	public static volatile SingularAttribute<Kunde, String> email;
	public static volatile SingularAttribute<Kunde, Long> dispo;

	public static final String CREATED = "created";
	public static final String VORNAME = "vorname";
	public static final String GUTHABEN = "guthaben";
	public static final String ADRESSE_LIST = "adresseList";
	public static final String VERSION = "version";
	public static final String USERS = "users";
	public static final String GESPERRT = "gesperrt";
	public static final String BANKVERBINDUNG_LIST = "bankverbindungList";
	public static final String ISANNAHMESTELLE = "isannahmestelle";
	public static final String LASTMODIFIED = "lastmodified";
	public static final String NAME = "name";
	public static final String LOTTOSCHEIN_LIST = "lottoscheinList";
	public static final String KUNDEID = "kundeid";
	public static final String EMAIL = "email";
	public static final String DISPO = "dispo";

}
