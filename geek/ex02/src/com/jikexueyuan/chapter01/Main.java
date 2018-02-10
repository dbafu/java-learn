package com.jikexueyuan.chapter01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Main {

    public static void main(String[] args) {
        Resource r = new FileSystemResource("HelloMessage.xml");
        BeanFactory f = new XmlBeanFactory(r);
        Person person = (Person) f.getBean("person");
        String s = person.sayHello();
        System.out.println("The Person is currently saying " + s);
    }

}
