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
@Table(name = "lottoscheinziehung")
@NamedQueries({
	@NamedQuery(name = "Lottoscheinziehung.findAll", query = "SELECT l FROM Lottoscheinziehung l"),
	@NamedQuery(name = "Lottoscheinziehung.findByLottoscheinziehungid", query = "SELECT l FROM Lottoscheinziehung l WHERE l.lottoscheinziehungid = :lottoscheinziehungid"),
	@NamedQuery(name = "Lottoscheinziehung.findByZiehungnr", query = "SELECT l FROM Lottoscheinziehung l WHERE l.ziehungnr = :ziehungnr"),
	@NamedQuery(name = "Lottoscheinziehung.findByIsabgeschlossen", query = "SELECT l FROM Lottoscheinziehung l WHERE l.isabgeschlossen = :isabgeschlossen"),
	@NamedQuery(name = "Lottoscheinziehung.findByIsletzteziehung", query = "SELECT l FROM Lottoscheinziehung l WHERE l.isletzteziehung = :isletzteziehung"),
	@NamedQuery(name = "Lottoscheinziehung.findByCreated", query = "SELECT l FROM Lottoscheinziehung l WHERE l.created = :created"),
	@NamedQuery(name = "Lottoscheinziehung.findByLastmodified", query = "SELECT l FROM Lottoscheinziehung l WHERE l.lastmodified = :lastmodified"),
	@NamedQuery(name = "Lottoscheinziehung.findByVersion", query = "SELECT l FROM Lottoscheinziehung l WHERE l.version = :version"),
	@NamedQuery(name = "Lottoscheinziehung.findByGewinnspiel77", query = "SELECT l FROM Lottoscheinziehung l WHERE l.gewinnspiel77 = :gewinnspiel77"),
	@NamedQuery(name = "Lottoscheinziehung.findByGewinnsuper6", query = "SELECT l FROM Lottoscheinziehung l WHERE l.gewinnsuper6 = :gewinnsuper6") })
