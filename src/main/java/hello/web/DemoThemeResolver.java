package hello.web;

import leap.core.annotation.Bean;
import leap.lang.Strings;
import leap.web.DefaultRequest;
import leap.web.Request;
import leap.web.theme.ThemeResolver;

/**
 * Created by calvin on 2017/7/6.
 */
@Bean
public class DemoThemeResolver implements ThemeResolver {
    @Override
    public String resolveThemeName(Request request) throws Throwable {
        String theme = request.getParameter("theme");

        if(Strings.isEmpty(theme)) {
            theme = request.getCookie("theme").getValue();
        }

        if(null == request.getCookie("theme")) {
//            DefaultRequest.current().getServletContext();
            DefaultRequest.current().response();

        }
        return theme;
    }
}
