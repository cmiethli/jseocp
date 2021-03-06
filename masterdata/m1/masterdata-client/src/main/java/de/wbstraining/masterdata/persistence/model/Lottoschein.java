/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.wbstraining.masterdata.persistence.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;

import de.wbstraining.common.interfaces.INameableDto;
import de.wbstraining.common.persistence.model.INameableEntity;
import de.wbstraining.masterdata.util.MasterdataMappings;

/**
 *
 * @author Günter
 */
@Entity
@Table(name = "lottoschein")
@NamedQueries({
	@NamedQuery(name = "Lottoschein.findAll", query = "SELECT l FROM Lottoschein l"),
	@NamedQuery(name = "Lottoschein.findByLottoscheinid", query = "SELECT l FROM Lottoschein l WHERE l.lottoscheinid = :lottoscheinid"),
	@NamedQuery(name = "Lottoschein.findByBelegnummer", query = "SELECT l FROM Lottoschein l WHERE l.belegnummer = :belegnummer"),
	@NamedQuery(name = "Lottoschein.findByLosnummer", query = "SELECT l FROM Lottoschein l WHERE l.losnummer = :losnummer"),
	@NamedQuery(name = "Lottoschein.findByIsspiel77", query = "SELECT l FROM Lottoschein l WHERE l.isspiel77 = :isspiel77"),
	@NamedQuery(name = "Lottoschein.findByIssuper6", query = "SELECT l FROM Lottoschein l WHERE l.issuper6 = :issuper6"),
	@NamedQuery(name = "Lottoschein.findByIsmittwoch", query = "SELECT l FROM Lottoschein l WHERE l.ismittwoch = :ismittwoch"),
	@NamedQuery(name = "Lottoschein.findByIssamstag", query = "SELECT l FROM Lottoschein l WHERE l.issamstag = :issamstag"),
	@NamedQuery(name = "Lottoschein.findByLaufzeit", query = "SELECT l FROM Lottoschein l WHERE l.laufzeit = :laufzeit"),
	@NamedQuery(name = "Lottoschein.findByIsabgeschlossen", query = "SELECT l FROM Lottoschein l WHERE l.isabgeschlossen = :isabgeschlossen"),
	@NamedQuery(name = "Lottoschein.findByAbgabezeitpunkt", query = "SELECT l FROM Lottoschein l WHERE l.abgabezeitpunkt = :abgabezeitpunkt"),
	@NamedQuery(name = "Lottoschein.findByKosten", query = "SELECT l FROM Lottoschein l WHERE l.kosten = :kosten"),
	@NamedQuery(name = "Lottoschein.findByStatus", query = "SELECT l FROM Lottoschein l WHERE l.status = :status"),
	@NamedQuery(name = "Lottoschein.findByCreated", query = "SELECT l FROM Lottoschein l WHERE l.created = :created"),
	@NamedQuery(name = "Lottoschein.findByLastmodified", query = "SELECT l FROM Lottoschein l WHERE l.lastmodified = :lastmodified"),
	@NamedQuery(name = "Lottoschein.findByVersion", query = "SELECT l FROM Lottoschein l WHERE l.version = :version") })
