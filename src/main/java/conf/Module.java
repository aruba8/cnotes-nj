package conf;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import dao.UserDao;
import dao.UserDaoImpl;

@Singleton
public class Module extends AbstractModule {
    
    protected void configure() {
        bind(UserDao.class).to(UserDaoImpl.class);
    }

}
