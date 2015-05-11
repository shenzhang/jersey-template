package com.shenzhang.github;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * User: Zhang Shen
 * Date: 4/18/15
 * Time: 11:13 PM
 */
public class MyApplication extends ResourceConfig {
    public MyApplication() {
        packages("com.shenzhang.github.resource");
        packages("com.shenzhang.github.provider");
    }
}
