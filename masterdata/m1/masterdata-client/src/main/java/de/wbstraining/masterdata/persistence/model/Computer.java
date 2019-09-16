package de.wbstraining.masterdata.persistence.model;

import java.sql.Timestamp;
import java.util.Date;

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

@Entity
@XmlRootElement
@Table(name = "computer")
public class Computer implements INameableEntity, INameableDto {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", insertable = false, nullable = false)
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "macAddress")
	private String macAddress;

	@Column(name = "systemVersion")
	private String systemVersion;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm a z")
	@Column(name = "biosDate")
	private Date biosDate;

	@Column(name = "motherboard")
	private String motherboard;

	@Column(name = "ramSizeByte")
	private String ramSizeByte;

	@Column(name = "ipAddress")
	private String ipAddress;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm a z")
	@Column(name = "ipLeaseDate")
	private Date ipLeaseDate;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm a z")
	@Column(name = "lastUpdated")
	private Timestamp lastUpdated;

	@Column(name = "computerType_id")
	private Integer computerTypeId;

	@Column(name = "computerHarddisk_id")
	private Integer computerHarddiskId;

	@Column(name = "computerCaseType_id")
	private Integer computerCaseTypeId;

	@Column(name = "computerBiosVendor_id")
	private Integer computerBiosVendorId;

	@Column(name = "computerDeployState_id")
	private Integer computerDeployStateId;

	@Override
	public Long getId() {
		return Long.valueOf(id);
	}

	@Override
	public void setId(Long id) {
		this.id = id.intValue();

	}

	@Override
	public String getName() {
		return name;
	}

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public String getSystemVersion() {
		return systemVersion;
	}

	public void setSystemVersion(String systemVersion) {
		this.systemVersion = systemVersion;
	}

	public Date getBiosDate() {
		return biosDate;
	}

	public void setBiosDate(Date biosDate) {
		this.biosDate = biosDate;
	}

	public String getMotherboard() {
		return motherboard;
	}

	public void setMotherboard(String motherboard) {
		this.motherboard = motherboard;
	}

	public String getRamSizeByte() {
		return ramSizeByte;
	}

	public void setRamSizeByte(String ramSizeByte) {
		this.ramSizeByte = ramSizeByte;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Date getIpLeaseDate() {
		return ipLeaseDate;
	}

	public void setIpLeaseDate(Date ipLeaseDate) {
		this.ipLeaseDate = ipLeaseDate;
	}

	public Timestamp getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Timestamp lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public Integer getComputerTypeId() {
		return computerTypeId;
	}

	public void setComputerTypeId(Integer computerTypeId) {
		this.computerTypeId = computerTypeId;
	}

	public Integer getComputerHarddiskId() {
		return computerHarddiskId;
	}

	public void setComputerHarddiskId(Integer computerHarddiskId) {
		this.computerHarddiskId = computerHarddiskId;
	}

	public Integer getComputerCaseTypeId() {
		return computerCaseTypeId;
	}

	public void setComputerCaseTypeId(Integer computerCaseTypeId) {
		this.computerCaseTypeId = computerCaseTypeId;
	}

	public Integer getComputerBiosVendorId() {
		return computerBiosVendorId;
	}

	public void setComputerBiosVendorId(Integer computerBiosVendorId) {
		this.computerBiosVendorId = computerBiosVendorId;
	}

	public Integer getComputerDeployStateId() {
		return computerDeployStateId;
	}

	public void setComputerDeployStateId(Integer computerDeployStateId) {
		this.computerDeployStateId = computerDeployStateId;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	 @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + ((name == null) ? 0 : name.hashCode());
	        return result;
	    }

	    @Override
	    public boolean equals(final Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        final Computer other = (Computer) obj;
	        if (name == null) {
	            if (other.name != null)
	                return false;
	        } else if (!name.equals(other.name))
	            return false;
	        return true;
	    }
	

}