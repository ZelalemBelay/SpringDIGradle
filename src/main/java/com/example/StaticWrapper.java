package com.example;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Zelalem Belay on 2/9/2017.
 */
public class StaticWrapper {

    @Autowired
    HelloWorldService helloWorldService;

    public StaticWrapper() {
		helloWorldService.makeHello();
    }
}

