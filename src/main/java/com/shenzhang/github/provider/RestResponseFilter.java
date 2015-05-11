package com.shenzhang.github.provider;

import com.shenzhang.github.annotation.PoweredBy;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

/**
 * User: Zhang Shen
 * Date: 4/19/15
 * Time: 3:11 PM
 */
@Provider
@PoweredBy /* Name Binding */
public class RestResponseFilter implements ContainerResponseFilter {
    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
        responseContext.getHeaders().add("X-Powered-By", "Fish");
    }
}
