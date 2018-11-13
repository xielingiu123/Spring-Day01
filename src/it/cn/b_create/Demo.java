package it.cn.b_create;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	@Test
	public void fun(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("/it/cn/b_create/applicationContext.xml");
		Object user=ac.getBean("user2");
		System.out.println(user);
	}
	
	@Test
	public void fun2(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("/it/cn/b_create/applicationContext.xml");
		Object user=ac.getBean("user3");
		System.out.println(user);
	}
	
	//scope ：singleton单例
	//      ：prototype多例
	@Test
	public void fun3(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("/it/cn/b_create/applicationContext.xml");
		Object user=ac.getBean("user");
		Object user2=ac.getBean("user");
		Object user3=ac.getBean("user");
		Object user4=ac.getBean("user");
		System.out.println(user==user4);//单例 true 多例 false
	}
	
	//测试Spring的生命周期方法
	@Test
	public void fun4(){
		 ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("/it/cn/b_create/applicationContext.xml");
		Object user=ac.getBean("user");
		ac.close();
	}
}
