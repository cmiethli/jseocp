package de.wbstraining.masterdata.persistence.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Privilege.class)
public abstract class Privilege_ {

	public static volatile SingularAttribute<Privilege, String> name;
	public static volatile SingularAttribute<Privilege, String> description;
	public static volatile SingularAttribute<Privilege, Long> id;

	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";

}

