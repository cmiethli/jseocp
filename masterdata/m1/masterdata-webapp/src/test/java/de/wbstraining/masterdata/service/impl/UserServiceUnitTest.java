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
import de.wbstraining.masterdata.persistence.dao.IUserJpaDao;
import de.wbstraining.masterdata.persistence.model.User;
import de.wbstraining.test.common.service.AbstractServiceUnitTest;

public class UserServiceUnitTest extends AbstractServiceUnitTest<User> {

    UserServiceImpl instance;

    private IUserJpaDao daoMock;

    // fixtures

    @Override
    @Before
    public final void before() {
        instance = new UserServiceImpl();

        daoMock = mock(IUserJpaDao.class);
        when(daoMock.save(any(User.class))).thenReturn(new User());
        when(daoMock.findAll()).thenReturn(Lists.<User> newArrayList());
        instance.dao = daoMock;
        super.before();
    }

    // get

    // mocking behavior

    @Override
    protected final User configureGet(final long id) {
        final User entity = new User();
        entity.setId(id);
		when(daoMock.findById(id)).thenReturn(Optional.of(entity));
        return entity;
    }

    // template method

    @Override
    protected final UserServiceImpl getApi() {
        return instance;
    }

    @Override
    protected final JpaRepository<User, Long> getDAO() {
        return daoMock;
    }

    @Override
    protected final User createNewEntity() {
        return FixtureEntityFactory.createNewUser();
    }

    @Override
    protected void changeEntity(final User entity) {
        entity.setPassword(randomAlphabetic(8));
    }

}
