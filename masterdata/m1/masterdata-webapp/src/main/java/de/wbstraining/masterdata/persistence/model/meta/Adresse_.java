package de.wbstraining.masterdata.persistence.model.meta;

import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import de.wbstraining.masterdata.persistence.model.Adresse;
import de.wbstraining.masterdata.persistence.model.Kunde;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Adresse.class)
public abstract class Adresse_ {

	public static volatile SingularAttribute<Adresse, String> strasse;
	public static volatile SingularAttribute<Adresse, String> adresszusatz;
	public static volatile SingularAttribute<Adresse, LocalDateTime> created;
	public static volatile SingularAttribute<Adresse, Long> adresseid;
	public static volatile SingularAttribute<Adresse, Integer> version;
	public static volatile SingularAttribute<Adresse, String> ort;
	public static volatile SingularAttribute<Adresse, LocalDateTime> lastmodified;
	public static volatile SingularAttribute<Adresse, String> name;
	public static volatile SingularAttribute<Adresse, String> hausnummer;
	public static volatile SingularAttribute<Adresse, String> land;
	public static volatile SingularAttribute<Adresse, Integer> adressenr;
	public static volatile SingularAttribute<Adresse, String> plz;
	public static volatile SingularAttribute<Adresse, Kunde> kunde;

	public static final String STRASSE = "strasse";
	public static final String ADRESSZUSATZ = "adresszusatz";
	public static final String CREATED = "created";
	public static final String ADRESSEID = "adresseid";
	public static final String VERSION = "version";
	public static final String ORT = "ort";
	public static final String LASTMODIFIED = "lastmodified";
	public static final String NAME = "name";
	public static final String HAUSNUMMER = "hausnummer";
	public static final String LAND = "land";
	public static final String ADRESSENR = "adressenr";
	public static final String PLZ = "plz";
	public static final String KUNDE = "kunde";

}
