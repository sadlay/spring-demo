package com.github.sadlay.spring.core.config;

import com.github.sadlay.spring.core.cycle.MyBeanFactoryPostProcessor;
import com.github.sadlay.spring.core.cycle.MyBeanPostProcessor;
import com.github.sadlay.spring.core.cycle.MyInstantiationAwareBeanPostProcessor;
import com.github.sadlay.spring.core.model.Knight;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Bean配置
 *
 * @Author: lay
 * @Date: Created in 9:42 2019/8/13
 * @Modified By:IntelliJ IDEA
 */
@Configuration
public class BeanConfig {

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public Knight knight() {
        return new Knight("lay", "男");
    }

    @Bean
    public BeanPostProcessor myBeanPostProcessor() {
        return new MyBeanPostProcessor();
    }

    @Bean
    public InstantiationAwareBeanPostProcessorAdapter myInstantiationAwareBeanPostProcessor() {
        return new MyInstantiationAwareBeanPostProcessor();
    }

    @Bean
    public BeanFactoryPostProcessor myBeanFactoryPostProcessor() {
        return new MyBeanFactoryPostProcessor();
    }

}
