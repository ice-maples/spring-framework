package com.maple.util;

import com.maple.config.AppConfig;
import com.maple.service.BeanService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * Created by cswang on 2020/9/23
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		AbstractBeanDefinition beanService = (AbstractBeanDefinition) beanFactory.getBeanDefinition("a");
		beanService.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_CONSTRUCTOR);
		//byName 和byType 是找set方法
//		beanService.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);
//		beanService.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_NAME);
		System.out.println(beanService.getAutowireMode());
	}
}
