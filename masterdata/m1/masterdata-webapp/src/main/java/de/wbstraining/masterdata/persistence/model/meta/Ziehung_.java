package de.wbstraining.masterdata.persistence.model.meta;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import de.wbstraining.masterdata.persistence.model.Gewinnklasseziehungquote;
import de.wbstraining.masterdata.persistence.model.Jackpot;
import de.wbstraining.masterdata.persistence.model.Lottoscheinziehung;
import de.wbstraining.masterdata.persistence.model.Ziehung;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Ziehung.class)
public abstract class Ziehung_ {

	public static volatile ListAttribute<Ziehung, Gewinnklasseziehungquote> gewinnklasseziehungquoteList;
	public static volatile SingularAttribute<Ziehung, Long> einsatzspiel77;
	public static volatile SingularAttribute<Ziehung, Long> einsatzlotto;
	public static volatile SingularAttribute<Ziehung, LocalDateTime> created;
	public static volatile SingularAttribute<Ziehung, Long> zahlenalsbits;
	public static volatile SingularAttribute<Ziehung, LocalDate> ziehungsdatum;
	public static volatile SingularAttribute<Ziehung, Integer> version;
	public static volatile SingularAttribute<Ziehung, Integer> spiel77;
	public static volatile ListAttribute<Ziehung, Jackpot> jackpotList;
	public static volatile ListAttribute<Ziehung, Lottoscheinziehung> lottoscheinziehungList;
	public static volatile SingularAttribute<Ziehung, LocalDateTime> lastmodified;
	public static volatile SingularAttribute<Ziehung, String> name;
	public static volatile SingularAttribute<Ziehung, Integer> super6;
	public static volatile SingularAttribute<Ziehung, Long> einsatzsuper6;
	public static volatile SingularAttribute<Ziehung, Integer> superzahl;
	public static volatile SingularAttribute<Ziehung, Long> ziehungid;
	public static volatile SingularAttribute<Ziehung, Integer> status;

	public static final String GEWINNKLASSEZIEHUNGQUOTE_LIST = "gewinnklasseziehungquoteList";
	public static final String EINSATZSPIEL77 = "einsatzspiel77";
	public static final String EINSATZLOTTO = "einsatzlotto";
	public static final String CREATED = "created";
	public static final String ZAHLENALSBITS = "zahlenalsbits";
	public static final String ZIEHUNGSDATUM = "ziehungsdatum";
	public static final String VERSION = "version";
	public static final String SPIEL77 = "spiel77";
	public static final String JACKPOT_LIST = "jackpotList";
	public static final String LOTTOSCHEINZIEHUNG_LIST = "lottoscheinziehungList";
	public static final String LASTMODIFIED = "lastmodified";
	public static final String NAME = "name";
	public static final String SUPER6 = "super6";
	public static final String EINSATZSUPER6 = "einsatzsuper6";
	public static final String SUPERZAHL = "superzahl";
	public static final String ZIEHUNGID = "ziehungid";
	public static final String STATUS = "status";

}
