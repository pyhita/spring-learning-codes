package com.yangtao.event.a_quickstart.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @Author: kante_yang
 * @Date: 2024/1/26
 */
// 监听 容器刷新事件
@Component
public class ContextRefreshListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("监听到IoC 容器被刷新！");
    }
}
