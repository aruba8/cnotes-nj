package dao;

import com.google.inject.Inject;
import models.User;
import ninja.jpa.UnitOfWork;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Provider;
import javax.persistence.EntityManager;


public class UserDaoImpl implements UserDao {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserDaoImpl.class);
    @Inject
    private Provider<EntityManager> entityManagerProvider;

    @UnitOfWork
    public void save(User user) {
        EntityManager entityManager = entityManagerProvider.get();
        entityManager.persist(user);
        LOGGER.info("User created id: {}", user.getId());
    }

}
