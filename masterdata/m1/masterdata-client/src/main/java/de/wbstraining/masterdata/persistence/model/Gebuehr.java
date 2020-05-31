/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.wbstraining.masterdata.persistence.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonFormat;

import de.wbstraining.common.interfaces.INameableDto;
import de.wbstraining.common.persistence.model.INameableEntity;

/**
 *
 * @author Günter
 */
@Entity
@Table(name = "gebuehr")
@XmlRootElement
public class Gebuehr implements INameableEntity, INameableDto, Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	@SequenceGenerator(name = "seq", initialValue = 1, allocationSize = 10)
	@Column(name = "gebuehrid")
	private Long gebuehrid;

	@Column(nullable = false, unique = true)
	private String name;

	@Basic(optional = false)
	@NotNull
	@Column(name = "grundgebuehr")
	private int grundgebuehr;
	@Basic(optional = false)
	@NotNull
	@Column(name = "einsatzprotipp")
	private int einsatzprotipp;
	@Basic(optional = false)
	@NotNull
	@Column(name = "einsatzspiel77")
	private int einsatzspiel77;
	@Basic(optional = false)
	@NotNull
	@Column(name = "einsatzsuper6")
	private int einsatzsuper6;
	@Column(name = "gueltigab")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate gueltigab;
	@Column(name = "gueltigbis")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate gueltigbis;
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

//vor jeden KonstruktorAufruf
	{
		this.name = org.apache.commons.lang3.RandomStringUtils.randomAlphabetic(10);
		created = Optional.ofNullable(created)
			.orElse(LocalDateTime.now());
		lastmodified = Optional.ofNullable(lastmodified)
			.orElse(LocalDateTime.now());
	}

	public Gebuehr() {
	}

	public Gebuehr(Long gebuehrid) {
		this.gebuehrid = gebuehrid;
	}

	public Gebuehr(Long gebuehrid, int grundgebuehr, int einsatzprotipp,
		int einsatzspiel77, int einsatzsuper6, LocalDateTime created,
		LocalDateTime lastmodified) {
		this.gebuehrid = gebuehrid;
		this.grundgebuehr = grundgebuehr;
		this.einsatzprotipp = einsatzprotipp;
		this.einsatzspiel77 = einsatzspiel77;
		this.einsatzsuper6 = einsatzsuper6;
		this.created = created;
		this.lastmodified = lastmodified;
	}

	public Long getGebuehrid() {
		return gebuehrid;
	}

	public void setGebuehrid(Long gebuehrid) {
		this.gebuehrid = gebuehrid;
	}

	public int getGrundgebuehr() {
		return grundgebuehr;
	}

	public void setGrundgebuehr(int grundgebuehr) {
		this.grundgebuehr = grundgebuehr;
	}

	public int getEinsatzprotipp() {
		return einsatzprotipp;
	}

	public void setEinsatzprotipp(int einsatzprotipp) {
		this.einsatzprotipp = einsatzprotipp;
	}

	public int getEinsatzspiel77() {
		return einsatzspiel77;
	}

	public void setEinsatzspiel77(int einsatzspiel77) {
		this.einsatzspiel77 = einsatzspiel77;
	}

	public int getEinsatzsuper6() {
		return einsatzsuper6;
	}

	public void setEinsatzsuper6(int einsatzsuper6) {
		this.einsatzsuper6 = einsatzsuper6;
	}

	public LocalDate getGueltigab() {
		return gueltigab;
	}

	public void setGueltigab(LocalDate gueltigab) {
		this.gueltigab = gueltigab;
	}

	public LocalDate getGueltigbis() {
		return gueltigbis;
	}

	public void setGueltigbis(LocalDate gueltigbis) {
		this.gueltigbis = gueltigbis;
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

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (gebuehrid != null ? gebuehrid.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not
		// set
		if (!(object instanceof Gebuehr)) {
			return false;
		}
		Gebuehr other = (Gebuehr) object;
		if ((this.gebuehrid == null && other.gebuehrid != null)
			|| (this.gebuehrid != null && !this.gebuehrid.equals(other.gebuehrid))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "wbs.corejpa.persistence.Gebuehr[ gebuehrid=" + gebuehrid + " ]";
	}
// ####################### new ##################################

	@Override
	public Long getId() {
		return gebuehrid;
	}

	@Override
	public void setId(Long id) {
		this.gebuehrid = id;
	}

	@Override
	public String getName() {
		return name;
	}
}
