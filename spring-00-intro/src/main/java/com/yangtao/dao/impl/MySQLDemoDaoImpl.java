package com.yangtao.dao.impl;

import com.yangtao.dao.DemoDao;

/**
 * @Author: kante_yang
 * @Date: 2024/1/24
 */
public class MySQLDemoDaoImpl implements DemoDao {

    @Override
    public String selectById(Long id) {

        return "mysql " + id;
    }
}
