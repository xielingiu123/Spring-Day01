package it.cn.a_hello;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	@Test
	public void fun(){
		//1.������������
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.��������Ҫ��User����
		Object user=ac.getBean("user");
		//3.��ӡ����
		System.out.println(user);
	}
}
