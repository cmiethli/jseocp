package de.wbstraining.masterdata.persistence.model.meta;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import de.wbstraining.masterdata.persistence.model.Privilege;
import de.wbstraining.masterdata.persistence.model.Role;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Role.class)
public abstract class Role_ {

    public static volatile SingularAttribute<Role, Long> id;
    public static volatile SingularAttribute<Role, String> name;
    public static volatile SetAttribute<Role, Privilege> privileges;

}
