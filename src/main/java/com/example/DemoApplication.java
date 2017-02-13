package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DemoApplication
{

	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("file:src/main/Beans.xml");

		new StaticWrapper();
	}
}
