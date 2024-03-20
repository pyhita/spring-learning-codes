package com.pyhita.tx.b_anno.service;

import com.pyhita.tx.b_anno.dao.UserDao;
import com.pyhita.tx.b_anno.entity.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    
    @Autowired
    private UserDao userDao;


    @Transactional // 注解控制事务
    public void saveAndQuery() {
        User user = new User();
        user.setName("jon");
        user.setTel("123654789");

        userDao.save(user);

        int i = 1 / 0;

        List<User> userList = userDao.findAll();
        System.out.println(userList);
    }
}