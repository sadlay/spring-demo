package com.github.sadlay.spring.core;

import com.github.sadlay.spring.core.model.Knight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 主启动类
 *
 * @Author: lay
 * @Date: Created in 9:38 2019/8/13
 * @Modified By:IntelliJ IDEA
 */
@Configuration
@ComponentScan("com.github.sadlay")
public class SpringCoreApplication {

    public static void main(String[] args) {
        System.out.println("现在开始初始化容器");
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringCoreApplication.class);
        System.out.println("容器初始化成功");
        Knight bean = context.getBean(Knight.class);
        System.out.println(bean.toString());
        System.out.println("现在开始关闭容器！");
        ((AnnotationConfigApplicationContext) context).close();
    }
}
