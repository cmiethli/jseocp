/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.wbstraining.masterdata.persistence.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Optional;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "lottoscheinziehung6aus49")
@NamedQueries({
	@NamedQuery(name = "Lottoscheinziehung6aus49.findAll", query = "SELECT l FROM Lottoscheinziehung6aus49 l"),
	@NamedQuery(name = "Lottoscheinziehung6aus49.findByLottoscheinziehung6aus49id", query = "SELECT l FROM Lottoscheinziehung6aus49 l WHERE l.lottoscheinziehung6aus49id = :lottoscheinziehung6aus49id"),
	@NamedQuery(name = "Lottoscheinziehung6aus49.findByTippnr", query = "SELECT l FROM Lottoscheinziehung6aus49 l WHERE l.tippnr = :tippnr"),
	@NamedQuery(name = "Lottoscheinziehung6aus49.findByCreated", query = "SELECT l FROM Lottoscheinziehung6aus49 l WHERE l.created = :created"),
	@NamedQuery(name = "Lottoscheinziehung6aus49.findByLastmodified", query = "SELECT l FROM Lottoscheinziehung6aus49 l WHERE l.lastmodified = :lastmodified"),
	@NamedQuery(name = "Lottoscheinziehung6aus49.findByVersion", query = "SELECT l FROM Lottoscheinziehung6aus49 l WHERE l.version = :version"),
	@NamedQuery(name = "Lottoscheinziehung6aus49.findByGewinn", query = "SELECT l FROM Lottoscheinziehung6aus49 l WHERE l.gewinn = :gewinn") })
@XmlRootElement()
public class Lottoscheinziehung6aus49
	implements INameableEntity, INameableDto, Serializable {

	private static final long serialVersionUID = 1L;
	private static final String GENERATOR_NAME = "seqGen_"
		+ MasterdataMappings.Singular.LOTTOSCHEINZIEHUNG6AUS49;

	@Id
	@GeneratedValue(generator = GENERATOR_NAME)
	@GenericGenerator(name = GENERATOR_NAME, strategy = "de.wbstraining.masterdata.persistence.generator.IdAndNameGenerator", //
		parameters = {
			@Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "20") })
	@Basic(optional = false)
	@Column(name = "lottoscheinziehung6aus49id")
	private Long lottoscheinziehung6aus49id;

	@Column(nullable = false, unique = true)
	private String name;

	@Basic(optional = false)
	@NotNull
	@Column(name = "tippnr")
	private int tippnr;
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
	@Column(name = "gewinn")
	private Long gewinn;
	@JoinColumn(name = "gewinnklasseid", referencedColumnName = "gewinnklasseid")
	@ManyToOne(optional = false)
	private Gewinnklasse gewinnklasse;
	@JoinColumn(name = "lottoscheinziehungid", referencedColumnName = "lottoscheinziehungid")
	@ManyToOne(optional = false)
	private Lottoscheinziehung lottoscheinziehung;

	{// vor jedem KonstruktorAufruf
		created = Optional.ofNullable(created)
			.orElse(LocalDateTime.now());
		lastmodified = Optional.ofNullable(lastmodified)
			.orElse(LocalDateTime.now());
	}

	public Lottoscheinziehung6aus49() {
	}

	public Lottoscheinziehung6aus49(Long lottoscheinziehung6aus49id) {
		this.lottoscheinziehung6aus49id = lottoscheinziehung6aus49id;
	}

	public Lottoscheinziehung6aus49(Long lottoscheinziehung6aus49id, int tippnr,
		LocalDateTime created, LocalDateTime lastmodified) {
		this.lottoscheinziehung6aus49id = lottoscheinziehung6aus49id;
		this.tippnr = tippnr;
		this.created = created;
		this.lastmodified = lastmodified;
	}

	public Long getLottoscheinziehung6aus49id() {
		return lottoscheinziehung6aus49id;
	}

	public void setLottoscheinziehung6aus49id(Long lottoscheinziehung6aus49id) {
		this.lottoscheinziehung6aus49id = lottoscheinziehung6aus49id;
	}

	public int getTippnr() {
		return tippnr;
	}

	public void setTippnr(int tippnr) {
		this.tippnr = tippnr;
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

	public Long getGewinn() {
		return gewinn;
	}

	public void setGewinn(Long gewinn) {
		this.gewinn = gewinn;
	}

	public Gewinnklasse getGewinnklasse() {
		return gewinnklasse;
	}

	public void setGewinnklasse(Gewinnklasse gewinnklasseid) {
		this.gewinnklasse = gewinnklasseid;
	}

	public Lottoscheinziehung getLottoscheinziehung() {
		return lottoscheinziehung;
	}

	public void setLottoscheinziehung(Lottoscheinziehung lottoscheinziehungid) {
		this.lottoscheinziehung = lottoscheinziehungid;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (lottoscheinziehung6aus49id != null
			? lottoscheinziehung6aus49id.hashCode()
			: 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not
		// set
		if (!(object instanceof Lottoscheinziehung6aus49)) {
			return false;
		}
		Lottoscheinziehung6aus49 other = (Lottoscheinziehung6aus49) object;
		if ((this.lottoscheinziehung6aus49id == null
			&& other.lottoscheinziehung6aus49id != null)
			|| (this.lottoscheinziehung6aus49id != null
				&& !this.lottoscheinziehung6aus49id
					.equals(other.lottoscheinziehung6aus49id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "wbs.corejpa.persistence.Lottoscheinziehung6aus49[ lottoscheinziehung6aus49id="
			+ lottoscheinziehung6aus49id + " ]";
	}

//################################# Spring ########################
	@Override
	public Long getId() {
		return lottoscheinziehung6aus49id;
	}

	@Override
	public void setId(Long id) {
		this.lottoscheinziehung6aus49id = id;
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
