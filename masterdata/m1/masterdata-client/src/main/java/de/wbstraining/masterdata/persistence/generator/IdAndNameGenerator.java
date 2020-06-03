package de.wbstraining.masterdata.persistence.generator;

import java.io.Serializable;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.enhanced.SequenceStyleGenerator;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.LongType;
import org.hibernate.type.Type;

import de.wbstraining.common.persistence.model.INameableEntity;

//siehe u.a. https://thorben-janssen.com/custom-sequence-based-idgenerator/
public class IdAndNameGenerator extends SequenceStyleGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session,
		Object entityObj) throws HibernateException {
		Long currentId = (Long) super.generate(session, entityObj);
//		generisch entity.setName() bekommen
		if (entityObj instanceof INameableEntity) {
			INameableEntity entity = (INameableEntity) entityObj;
			if (entity.getName() == null) {
				entity.setName(String.valueOf(currentId));
			}
		}
		return currentId;
	}

	@Override
	public void configure(Type type, Properties params,
		ServiceRegistry serviceRegistry) throws MappingException {
		super.configure(LongType.INSTANCE, params, serviceRegistry);
	}
}
