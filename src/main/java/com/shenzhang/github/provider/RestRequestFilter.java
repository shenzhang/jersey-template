package com.shenzhang.github.provider;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

/**
 * User: Zhang Shen
 * Date: 4/19/15
 * Time: 3:11 PM
 */
@Provider
@PreMatching
public class RestRequestFilter implements ContainerRequestFilter {
    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
    }
}
