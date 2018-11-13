package it.cn.a_hello;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	@Test
	public void fun(){
		//1.创建容器对象。
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.向容器“要”User对象。
		Object user=ac.getBean("user");
		//3.打印对象
		System.out.println(user);
	}
}
