package com.example;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Zelalem Belay on 2/8/2017.
 */
public class HelloWorldService implements IHelloWorldService
{

    @Autowired
    HelloWorld helloWorld;

    public HelloWorldService() {
    }

    @Override
    public void makeHello()
    {
//        HelloWorld obj = (HelloWorld) DemoApplication.context.getBean("helloWorld");
        helloWorld.getMessage();

//        obj.getMessage();

    }
}
