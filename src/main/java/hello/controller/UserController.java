package hello.controller;

import hello.model.User;
import leap.web.annotation.Cors;
import leap.web.annotation.Path;
import leap.web.annotation.http.GET;
import leap.web.api.mvc.ApiResponse;
import leap.web.api.mvc.ModelController;

import java.util.List;

@Path("/user")
public class UserController extends ModelController<User> {

    @GET
    @Cors(false)
    public ApiResponse<List<User>> all(){
        return ApiResponse.ok(User.all());
    }

    @GET("/one")
    public ApiResponse<List<User>> one(){
        return ApiResponse.ok(User.query("user.one").list());
    }

    @GET("/when")
    public ApiResponse when() {
        dao.createNamedQuery("when").list();
        return ApiResponse.OK;
    }

    @GET("/concat")
    public ApiResponse concat() {
        dao.createNamedQuery("testConcat1").param("userId", "ck").list();
        return ApiResponse.OK;
    }
}
