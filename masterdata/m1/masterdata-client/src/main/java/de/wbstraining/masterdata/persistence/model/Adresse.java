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
import javax.validation.constraints.Size;
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
@Table(name = "adresse")
@NamedQueries({
	@NamedQuery(name = "Adresse.findAll", query = "SELECT a FROM Adresse a"),
	@NamedQuery(name = "Adresse.findByAdresseid", query = "SELECT a FROM Adresse a WHERE a.adresseid = :adresseid"),
	@NamedQuery(name = "Adresse.findByAdressenr", query = "SELECT a FROM Adresse a WHERE a.adressenr = :adressenr"),
	@NamedQuery(name = "Adresse.findByStrasse", query = "SELECT a FROM Adresse a WHERE a.strasse = :strasse"),
	@NamedQuery(name = "Adresse.findByHausnummer", query = "SELECT a FROM Adresse a WHERE a.hausnummer = :hausnummer"),
	@NamedQuery(name = "Adresse.findByAdresszusatz", query = "SELECT a FROM Adresse a WHERE a.adresszusatz = :adresszusatz"),
	@NamedQuery(name = "Adresse.findByPlz", query = "SELECT a FROM Adresse a WHERE a.plz = :plz"),
	@NamedQuery(name = "Adresse.findByOrt", query = "SELECT a FROM Adresse a WHERE a.ort = :ort"),
	@NamedQuery(name = "Adresse.findByLand", query = "SELECT a FROM Adresse a WHERE a.land = :land"),
	@NamedQuery(name = "Adresse.findByCreated", query = "SELECT a FROM Adresse a WHERE a.created = :created"),
	@NamedQuery(name = "Adresse.findByLastmodified", query = "SELECT a FROM Adresse a WHERE a.lastmodified = :lastmodified"),
	@NamedQuery(name = "Adresse.findByVersion", query = "SELECT a FROM Adresse a WHERE a.version = :version") })
@XmlRootElement()
public class Adresse implements INameableEntity, INameableDto, Serializable {

	private static final long serialVersionUID = 1L;
	private static final String GENERATOR_NAME = "seqGen_"
		+ MasterdataMappings.Singular.ADRESSE;

	@Id
	@GeneratedValue(generator = GENERATOR_NAME)
	@GenericGenerator(name = GENERATOR_NAME, strategy = "de.wbstraining.masterdata.persistence.generator.IdAndNameGenerator", //
		parameters = {
			@Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
	@Basic(optional = false)
	@Column(name = "adresseid")
	private Long adresseid;

	@Column(nullable = false, unique = true)
	private String name;

	@Basic(optional = false)
	@NotNull
	@Column(name = "adressenr")
	private int adressenr;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 255)
	@Column(name = "strasse")
	private String strasse;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 10)
	@Column(name = "hausnummer")
	private String hausnummer;
	@Size(max = 255)
	@Column(name = "adresszusatz")
	private String adresszusatz;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 10)
	@Column(name = "plz")
	private String plz;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 255)
	@Column(name = "ort")
	private String ort;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 255)
	@Column(name = "land")
	private String land;

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

	{// vor jedem KonstruktorAufruf
		this.name = org.apache.commons.lang3.RandomStringUtils.randomAlphabetic(10);
		created = Optional.ofNullable(created)
			.orElse(LocalDateTime.now());
		lastmodified = Optional.ofNullable(lastmodified)
			.orElse(LocalDateTime.now());
	}

	public Adresse() {
	}

	public Adresse(Long adresseid) {
		this.adresseid = adresseid;
	}

	public Adresse(Long adresseid, int adressenr, String strasse,
		String hausnummer, String plz, String ort, String land,
		LocalDateTime created, LocalDateTime lastmodified) {
		this.adresseid = adresseid;
		this.adressenr = adressenr;
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.plz = plz;
		this.ort = ort;
		this.land = land;
		this.created = created;
		this.lastmodified = lastmodified;
	}

	public Long getAdresseid() {
		return adresseid;
	}

	public void setAdresseid(Long adresseid) {
		this.adresseid = adresseid;
	}

	public int getAdressenr() {
		return adressenr;
	}

	public void setAdressenr(int adressenr) {
		this.adressenr = adressenr;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}

	public String getAdresszusatz() {
		return adresszusatz;
	}

	public void setAdresszusatz(String adresszusatz) {
		this.adresszusatz = adresszusatz;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
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

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (adresseid != null ? adresseid.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Adresse)) {
			return false;
		}
		Adresse other = (Adresse) object;
		if ((this.adresseid == null && other.adresseid != null)
			|| (this.adresseid != null && !this.adresseid.equals(other.adresseid))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "wbs.corejpa.persistence.Adresse[ adresseid=" + adresseid + " ]";
	}

//	################################# Spring ########################
	@Override
	public Long getId() {
		return adresseid;
	}

	@Override
	public void setId(Long id) {
		this.adresseid = id;
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
