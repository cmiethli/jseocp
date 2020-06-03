package de.wbstraining.masterdata.persistence.model;

import java.sql.Timestamp;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Computer.class)
public abstract class Computer_ {

	public static volatile SingularAttribute<Computer, Integer> computerBiosVendorId;
	public static volatile SingularAttribute<Computer, Integer> computerDeployStateId;
	public static volatile SingularAttribute<Computer, String> motherboard;
	public static volatile SingularAttribute<Computer, String> ipAddress;
	public static volatile SingularAttribute<Computer, String> systemVersion;
	public static volatile SingularAttribute<Computer, Integer> computerCaseTypeId;
	public static volatile SingularAttribute<Computer, Timestamp> lastUpdated;
	public static volatile SingularAttribute<Computer, String> macAddress;
	public static volatile SingularAttribute<Computer, String> name;
	public static volatile SingularAttribute<Computer, Date> biosDate;
	public static volatile SingularAttribute<Computer, Long> id;
	public static volatile SingularAttribute<Computer, String> ramSizeByte;
	public static volatile SingularAttribute<Computer, Integer> computerTypeId;
	public static volatile SingularAttribute<Computer, Integer> computerHarddiskId;
	public static volatile SingularAttribute<Computer, Date> ipLeaseDate;

	public static final String COMPUTER_BIOS_VENDOR_ID = "computerBiosVendorId";
	public static final String COMPUTER_DEPLOY_STATE_ID = "computerDeployStateId";
	public static final String MOTHERBOARD = "motherboard";
	public static final String IP_ADDRESS = "ipAddress";
	public static final String SYSTEM_VERSION = "systemVersion";
	public static final String COMPUTER_CASE_TYPE_ID = "computerCaseTypeId";
	public static final String LAST_UPDATED = "lastUpdated";
	public static final String MAC_ADDRESS = "macAddress";
	public static final String NAME = "name";
	public static final String BIOS_DATE = "biosDate";
	public static final String ID = "id";
	public static final String RAM_SIZE_BYTE = "ramSizeByte";
	public static final String COMPUTER_TYPE_ID = "computerTypeId";
	public static final String COMPUTER_HARDDISK_ID = "computerHarddiskId";
	public static final String IP_LEASE_DATE = "ipLeaseDate";

}

