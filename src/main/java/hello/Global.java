package hello;

import leap.core.annotation.Inject;
import leap.web.App;
import leap.web.security.SecurityConfigurator;

/**
 * Created by calvin on 2017/8/17.
 */
public class Global extends App {

    @Inject
    public SecurityConfigurator sc;

    @Override
    protected void init() throws Throwable {
        sc.enable();
        sc.setAuthenticateAnyRequests(true);
        sc.setCsrfEnabled(true);
        sc.setAuthenticationTokenEnabled(false);
    }
}
