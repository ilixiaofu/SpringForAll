/**
 * Copyright (C), 2015-2018, XXX有限公司
 */
package com.lxf.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * <pre>
 * @author:      李晓福
 * @date:        2018/12/17 18:54
 * @description: 
 * @since:       1.0.0
 * @history:
 * 作者姓名       修改时间             版本号           描述
 * lxf           2018/12/17 18:54     1.0.0           创建
 * </pre>
 */

public class ContextListener implements ServletContextListener {
    private Logger logger = LoggerFactory.getLogger(ContextListener.class);

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        logger.info("context-param-value = {}", servletContextEvent.getServletContext().getInitParameter("param-name"));
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        logger.info("context-param-value = {}", servletContextEvent.getServletContext().getInitParameter("param-name"));
    }
}
