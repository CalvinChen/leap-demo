package hello.controller;

import leap.web.Response;
import leap.web.Results;
import leap.web.action.ControllerBase;
import leap.web.annotation.Path;

import javax.servlet.http.Cookie;

/**
 * Created by calvin on 2017/7/6.
 */
@Path("/home")
public class HomeController extends ControllerBase {

    public void index(Response response) {
        Cookie cookie = new Cookie("theme","ck");
        cookie.setPath("/");
        cookie.setMaxAge(99999999);

        response.addCookie(cookie);
        response.getServletResponse().addCookie(cookie);

        Results.renderView("/home.html");
    }
}
