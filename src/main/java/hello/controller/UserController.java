package hello.controller;

import hello.model.User;
import leap.core.validation.annotations.NotEmpty;
import leap.web.annotation.Path;
import leap.web.annotation.http.GET;
import leap.web.annotation.http.POST;
import leap.web.api.mvc.ApiResponse;
import leap.web.api.mvc.ModelController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Path("/user")
public class UserController extends ModelController<User> {

    @GET
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

    @GET("/params")
    public ApiResponse params() {
        Map<String, Object> params = new HashMap<>();
        params.put("id", 1);
        params.put("name", "ck");
        dao.executeNamedUpdate("testParams", params);
        return ApiResponse.OK;
    }

    @POST("/block")
    public ApiResponse postjson(@NotEmpty String block) {
        return ApiResponse.ok(block);
    }
}
