package hello.controller.demo;

import hello.model.User;
import leap.core.i18n.MessageSource;
import leap.core.validation.Validator;

import java.util.Locale;

/**
 * Created by calvin on 2017/8/1.
 */
public class MyValidor implements Validator {
    @Override
    public boolean validate(Object value) {
        if(null != value && value instanceof User) {
            User user = (User) value;
            if(user.getId().contains("ck")) return true;
        }
        return false;
    }

    @Override
    public String getErrorCode() {
        return null;
    }

    @Override
    public String getErrorMessage(MessageSource ms, Locale locale) {
        return null;
    }

    @Override
    public String getErrorMessage(String title, MessageSource ms, Locale locale) {
        return null;
    }
}
