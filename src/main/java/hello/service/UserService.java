package hello.service;

import hello.model.User;
import leap.core.annotation.Bean;
import leap.orm.annotation.SqlKey;
import leap.orm.dao.DaoCommand;

@Bean(lazyInit = false)
public class UserService {

    @SqlKey("bean")
    private DaoCommand command;

    public User getHelloUser() {
        return User.findOrNull("hello");
    }

    public long execBean() {
        return command.createQuery().count();
    }

}
