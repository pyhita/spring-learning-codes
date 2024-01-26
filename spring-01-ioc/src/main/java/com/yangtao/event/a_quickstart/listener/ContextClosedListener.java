package com.yangtao.event.a_quickstart.listener;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Author: kante_yang
 * @Date: 2024/1/26
 */
@Component
public class ContextClosedListener {
    @EventListener
    public void onApplicationClosed(ContextClosedEvent contextClosedEvent) {
        System.out.println("监听到容器关闭！");
    }
}
