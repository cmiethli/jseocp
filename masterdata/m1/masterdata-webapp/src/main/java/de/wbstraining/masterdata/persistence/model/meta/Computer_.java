package de.wbstraining.masterdata.persistence.model.meta;

import java.sql.Timestamp;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import de.wbstraining.masterdata.persistence.model.Computer;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Computer.class)
public abstract class Computer_ {

    public static volatile SingularAttribute<Computer, Integer> id;
    public static volatile SingularAttribute<Computer, String> name;
    public static volatile SingularAttribute<Computer, String> macAddress;
    public static volatile SingularAttribute<Computer, String> systemVersion;
    public static volatile SingularAttribute<Computer, Date> biosDate;
    public static volatile SingularAttribute<Computer, String> motherboard;
    public static volatile SingularAttribute<Computer, String> ramSizeByte;
    public static volatile SingularAttribute<Computer, String> ipAddress;
    public static volatile SingularAttribute<Computer, Date> ipLeaseDate;
    public static volatile SingularAttribute<Computer, Timestamp> lastUpdated;
    public static volatile SingularAttribute<Computer, Integer> computerTypeId;
    public static volatile SingularAttribute<Computer, Integer> computerHarddiskId;
    public static volatile SingularAttribute<Computer, Integer> computerCaseTypeId;
    public static volatile SingularAttribute<Computer, Integer> computerBiosVendorId;
    public static volatile SingularAttribute<Computer, Integer> computerDeployStateId;
   

}
