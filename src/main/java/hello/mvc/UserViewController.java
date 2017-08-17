package hello.mvc;

import leap.web.action.ControllerBase;
import leap.web.annotation.http.GET;
import leap.web.view.ViewData;

/**
 * Created by calvin on 2017/8/17.
 */
public class UserViewController extends ControllerBase {

    @GET
    public void home(ViewData vd) {
        vd.put("name", "zhangsan");
    }
}
