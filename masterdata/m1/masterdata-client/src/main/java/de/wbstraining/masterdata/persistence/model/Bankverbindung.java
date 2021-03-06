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
@Table(name = "bankverbindung")
@NamedQueries({
	@NamedQuery(name = "Bankverbindung.findAll", query = "SELECT b FROM Bankverbindung b"),
	@NamedQuery(name = "Bankverbindung.findByBankverbindungid", query = "SELECT b FROM Bankverbindung b WHERE b.bankverbindungid = :bankverbindungid"),
	@NamedQuery(name = "Bankverbindung.findByBankverbindungnr", query = "SELECT b FROM Bankverbindung b WHERE b.bankverbindungnr = :bankverbindungnr"),
	@NamedQuery(name = "Bankverbindung.findByIban", query = "SELECT b FROM Bankverbindung b WHERE b.iban = :iban"),
	@NamedQuery(name = "Bankverbindung.findByBic", query = "SELECT b FROM Bankverbindung b WHERE b.bic = :bic"),
//	@NamedQuery(name = "Bankverbindung.findByName", query = "SELECT b FROM Bankverbindung b WHERE b.name = :name"),
	@NamedQuery(name = "Bankverbindung.findByKontoinhaber", query = "SELECT b FROM Bankverbindung b WHERE b.kontoinhaber = :kontoinhaber"),
	@NamedQuery(name = "Bankverbindung.findByCreated", query = "SELECT b FROM Bankverbindung b WHERE b.created = :created"),
	@NamedQuery(name = "Bankverbindung.findByLastmodified", query = "SELECT b FROM Bankverbindung b WHERE b.lastmodified = :lastmodified"),
	@NamedQuery(name = "Bankverbindung.findByVersion", query = "SELECT b FROM Bankverbindung b WHERE b.version = :version") })
@XmlRootElement()
public class Bankverbindung
	implements INameableEntity, INameableDto, Serializable {

	private static final long serialVersionUID = 1L;
	private static final String GENERATOR_NAME = "seqGen_"
		+ MasterdataMappings.Singular.BANKVERBINDUNG;

	@Id
	@GeneratedValue(generator = GENERATOR_NAME)
	@GenericGenerator(name = GENERATOR_NAME, strategy = "de.wbstraining.masterdata.persistence.generator.IdAndNameGenerator", //
		parameters = {
			@Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
	@Basic(optional = false)
	@Column(name = "bankverbindungid")
	private Long bankverbindungid;

	@Column(nullable = false, unique = true)
	private String name;

	@Basic(optional = false)
	@NotNull
	@Column(name = "bankverbindungnr")
	private int bankverbindungnr;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 30)
	@Column(name = "iban")
	private String iban;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 15)
	@Column(name = "bic")
	private String bic;
	@Size(max = 255)
	@Column(name = "name2")
	private String name2;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 255)
	@Column(name = "kontoinhaber")
	private String kontoinhaber;
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
		created = Optional.ofNullable(created)
			.orElse(LocalDateTime.now());
		lastmodified = Optional.ofNullable(lastmodified)
			.orElse(LocalDateTime.now());
	}

	public Bankverbindung() {
	}

	public Bankverbindung(Long bankverbindungid) {
		this.bankverbindungid = bankverbindungid;
	}

	public Bankverbindung(Long bankverbindungid, int bankverbindungnr,
		String iban, String bic, String kontoinhaber, LocalDateTime created,
		LocalDateTime lastmodified) {
		this.bankverbindungid = bankverbindungid;
		this.bankverbindungnr = bankverbindungnr;
		this.iban = iban;
		this.bic = bic;
		this.kontoinhaber = kontoinhaber;
		this.created = created;
		this.lastmodified = lastmodified;
	}

	public Long getBankverbindungid() {
		return bankverbindungid;
	}

	public void setBankverbindungid(Long bankverbindungid) {
		this.bankverbindungid = bankverbindungid;
	}

	public int getBankverbindungnr() {
		return bankverbindungnr;
	}

	public void setBankverbindungnr(int bankverbindungnr) {
		this.bankverbindungnr = bankverbindungnr;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name) {
		this.name2 = name;
	}

	public String getKontoinhaber() {
		return kontoinhaber;
	}

	public void setKontoinhaber(String kontoinhaber) {
		this.kontoinhaber = kontoinhaber;
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
		hash += (bankverbindungid != null ? bankverbindungid.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Bankverbindung)) {
			return false;
		}
		Bankverbindung other = (Bankverbindung) object;
		if ((this.bankverbindungid == null && other.bankverbindungid != null)
			|| (this.bankverbindungid != null
				&& !this.bankverbindungid.equals(other.bankverbindungid))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "wbs.corejpa.persistence.Bankverbindung[ bankverbindungid="
			+ bankverbindungid + " ]";
	}

	// #################################### neu
	@Override
	public Long getId() {
		return bankverbindungid;
	}

	@Override
	public void setId(Long id) {
		this.bankverbindungid = id;
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
