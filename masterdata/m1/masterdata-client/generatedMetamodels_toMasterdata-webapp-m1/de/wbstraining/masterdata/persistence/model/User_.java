package de.wbstraining.masterdata.persistence.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ {

	public static volatile SingularAttribute<User, String> password;
	public static volatile SetAttribute<User, Role> roles;
	public static volatile SingularAttribute<User, String> name;
	public static volatile SingularAttribute<User, Long> id;
	public static volatile SingularAttribute<User, Boolean> locked;
	public static volatile SingularAttribute<User, String> email;

	public static final String PASSWORD = "password";
	public static final String ROLES = "roles";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String LOCKED = "locked";
	public static final String EMAIL = "email";

}

