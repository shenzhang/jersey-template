package com.shenzhang.github.util;

import org.slf4j.bridge.SLF4JBridgeHandler;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * User: Zhang Shen
 * Date: 4/19/15
 * Time: 3:05 PM
 */
public class Jul2Slf4jBridgeListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        SLF4JBridgeHandler.install();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        SLF4JBridgeHandler.uninstall();
    }
}
