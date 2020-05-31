package de.wbstraining.masterdata.persistence.model.meta;

import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import de.wbstraining.masterdata.persistence.model.Kunde;
import de.wbstraining.masterdata.persistence.model.Lottoschein;
import de.wbstraining.masterdata.persistence.model.Lottoscheinziehung;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Lottoschein.class)
public abstract class Lottoschein_ {

	public static volatile SingularAttribute<Lottoschein, Integer> losnummer;
	public static volatile SingularAttribute<Lottoschein, Integer> laufzeit;
	public static volatile SingularAttribute<Lottoschein, Integer> kosten;
	public static volatile SingularAttribute<Lottoschein, LocalDateTime> created;
	public static volatile SingularAttribute<Lottoschein, Boolean> isabgeschlossen;
	public static volatile SingularAttribute<Lottoschein, Long> belegnummer;
	public static volatile SingularAttribute<Lottoschein, byte[]> tipps;
	public static volatile SingularAttribute<Lottoschein, Integer> version;
	public static volatile SingularAttribute<Lottoschein, Boolean> issuper6;
	public static volatile SingularAttribute<Lottoschein, Boolean> isspiel77;
	public static volatile SingularAttribute<Lottoschein, LocalDateTime> abgabezeitpunkt;
	public static volatile SingularAttribute<Lottoschein, Long> lottoscheinid;
	public static volatile ListAttribute<Lottoschein, Lottoscheinziehung> lottoscheinziehungList;
	public static volatile SingularAttribute<Lottoschein, LocalDateTime> lastmodified;
	public static volatile SingularAttribute<Lottoschein, String> name;
	public static volatile SingularAttribute<Lottoschein, Boolean> ismittwoch;
	public static volatile SingularAttribute<Lottoschein, Boolean> issamstag;
	public static volatile SingularAttribute<Lottoschein, Integer> status;
	public static volatile SingularAttribute<Lottoschein, Kunde> kunde;

	public static final String LOSNUMMER = "losnummer";
	public static final String LAUFZEIT = "laufzeit";
	public static final String KOSTEN = "kosten";
	public static final String CREATED = "created";
	public static final String ISABGESCHLOSSEN = "isabgeschlossen";
	public static final String BELEGNUMMER = "belegnummer";
	public static final String TIPPS = "tipps";
	public static final String VERSION = "version";
	public static final String ISSUPER6 = "issuper6";
	public static final String ISSPIEL77 = "isspiel77";
	public static final String ABGABEZEITPUNKT = "abgabezeitpunkt";
	public static final String LOTTOSCHEINID = "lottoscheinid";
	public static final String LOTTOSCHEINZIEHUNG_LIST = "lottoscheinziehungList";
	public static final String LASTMODIFIED = "lastmodified";
	public static final String NAME = "name";
	public static final String ISMITTWOCH = "ismittwoch";
	public static final String ISSAMSTAG = "issamstag";
	public static final String STATUS = "status";
	public static final String KUNDE = "kunde";

}
