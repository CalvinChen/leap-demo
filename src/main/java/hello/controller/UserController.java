package hello.controller;

import hello.model.User;
import leap.web.Result;
import leap.web.action.ControllerBase;
import leap.web.view.ViewData;

/**
 * Created by calvin on 2017/8/2.
 */
public class UserController extends ControllerBase {

    public User get(String id) {
        return User.findOrNull(id);
    }

    public void myView(ViewData vd) {
        vd.put("id", 123);
        vd.put("name", "zhangsan");
    }

    public void renderView(Result result) {
        result.getViewData().put("id", 5201314);
        result.renderView("/hello");
    }

    public void renderOtherView() {
        super.result().renderView("/other/view");
    }

    public void renderAnotherView(Result result) {
        result.renderView("/another/view");
    }
}
