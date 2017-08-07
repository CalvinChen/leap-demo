package hello;

import leap.core.annotation.Bean;
import leap.core.validation.Validation;
import leap.lang.intercepting.State;
import leap.web.action.ActionContext;
import leap.web.action.ActionExecution;
import leap.web.action.ActionInterceptor;

/**
 * Created by calvin on 2017/8/3.
 */
@Bean
public class MyActionInterceptor implements ActionInterceptor {
    @Override
    public State preExecuteAction(ActionContext context, Validation validation) throws Throwable {
        System.out.println("MyActionInterceptor.preExecuteAction");
        return State.CONTINUE;
    }

    @Override
    public State postExecuteAction(ActionContext context, Validation validation, ActionExecution execution) throws Throwable {
        System.out.println("MyActionInterceptor.postExecuteAction");
        return State.INTERCEPTED;
    }

    @Override
    public State onActionFailure(ActionContext context, Validation validation, ActionExecution execution) throws Throwable {
        System.out.println("MyActionInterceptor.onActionFailure");
        return State.CONTINUE;
    }

    @Override
    public void completeExecuteAction(ActionContext context, Validation validation, ActionExecution execution) throws Throwable {
        System.out.println("MyActionInterceptor.completeExecuteAction");
    }
}
