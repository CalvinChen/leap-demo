package hello.controller;

import hello.model.Company;
import hello.model.User;
import hello.web.Util;
import leap.lang.Strings;
import leap.lang.http.HTTP;
import leap.lang.json.JSON;
import leap.web.*;
import leap.web.action.ActionContext;
import leap.web.action.ControllerBase;
import leap.web.annotation.HeaderParam;
import leap.web.annotation.Path;
import leap.web.annotation.RequestMapping;
import leap.web.annotation.RequestParam;
import leap.web.annotation.http.GET;
import leap.web.view.ViewData;

import javax.servlet.http.Cookie;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by calvin on 2017/7/6.
 */
@Path("/home")
public class HomeController extends ControllerBase {

    @GET("getContextUrl")
    public String getContextUrl(Request request) {
        return request.getContextUrl();
    }

    public void test(Request request, Response response) {
        String contextUrl = request.getContextUrl();
        PrintWriter pw = response.getWriter();
        pw.print(contextUrl);
        pw.flush();
        pw.close();
    }

    public String params(Params params) {
        String name = params.get("name");
        return name;
    }

    public void result(Result result) {
        result.setStatus(404);
    }

    public void viewData(ViewData vd, Result result) {
        vd.put("name", "zhangsan");
        result.renderView("view");
    }

    public void actionContext(ActionContext ac) {
        Request request = ac.getRequest();
        Response response = ac.getResponse();
        Params params = ac.getRequest().params();
        Result result = ac.getResult();
        ViewData viewData = ac.getResult().getViewData();
    }

    public void index(Response response) {
        Cookie cookie = new Cookie("theme","ck");
        cookie.setPath("/");
        cookie.setMaxAge(99999999);

        response.addCookie(cookie);
        response.getServletResponse().addCookie(cookie);

        result().getViewData().put("id", "93231ne1eo1");

        Results.renderView("/home");
    }

    @GET
    public void expr(ViewData data) {
//        data.put("name", "hello");
        User user = new User();
        user.setId("251721");
        user.setName("hello name");
        data.put("user", user);
    }

    @GET("for")
    @RequestMapping(method = HTTP.Method.GET, path = "")
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

//    @GET
    public String basic(Integer id, String name) {
        return id + name;
    }

//    @POST
    public String complex(User user) {
        return JSON.encode(user);
    }

    public String paramname(@RequestParam("my_name") String myName) {
        return myName + ", hahahha";
    }

    public String header(@HeaderParam("Accept") String a) {
        return a;
    }

    public String complexTwo(User user, Company company) {
        return JSON.encode(user) + JSON.encode(company);
    }

    public String list(List<String> names) {
        return Strings.join(names, " -> ");
    }

    public String array(String[] names) {
            return Strings.join(names, " -> ");
    }

    public ResponseEntity resp() {
        return ResponseEntity.of(HTTP.Status.BAD_REQUEST, "bad boy");
    }

    public void sout() {
        System.out.println("sout!");
    }
}
