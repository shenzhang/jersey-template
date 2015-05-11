package com.shenzhang.github.provider;

import javax.ws.rs.container.DynamicFeature;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.FeatureContext;

/**
 * We can utilize Dynamic Binding feature to bind filters/interceptors in runtime based on ResourceInfo (which resource/method is selected)
 * User: Zhang Shen
 * Date: 4/19/15
 * Time: 3:42 PM
 */
public class DynamicBindingProvider implements DynamicFeature {
    @Override
    public void configure(ResourceInfo resourceInfo, FeatureContext context) {

    }
}
