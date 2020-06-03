package de.wbstraining.masterdata.persistence.model.meta;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import de.wbstraining.masterdata.persistence.model.Kunde;
import de.wbstraining.masterdata.persistence.model.UserRoles;
import de.wbstraining.masterdata.persistence.model.Users2;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Users2.class)
public abstract class Users2_ {

	public static volatile SingularAttribute<Users2, String> password;
	public static volatile SingularAttribute<Users2, String> name;
	public static volatile SingularAttribute<Users2, Long> userId;
	public static volatile SingularAttribute<Users2, String> username;
	public static volatile ListAttribute<Users2, UserRoles> userRolesList;
	public static volatile SingularAttribute<Users2, Kunde> kunde;

	public static final String PASSWORD = "password";
	public static final String NAME = "name";
	public static final String USER_ID = "userId";
	public static final String USERNAME = "username";
	public static final String USER_ROLES_LIST = "userRolesList";
	public static final String KUNDE = "kunde";

}
