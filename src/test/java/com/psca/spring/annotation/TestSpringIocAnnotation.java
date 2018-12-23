package com.psca.spring.annotation;

import static org.junit.Assert.fail;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.psca.spring.annotation.bean.Person;
import com.psca.spring.annotation.config.MyConfig;

public class TestSpringIocAnnotation {
	

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@SuppressWarnings("resource")
	@Test
	public void testBeanDefinitionNamesMethod() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
		Person person = ctx.getBean(Person.class);
		System.out.println(person);
	}
	@Test
	public void testBeanInitizationMethod() {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
		String [] names =ctx.getBeanDefinitionNames();
		for(String name : names) {
			System.out.println(name);
		}
	}
}
