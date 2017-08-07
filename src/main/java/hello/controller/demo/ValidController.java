package hello.controller.demo;

import leap.core.validation.annotations.*;

/**
 * Created by calvin on 2017/8/1.
 */
public class ValidController {

    public String test(@Required @Min(123) Integer name) {
        return "ok";
    }

    public String create(@Required Integer id, @Required @Email String mail) {
        return mail;
    }

    public String m(@Required String a, @NotNull String b, @NotEmpty String c) {
        return "ok";
    }

}
