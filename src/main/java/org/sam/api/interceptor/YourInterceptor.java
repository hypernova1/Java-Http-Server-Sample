package org.sam.api.interceptor;

import org.sam.server.http.Interceptor;
import org.sam.server.http.web.Request;
import org.sam.server.http.web.Response;

public class YourInterceptor implements Interceptor {
    @Override
    public void preHandler(Request request, Response response) {
        System.out.println(2);
    }

    @Override
    public void postHandler(Request request, Response response) {
        System.out.println(2);
    }
}
