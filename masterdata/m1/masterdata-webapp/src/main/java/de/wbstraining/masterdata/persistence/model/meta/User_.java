package de.wbstraining.masterdata.persistence.model.meta;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import de.wbstraining.masterdata.persistence.model.Role;
import de.wbstraining.masterdata.persistence.model.User;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ {

    public static volatile SingularAttribute<User, Long> id;
    public static volatile SetAttribute<User, Role> roles;
    public static volatile SingularAttribute<User, String> name;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, Boolean> locked;

}
