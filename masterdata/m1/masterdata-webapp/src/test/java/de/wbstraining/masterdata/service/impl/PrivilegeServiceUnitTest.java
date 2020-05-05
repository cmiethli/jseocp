package de.wbstraining.masterdata.service.impl;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Before;
import org.springframework.data.jpa.repository.JpaRepository;

import com.google.common.collect.Lists;

import de.wbstraining.masterdata.common.FixtureEntityFactory;
import de.wbstraining.masterdata.persistence.dao.IPrivilegeJpaDao;
import de.wbstraining.masterdata.persistence.model.Privilege;
import de.wbstraining.test.common.service.AbstractServiceUnitTest;
import de.wbstraining.test.common.util.IDUtil;

public class PrivilegeServiceUnitTest extends AbstractServiceUnitTest<Privilege> {

    private PrivilegeServiceImpl instance;

    private IPrivilegeJpaDao daoMock;

    // fixtures

    @Override
    @Before
    public final void before() {
        instance = new PrivilegeServiceImpl();

        daoMock = mock(IPrivilegeJpaDao.class);
        when(daoMock.save(any(Privilege.class))).thenReturn(new Privilege());
        when(daoMock.findAll()).thenReturn(Lists.<Privilege> newArrayList());
        instance.dao = daoMock;
        super.before();
    }

    // get

    // mocking behavior

    @Override
    protected final Privilege configureGet(final long id) {
        final Privilege entity = new Privilege();
        entity.setId(id);
		when(daoMock.findById(id)).thenReturn(Optional.of(entity));
        return entity;
    }

    // template method

    @Override
    protected final PrivilegeServiceImpl getApi() {
        return instance;
    }

    @Override
    protected final JpaRepository<Privilege, Long> getDAO() {
        return daoMock;
    }

    @Override
    protected Privilege createNewEntity() {
        final Privilege newPrivilege = FixtureEntityFactory.createNewPrivilege();
        newPrivilege.setId(IDUtil.randomPositiveLong());
        return newPrivilege;
    }

    @Override
    protected void changeEntity(final Privilege entity) {
        entity.setName(randomAlphabetic(8));
    }

}
