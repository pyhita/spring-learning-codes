package com.pyhita.tx.a_programmatic.service;

import com.pyhita.tx.a_programmatic.dao.UserDao;
import com.pyhita.tx.a_programmatic.entity.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

@Service
public class UserService {
    
    @Autowired
    private UserDao userDao;
    @Autowired
    private TransactionTemplate transactionTemplate;



    
    public void saveAndQuery() {
        User user = new User();
        user.setName("jon");
        user.setTel("123654789");

        // 由事务 模板来管理事务
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                userDao.save(user);

                int i = 1 / 0;

                List<User> userList = userDao.findAll();
                System.out.println(userList);
            }
        });
    }
}