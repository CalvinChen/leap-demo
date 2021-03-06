package hello.controller;

import hello.model.User;
import leap.web.annotation.Path;
import leap.web.annotation.http.GET;
import leap.web.api.mvc.ApiResponse;
import leap.web.api.mvc.ModelController;

import java.util.List;

@Path("/user")
public class UserController extends ModelController<User> {

    @GET
    public ApiResponse<List<User>> all(){
        return ApiResponse.ok(User.all());
    }
}
