/**
 * Copyright (C), 2015-2018, XXX有限公司
 */
package com.lxf.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import per.lxf.webmvc.stereotype.Component;

/**
 * <pre>
 * @author:      李晓福
 * @date:        2018/12/18 14:36
 * @description: 
 * @since:       1.0.0
 * @history:
 * 作者姓名       修改时间             版本号           描述
 * lxf           2018/12/18 14:36     1.0.0           创建
 * </pre>
 */

@Component
public class UserServiceImpl implements UserService{

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public boolean login(String name) {
        logger.info("name={}", name);
        return name.isEmpty();
    }
}
