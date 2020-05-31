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
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

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
	@GeneratedValue(generator = "seq_id")
	@GenericGenerator(name = "seq_id", strategy = "de.wbstraining.masterdata.persistence.generators.IdAndNameGenerator", //
		parameters = {
			@Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
	@Basic(optional = false)
	@Column(name = "gebuehrid", nullable = false)
	private Long id;
// name wird im IdAndNameGenerator.java gesetzt >> name=id
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

	{// vor jeden KonstruktorAufruf
		created = Optional.ofNullable(created)
			.orElse(LocalDateTime.now());
		lastmodified = Optional.ofNullable(lastmodified)
			.orElse(LocalDateTime.now());
	}

	public Gebuehr() {
	}

	public Gebuehr(Long gebuehrid) {
		this.id = gebuehrid;
	}

	public Gebuehr(Long gebuehrid, int grundgebuehr, int einsatzprotipp,
		int einsatzspiel77, int einsatzsuper6, LocalDateTime created,
		LocalDateTime lastmodified) {
		this.id = gebuehrid;
		this.grundgebuehr = grundgebuehr;
		this.einsatzprotipp = einsatzprotipp;
		this.einsatzspiel77 = einsatzspiel77;
		this.einsatzsuper6 = einsatzsuper6;
		this.created = created;
		this.lastmodified = lastmodified;
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
		hash += (id != null ? id.hashCode() : 0);
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
		if ((this.id == null && other.id != null)
			|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "wbs.corejpa.persistence.Gebuehr[ gebuehrid=" + id + " ]";
	}
// ####################### new ##################################

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
