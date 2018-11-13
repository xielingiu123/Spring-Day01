package it.cn.c_injection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	@Test
	public void fun(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("/it/cn/c_injection/applicationContext.xml");
		Object user=ac.getBean("user");
		System.out.println(user);
	}
	
	@Test
	public void fun2(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("/it/cn/c_injection/applicationContext.xml");
		Object user=ac.getBean("user2");
		System.out.println(user);
	}
	
	@Test
	public void fun3(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("/it/cn/c_injection/applicationContext.xml");
		Object user=ac.getBean("user3");
		System.out.println(user);
	}
	
	@Test
	public void fun4(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("/it/cn/c_injection/applicationContext.xml");
		Object user=ac.getBean("user4");
		System.out.println(user);
	}
	
	@Test
	public void fun5(){
		
		//1 ������������
		ApplicationContext ac = new ClassPathXmlApplicationContext("/it/cn/c_injection/applicationContext.xml");
		//2 ������"Ҫ"user����
		CollectionBean cb = (CollectionBean) ac.getBean("cb");
		//3 ��ӡuser����
		System.out.println(cb);
		
	}
}
