package hello;

import leap.core.annotation.Bean;
import leap.lang.Strings;
import leap.web.Request;
import leap.web.theme.ThemeResolver;

/**
 * Created by calvin on 2017/8/2.
 */
@Bean
public class MyThemeResolver implements ThemeResolver {
    @Override
    public String resolveThemeName(Request request) throws Throwable {
        String name = request.getParameter("theme");
        if(Strings.isNotBlank(name)) return name;
        return null;
    }
}
