package de.wbstraining.masterdata.persistence.model.meta;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import de.wbstraining.masterdata.persistence.model.Groups;
import de.wbstraining.masterdata.persistence.model.Kunde;
import de.wbstraining.masterdata.persistence.model.Users;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Users.class)
public abstract class Users_ {

	public static volatile SingularAttribute<Users, String> firstName;
	public static volatile SingularAttribute<Users, String> lastName;
	public static volatile SingularAttribute<Users, String> password;
	public static volatile SingularAttribute<Users, String> name;
	public static volatile SingularAttribute<Users, String> middleName;
	public static volatile ListAttribute<Users, Groups> groupsList;
	public static volatile SingularAttribute<Users, Long> userId;
	public static volatile SingularAttribute<Users, String> username;
	public static volatile SingularAttribute<Users, Kunde> kunde;

	public static final String FIRST_NAME = "firstName";
	public static final String LAST_NAME = "lastName";
	public static final String PASSWORD = "password";
	public static final String NAME = "name";
	public static final String MIDDLE_NAME = "middleName";
	public static final String GROUPS_LIST = "groupsList";
	public static final String USER_ID = "userId";
	public static final String USERNAME = "username";
	public static final String KUNDE = "kunde";

}
