package de.wbstraining.masterdata.persistence.model.meta;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import de.wbstraining.masterdata.persistence.model.Groups;
import de.wbstraining.masterdata.persistence.model.Users;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Groups.class)
public abstract class Groups_ {

	public static volatile SingularAttribute<Groups, String> groupName;
	public static volatile ListAttribute<Groups, Users> usersList;
	public static volatile SingularAttribute<Groups, String> groupDesc;
	public static volatile SingularAttribute<Groups, Long> groupId;
	public static volatile SingularAttribute<Groups, String> name;

	public static final String GROUP_NAME = "groupName";
	public static final String USERS_LIST = "usersList";
	public static final String GROUP_DESC = "groupDesc";
	public static final String GROUP_ID = "groupId";
	public static final String NAME = "name";

}
