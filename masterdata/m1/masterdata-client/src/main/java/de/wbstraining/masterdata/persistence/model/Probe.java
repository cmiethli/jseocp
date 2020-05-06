package de.wbstraining.masterdata.persistence.model;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonFormat;

import de.wbstraining.common.interfaces.INameableDto;
import de.wbstraining.common.persistence.model.INameableEntity;
import de.wbstraining.common.util.Constants;

@Entity
@XmlRootElement
@Table(name = "probe")
public class Probe implements INameableEntity, INameableDto {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", insertable = false, nullable = false)
	private Long probeId;

	@Column(nullable = false)
	private String name;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
	@Column(name = "zeitpunkt")
	private LocalDateTime zeitpunkt;

	@Column(name = "messwert", nullable = true)
	private Integer messwert;

	@Column(name = "ergebnis", nullable = true)
	private String ergebnis;

	private static long nameL = 1;

	public Probe() {
		this.name = String.valueOf(nameL++);
	}

	public Probe(LocalDateTime zeitpunkt, Integer messwert) {
		this.name = String.valueOf(nameL++);
		this.zeitpunkt = zeitpunkt;
		this.messwert = messwert;
		berechneErgebnis();
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(final String nameToSet) {
		name = nameToSet;
	}

	@Override
	public Long getId() {
		return probeId;
	}

	@Override
	public void setId(Long id) {
		this.probeId = id;
	}

	public LocalDateTime getZeitpunkt() {
		return zeitpunkt;
	}

	public void setZeitpunkt(LocalDateTime zeitpunkt) {
		this.zeitpunkt = zeitpunkt;
	}

	public Integer getMesswert() {
		return messwert;
	}

	public void setMesswert(Integer messwert) {
		testMesswert(messwert);
		this.messwert = messwert;
		berechneErgebnis();
	}

	public String getErgebnis() {
		return ergebnis;
	}

	public void setErgebnis(String ergebnis) {
		this.ergebnis = ergebnis;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return this.getId()
				.hashCode();
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Probe)) {
			return false;
		}

		Probe other = (Probe) object;
		if (this.getId() == other.getId()) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd");
//	  		Java12 Feature
		String formatKilosStr;
		if (messwert == null) {
			formatKilosStr = null;
		} else {
			NumberFormat formatKilos = NumberFormat.getCompactNumberInstance(
					new Locale("en", "US"), NumberFormat.Style.SHORT);
			formatKilos.setMaximumFractionDigits(1);
			formatKilosStr = formatKilos.format(messwert);
		}

		return String.format("[id=%3d, zeit=%8s, messwert=%5s, ergebnis=%s",
				probeId, zeitpunkt.format(formatter), formatKilosStr, ergebnis + "]");
//	  		return "[id=" + probeId + ", zeit="
//	  				+ zeitpunkt.truncatedTo(ChronoUnit.MINUTES)
//	  						.toLocalDate()
//	  				+ ", mw=" + messwert + ", erg=" + ergebnis + "]";
	}

//		Enum
	public static enum Ergebnis {
		POSITIV, NEGATIV, FRAGLICH
	}

//##################### Helper Meths ##################
	private void berechneErgebnis() {
		if (messwert > Constants.MW_UPPER_BOUND_FRAGLICH) {
//			ergebnis = Ergebnis.POSITIV;
			ergebnis = "POSITIV";
		} else if (messwert >= Constants.MW_LOWER_BOUND_FRAGLICH
				&& messwert <= Constants.MW_UPPER_BOUND_FRAGLICH) {
//			ergebnis = Ergebnis.FRAGLICH;
			ergebnis = "FRAGLICH";
		} else {
//			ergebnis = Ergebnis.NEGATIV;
			ergebnis = "NEGATIV";
		}
	}

	private void testMesswert(Integer messwert) {
		if (messwert < Constants.MW_LOWER_BOUND
				|| messwert > Constants.MW_UPPER_BOUND) {
			throw new IllegalArgumentException("invalid messwert:" + messwert);
		}
	}
}