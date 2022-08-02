//SetterInjectionTest.java
package com.nt.test;

import java.nio.file.FileSystem;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		FileSystemResource res=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		//create  IOC container (BeanFactory container)
				XmlBeanFactory factory=new XmlBeanFactory(res);
		System.out.println("___________________");
		Object object=factory.getBean("wmg");
		WishMessageGenerator generator=(WishMessageGenerator)object;
		System.out.println("____________________");
		
		
		   String msg=generator.generateMessage("raja");
		  System.out.println("Wish Message is ::"+msg);
		   System.out.println("_______________________________"); 
	}//main
}//class