@XmlRootElement()
public class Lottoscheinziehung
	implements INameableEntity, INameableDto, Serializable {

	private static final long serialVersionUID = 1L;
	private static final String GENERATOR_NAME = "seqGen_"
		+ MasterdataMappings.Singular.LOTTOSCHEINZIEHUNG;

	@Id
	@GeneratedValue(generator = GENERATOR_NAME)
	@GenericGenerator(name = GENERATOR_NAME, strategy = "de.wbstraining.masterdata.persistence.generator.IdAndNameGenerator", //
		parameters = {
			@Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "10") })
	@Basic(optional = false)
	@Column(name = "lottoscheinziehungid")
	private Long lottoscheinziehungid;

	@Column(nullable = false, unique = true)
	private String name;

	@Basic(optional = false)
	@NotNull
	@Column(name = "ziehungnr")
	private int ziehungnr;
	@Column(name = "isabgeschlossen")
	private Boolean isabgeschlossen;
	@Column(name = "isletzteziehung")
	private Boolean isletzteziehung;
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
	@Column(name = "gewinnspiel77")
	private Long gewinnspiel77;
	@Column(name = "gewinnsuper6")
	private Long gewinnsuper6;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "lottoscheinziehung")
	private List<Lottoscheinziehung6aus49> lottoscheinziehung6aus49List;
	@JoinColumn(name = "gewinnklasseidspiel77", referencedColumnName = "gewinnklasseid")
	@ManyToOne
	private Gewinnklasse gewinnklassespiel77;
	@JoinColumn(name = "gewinnklasseidsuper6", referencedColumnName = "gewinnklasseid")
	@ManyToOne
	private Gewinnklasse gewinnklassesuper6;
	@JoinColumn(name = "lottoscheinid", referencedColumnName = "lottoscheinid")
	@ManyToOne(optional = false)
	private Lottoschein lottoschein;
	@JoinColumn(name = "ziehungid", referencedColumnName = "ziehungid")
	@ManyToOne(optional = false)
	private Ziehung ziehung;

	{// vor jedem KonstruktorAufruf
		created = Optional.ofNullable(created)
			.orElse(LocalDateTime.now());
		lastmodified = Optional.ofNullable(lastmodified)
			.orElse(LocalDateTime.now());
	}

	public Lottoscheinziehung() {
	}

	public Lottoscheinziehung(Long lottoscheinziehungid) {
		this.lottoscheinziehungid = lottoscheinziehungid;
	}

	public Lottoscheinziehung(Long lottoscheinziehungid, int ziehungnr,
		LocalDateTime created, LocalDateTime lastmodified) {
		this.lottoscheinziehungid = lottoscheinziehungid;
		this.ziehungnr = ziehungnr;
		this.created = created;
		this.lastmodified = lastmodified;
	}

	public Long getLottoscheinziehungid() {
		return lottoscheinziehungid;
	}

	public void setLottoscheinziehungid(Long lottoscheinziehungid) {
		this.lottoscheinziehungid = lottoscheinziehungid;
	}

	public int getZiehungnr() {
		return ziehungnr;
	}

	public void setZiehungnr(int ziehungnr) {
		this.ziehungnr = ziehungnr;
	}

	public Boolean getIsabgeschlossen() {
		return isabgeschlossen;
	}

	public void setIsabgeschlossen(Boolean isabgeschlossen) {
		this.isabgeschlossen = isabgeschlossen;
	}

	public Boolean getIsletzteziehung() {
		return isletzteziehung;
	}

	public void setIsletzteziehung(Boolean isletzteziehung) {
		this.isletzteziehung = isletzteziehung;
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

	public Long getGewinnspiel77() {
		return gewinnspiel77;
	}

	public void setGewinnspiel77(Long gewinnspiel77) {
		this.gewinnspiel77 = gewinnspiel77;
	}

	public Long getGewinnsuper6() {
		return gewinnsuper6;
	}

	public void setGewinnsuper6(Long gewinnsuper6) {
		this.gewinnsuper6 = gewinnsuper6;
	}

	public List<Lottoscheinziehung6aus49> getLottoscheinziehung6aus49List() {
		return lottoscheinziehung6aus49List;
	}

	public void setLottoscheinziehung6aus49List(
		List<Lottoscheinziehung6aus49> lottoscheinziehung6aus49List) {
		this.lottoscheinziehung6aus49List = lottoscheinziehung6aus49List;
	}

	public Gewinnklasse getGewinnklassespiel77() {
		return gewinnklassespiel77;
	}

	public void setGewinnklassespiel77(Gewinnklasse gewinnklasseidspiel77) {
		this.gewinnklassespiel77 = gewinnklasseidspiel77;
	}

	public Gewinnklasse getGewinnklassesuper6() {
		return gewinnklassesuper6;
	}

	public void setGewinnklassesuper6(Gewinnklasse gewinnklasseidsuper6) {
		this.gewinnklassesuper6 = gewinnklasseidsuper6;
	}

	public Lottoschein getLottoschein() {
		return lottoschein;
	}

	public void setLottoschein(Lottoschein lottoscheinid) {
		this.lottoschein = lottoscheinid;
	}

	public Ziehung getZiehung() {
		return ziehung;
	}

	public void setZiehung(Ziehung ziehungid) {
		this.ziehung = ziehungid;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (lottoscheinziehungid != null ? lottoscheinziehungid.hashCode()
			: 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Lottoscheinziehung)) {
			return false;
		}
		Lottoscheinziehung other = (Lottoscheinziehung) object;
		if ((this.lottoscheinziehungid == null
			&& other.lottoscheinziehungid != null)
			|| (this.lottoscheinziehungid != null
				&& !this.lottoscheinziehungid.equals(other.lottoscheinziehungid))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "wbs.corejpa.persistence.Lottoscheinziehung[ lottoscheinziehungid="
			+ lottoscheinziehungid + " ]";
	}

//################################# Spring ########################
	@Override
	public Long getId() {
		return lottoscheinziehungid;
	}

	@Override
	public void setId(Long id) {
		this.lottoscheinziehungid = id;
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
