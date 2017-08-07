package hello.controller;

import leap.web.annotation.Path;
import leap.web.annotation.PathParam;
import leap.web.annotation.http.GET;

/**
 * Created by calvin on 2017/8/1.
 */
@Path("/path/{param1}")
public class PathParamController {

    @GET("method/{param2}")
    public String path(@PathParam("param1") String p1, @PathParam("param2") String p2) {
        return p1+p2;
    }
}
