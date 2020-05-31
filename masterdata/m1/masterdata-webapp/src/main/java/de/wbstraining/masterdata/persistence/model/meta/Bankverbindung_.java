package de.wbstraining.masterdata.persistence.model.meta;

import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import de.wbstraining.masterdata.persistence.model.Bankverbindung;
import de.wbstraining.masterdata.persistence.model.Kunde;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Bankverbindung.class)
public abstract class Bankverbindung_ {

	public static volatile SingularAttribute<Bankverbindung, Integer> bankverbindungnr;
	public static volatile SingularAttribute<Bankverbindung, LocalDateTime> created;
	public static volatile SingularAttribute<Bankverbindung, LocalDateTime> lastmodified;
	public static volatile SingularAttribute<Bankverbindung, String> iban;
	public static volatile SingularAttribute<Bankverbindung, String> name;
	public static volatile SingularAttribute<Bankverbindung, Long> bankverbindungid;
	public static volatile SingularAttribute<Bankverbindung, String> kontoinhaber;
	public static volatile SingularAttribute<Bankverbindung, String> name2;
	public static volatile SingularAttribute<Bankverbindung, String> bic;
	public static volatile SingularAttribute<Bankverbindung, Integer> version;
	public static volatile SingularAttribute<Bankverbindung, Kunde> kunde;

	public static final String BANKVERBINDUNGNR = "bankverbindungnr";
	public static final String CREATED = "created";
	public static final String LASTMODIFIED = "lastmodified";
	public static final String IBAN = "iban";
	public static final String NAME = "name";
	public static final String BANKVERBINDUNGID = "bankverbindungid";
	public static final String KONTOINHABER = "kontoinhaber";
	public static final String NAME2 = "name2";
	public static final String BIC = "bic";
	public static final String VERSION = "version";
	public static final String KUNDE = "kunde";

}