@XmlRootElement()
public class Lottoschein
	implements INameableEntity, INameableDto, Serializable {

	private static final long serialVersionUID = 1L;
	private static final String GENERATOR_NAME = "seqGen_"
		+ MasterdataMappings.Singular.LOTTOSCHEIN;

	@Id
	@GeneratedValue(generator = GENERATOR_NAME)
	@GenericGenerator(name = GENERATOR_NAME, strategy = "de.wbstraining.masterdata.persistence.generator.IdAndNameGenerator", //
		parameters = {
			@Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "10") })
	@Basic(optional = false)
	@Column(name = "lottoscheinid")
	private Long lottoscheinid;

	@Column(nullable = false, unique = true)
	private String name;

	@Column(name = "belegnummer")
	private Long belegnummer;
	@Basic(optional = false)
	@NotNull
	@Column(name = "losnummer")
	private int losnummer;
	@Column(name = "isspiel77")
	private Boolean isspiel77;
	@Column(name = "issuper6")
	private Boolean issuper6;
	@Column(name = "ismittwoch")
	private Boolean ismittwoch;
	@Column(name = "issamstag")
	private Boolean issamstag;
	@Column(name = "laufzeit")
	private Integer laufzeit;
	@Lob
	@Column(name = "tipps")
	private byte[] tipps;
	@Column(name = "isabgeschlossen")
	private Boolean isabgeschlossen;
	@Basic(optional = false)
	@NotNull
	@Column(name = "abgabezeitpunkt")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
	private LocalDateTime abgabezeitpunkt;
	@Column(name = "kosten")
	private Integer kosten;
	@Column(name = "status")
	private Integer status;
	@Basic(optional = false)
	@NotNull
	@Column(name = "created")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
	private LocalDateTime created;
	@Basic(optional = false)
	@NotNull
	@Column(name = "lastmodified")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
	private LocalDateTime lastmodified;
	@Column(name = "version")
	private Integer version;
	@JoinColumn(name = "kundeid", referencedColumnName = "kundeid")
	@ManyToOne(optional = false)
	private Kunde kunde;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "lottoschein")
	private List<Lottoscheinziehung> lottoscheinziehungList;

	{// vor jedem KonstruktorAufruf
		created = Optional.ofNullable(created)
			.orElse(LocalDateTime.now());
		lastmodified = Optional.ofNullable(lastmodified)
			.orElse(LocalDateTime.now());
	}

	public Lottoschein() {
	}

	public Lottoschein(Long lottoscheinid) {
		this.lottoscheinid = lottoscheinid;
	}

	public Lottoschein(Long lottoscheinid, int losnummer,
		LocalDateTime abgabeZeitpunkt, LocalDateTime created,
		LocalDateTime lastmodified) {
		this.lottoscheinid = lottoscheinid;
		this.losnummer = losnummer;
		this.abgabezeitpunkt = abgabeZeitpunkt;
		this.created = created;
		this.lastmodified = lastmodified;
	}

	public Long getLottoscheinid() {
		return lottoscheinid;
	}

	public void setLottoscheinid(Long lottoscheinid) {
		this.lottoscheinid = lottoscheinid;
	}

	public Long getBelegnummer() {
		return belegnummer;
	}

	public void setBelegnummer(Long belegnummer) {
		this.belegnummer = belegnummer;
	}

	public int getLosnummer() {
		return losnummer;
	}

	public void setLosnummer(int losnummer) {
		this.losnummer = losnummer;
	}

	public Boolean getIsspiel77() {
		return isspiel77;
	}

	public void setIsspiel77(Boolean isspiel77) {
		this.isspiel77 = isspiel77;
	}

	public Boolean getIssuper6() {
		return issuper6;
	}

	public void setIssuper6(Boolean issuper6) {
		this.issuper6 = issuper6;
	}

	public Boolean getIsmittwoch() {
		return ismittwoch;
	}

	public void setIsmittwoch(Boolean ismittwoch) {
		this.ismittwoch = ismittwoch;
	}

	public Boolean getIssamstag() {
		return issamstag;
	}

	public void setIssamstag(Boolean issamstag) {
		this.issamstag = issamstag;
	}

	public Integer getLaufzeit() {
		return laufzeit;
	}

	public void setLaufzeit(Integer laufzeit) {
		this.laufzeit = laufzeit;
	}

	public byte[] getTipps() {
		return tipps;
	}

	public void setTipps(byte[] tipps) {
		this.tipps = tipps;
	}

	public Boolean getIsabgeschlossen() {
		return isabgeschlossen;
	}

	public void setIsabgeschlossen(Boolean isabgeschlossen) {
		this.isabgeschlossen = isabgeschlossen;
	}

	public LocalDateTime getAbgabezeitpunkt() {
		return abgabezeitpunkt;
	}

	public void setAbgabezeitpunkt(LocalDateTime abgabeZeitpunkt) {
		this.abgabezeitpunkt = abgabeZeitpunkt;
	}

	public Integer getKosten() {
		return kosten;
	}

	public void setKosten(Integer kosten) {
		this.kosten = kosten;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public LocalDateTime getLastmodified() {
		return lastmodified;
	}

	public void setLastmodified(LocalDateTime lastmodified) {
		this.lastmodified = lastmodified;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Kunde getKunde() {
		return kunde;
	}

	public void setKunde(Kunde kundeid) {
		this.kunde = kundeid;
	}

	public List<Lottoscheinziehung> getLottoscheinziehungList() {
		return lottoscheinziehungList;
	}

	public void setLottoscheinziehungList(
		List<Lottoscheinziehung> lottoscheinziehungList) {
		this.lottoscheinziehungList = lottoscheinziehungList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (lottoscheinid != null ? lottoscheinid.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Lottoschein)) {
			return false;
		}
		Lottoschein other = (Lottoschein) object;
		if ((this.lottoscheinid == null && other.lottoscheinid != null)
			|| (this.lottoscheinid != null
				&& !this.lottoscheinid.equals(other.lottoscheinid))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "wbs.corejpa.persistence.Lottoschein[ lottoscheinid=" + lottoscheinid
			+ " ]";
	}

//	#################################################
	@Override
	public Long getId() {
		return getLottoscheinid();
	}

	@Override
	public void setId(Long id) {
		setLottoscheinid(id);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
}
