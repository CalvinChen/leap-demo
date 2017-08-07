package hello;

import leap.core.annotation.Bean;
import leap.lang.intercepting.State;
import leap.web.Request;
import leap.web.RequestExecution;
import leap.web.RequestInterceptor;
import leap.web.Response;
import leap.web.action.ActionContext;
import leap.web.route.Route;

/**
 * Created by calvin on 2017/8/3.
 */
@Bean
public class MyRequestInterceptor implements RequestInterceptor {

    @Override
    public State preHandleRequest(Request request, Response response) throws Throwable {
        System.out.println("MyRequestInterceptor.preHandleRequest");
        return State.CONTINUE;
    }

    @Override
    public State handleRoute(Request request, Response response, Route route, ActionContext ac) throws Throwable {
        System.out.println("MyRequestInterceptor.handleRoute");
        return State.CONTINUE;
    }

    @Override
    public State handleNoRoute(Request request, Response response) throws Throwable {
        System.out.println("MyRequestInterceptor.handleNoRoute");
        return State.CONTINUE;
    }

    @Override
    public State postHandleRequest(Request request, Response response, RequestExecution execution) throws Throwable {
        System.out.println("MyRequestInterceptor.postHandleRequest");
        return State.CONTINUE;
    }

    @Override
    public State onRequestFailure(Request request, Response response, RequestExecution execution) throws Throwable {
        System.out.println("MyRequestInterceptor.onRequestFailure");
        return State.CONTINUE;
    }

    @Override
    public void completeHandleRequest(Request request, Response response, RequestExecution execution) throws Throwable {
        System.out.println("MyRequestInterceptor.completeHandleRequest");
    }
}
