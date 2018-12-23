package com.psca.spring.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.psca.spring.annotation.bean.Person;

@Configuration
@ComponentScan(value="com.psca.spring.annotation",includeFilters = {
		@Filter(type=FilterType.ANNOTATION,classes= {Bean.class})
		},useDefaultFilters=false)
public class MyConfig {
	@Bean
	public Person getPerson() {
		Person person = new Person();
		person.setName("张三");
		person.setAge(20);
		return person;
	}
	@Bean(value="person")
	public Person getPerson1() {
		Person person = new Person();
		person.setAge(21);
		person.setName("李四");
		return person;
	}

}
