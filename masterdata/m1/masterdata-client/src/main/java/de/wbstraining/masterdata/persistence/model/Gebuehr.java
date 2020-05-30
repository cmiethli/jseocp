/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.wbstraining.masterdata.persistence.model;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import de.wbstraining.common.interfaces.INameableDto;
import de.wbstraining.common.persistence.model.INameableEntity;
import de.wbstraining.masterdata.persistence.util.LocalDateAttributeConverter;
import de.wbstraining.masterdata.persistence.util.LocalDateTimeAttributeConverter;

/**
 *
 * @author Günter
 */
@Entity
@Table(name = "gebuehr")
@NamedQueries({
	@NamedQuery(name = "Gebuehr.findAll", query = "SELECT g FROM Gebuehr g"),
	@NamedQuery(name = "Gebuehr.findByGebuehrid", query = "SELECT g FROM Gebuehr g WHERE g.gebuehrid = :gebuehrid"),
	@NamedQuery(name = "Gebuehr.findByGrundgebuehr", query = "SELECT g FROM Gebuehr g WHERE g.grundgebuehr = :grundgebuehr"),
	@NamedQuery(name = "Gebuehr.findByEinsatzprotipp", query = "SELECT g FROM Gebuehr g WHERE g.einsatzprotipp = :einsatzprotipp"),
	@NamedQuery(name = "Gebuehr.findByEinsatzspiel77", query = "SELECT g FROM Gebuehr g WHERE g.einsatzspiel77 = :einsatzspiel77"),
	@NamedQuery(name = "Gebuehr.findByEinsatzsuper6", query = "SELECT g FROM Gebuehr g WHERE g.einsatzsuper6 = :einsatzsuper6"),
	@NamedQuery(name = "Gebuehr.findByGueltigab", query = "SELECT g FROM Gebuehr g WHERE g.gueltigab = :gueltigab"),
	@NamedQuery(name = "Gebuehr.findByGueltigbis", query = "SELECT g FROM Gebuehr g WHERE g.gueltigbis = :gueltigbis"),
	@NamedQuery(name = "Gebuehr.findByCreated", query = "SELECT g FROM Gebuehr g WHERE g.created = :created"),
	@NamedQuery(name = "Gebuehr.findByLastmodified", query = "SELECT g FROM Gebuehr g WHERE g.lastmodified = :lastmodified"),
	@NamedQuery(name = "Gebuehr.findByVersion", query = "SELECT g FROM Gebuehr g WHERE g.version = :version") })
@XmlRootElement
public class Gebuehr implements INameableEntity, INameableDto, Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
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
	@Convert(converter = LocalDateAttributeConverter.class)
	private LocalDate gueltigab;
	@Column(name = "gueltigbis")
	@Convert(converter = LocalDateAttributeConverter.class)
	private LocalDate gueltigbis;
	@Basic(optional = false)
	@NotNull
	@Column(name = "created")
	@Convert(converter = LocalDateTimeAttributeConverter.class)
	private LocalDateTime created;
	@Basic(optional = false)
	@NotNull
	@Column(name = "lastmodified")
	@Convert(converter = LocalDateTimeAttributeConverter.class)
	private LocalDateTime lastmodified;

	@Column(name = "version")
	private Integer version;

	public Gebuehr() {
		this.name = randomAlphabetic(10);
	}

	public Gebuehr(Long gebuehrid) {
		this.gebuehrid = gebuehrid;
		this.name = randomAlphabetic(10);
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
		this.name = randomAlphabetic(10);
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
