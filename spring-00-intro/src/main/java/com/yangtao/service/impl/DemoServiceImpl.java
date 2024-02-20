package com.yangtao.service.impl;

import com.yangtao.dao.DemoDao;
import com.yangtao.factory.BeanFactory;
import com.yangtao.service.DemoService;

/**
 * @Author: kante_yang
 * @Date: 2024/1/24
 */
public class DemoServiceImpl implements DemoService {

    private DemoDao demoDao = (DemoDao) BeanFactory.getBean("oracle");

    @Override
    public String getById(Long id) {
        System.out.println("demoDao = " + demoDao);
        return demoDao.selectById(id);
    }
}
