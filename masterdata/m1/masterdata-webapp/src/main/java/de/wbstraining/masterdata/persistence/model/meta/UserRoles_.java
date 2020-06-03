package de.wbstraining.masterdata.persistence.model.meta;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import de.wbstraining.masterdata.persistence.model.UserRoles;
import de.wbstraining.masterdata.persistence.model.Users2;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserRoles.class)
public abstract class UserRoles_ {

	public static volatile SingularAttribute<UserRoles, Users2> users2;
	public static volatile SingularAttribute<UserRoles, String> role;
	public static volatile SingularAttribute<UserRoles, String> name;
	public static volatile SingularAttribute<UserRoles, String> userName;
	public static volatile SingularAttribute<UserRoles, Long> userRolesId;

	public static final String USERS2 = "users2";
	public static final String ROLE = "role";
	public static final String NAME = "name";
	public static final String USER_NAME = "userName";
	public static final String USER_ROLES_ID = "userRolesId";

}
