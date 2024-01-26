package com.yangtao.lifecycle.d_prototype;

import com.yangtao.lifecycle.d_prototype.bean.Pen;
import com.yangtao.lifecycle.d_prototype.config.PenConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/1/26
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("IOC容器开始初始化。。。");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
            PenConfig.class);
        System.out.println("IOC容器初始化完成。。。");
        System.out.println("准备获取一个Pen。。。");
        Pen pen = ctx.getBean(Pen.class);
        System.out.println("已经取到了Pen。。。");
        System.out.println("用完Pen了，准备销毁。。。");
        ctx.getBeanFactory().destroyBean(pen);
        System.out.println("Pen销毁完成。。。");
    }

}
