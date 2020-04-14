package com.tuan.sl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class ZookeeperApp
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext ca = SpringApplication.run(ZookeeperApp.class,args);

    }
}
