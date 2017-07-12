package hello;

import leap.core.AppContext;
import leap.core.annotation.Bean;
import leap.core.annotation.Inject;
import leap.core.annotation.M;

/**
 * Created by calvin on 2017/7/11.
 */
@Bean
public class PetService {

    @Inject @M
    private UserService userService;

    public void test() {
        UserService userService = AppContext.current().getBeanFactory().getBean(UserService.class);
    }
}
