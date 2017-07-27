package hello.controller;

import hello.model.User;
import hello.web.Util;
import leap.web.Response;
import leap.web.Results;
import leap.web.action.ControllerBase;
import leap.web.annotation.Path;
import leap.web.annotation.http.GET;
import leap.web.view.ViewData;

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

    @GET
    public void expr(ViewData data) {
//        data.put("name", "hello");
        User user = new User();
        user.setId("251721");
        user.setName("hello name");
        data.put("user", user);
    }

    @GET
    public void format(ViewData data) {
        data.put("util", Util.class);
        data.put("num", 5.4);
    }

    public void renderView(){
        Results.renderView("/test_render_view").setReturnValue("Hello world!");
    }

    public void frag(ViewData data) {
        data.put("page.layout", "layout");
    }
}
