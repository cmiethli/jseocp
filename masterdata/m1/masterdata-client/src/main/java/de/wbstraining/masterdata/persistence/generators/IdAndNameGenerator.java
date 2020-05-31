package de.wbstraining.masterdata.persistence.generators;

import java.io.Serializable;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.enhanced.SequenceStyleGenerator;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.LongType;
import org.hibernate.type.Type;

import de.wbstraining.masterdata.persistence.model.Gebuehr;

//siehe u.a. https://thorben-janssen.com/custom-sequence-based-idgenerator/
public class IdAndNameGenerator extends SequenceStyleGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session,
		Object entity) throws HibernateException {
		Long currentId = (Long) super.generate(session, entity);
		Gebuehr g = (Gebuehr) entity;
		g.setName(String.valueOf(currentId));
		return currentId;
	}

	@Override
	public void configure(Type type, Properties params,
		ServiceRegistry serviceRegistry) throws MappingException {
		super.configure(LongType.INSTANCE, params, serviceRegistry);
	}
}
