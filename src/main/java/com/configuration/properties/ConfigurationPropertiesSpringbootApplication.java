package com.configuration.properties;

import com.configuration.properties.config.MyConfig;
import com.sun.glass.ui.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties
public class ConfigurationPropertiesSpringbootApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext= SpringApplication.run(ConfigurationPropertiesSpringbootApplication.class, args);
		MyConfig myConfig= (MyConfig) applicationContext.getBean("myConfig");
		System.out.println(myConfig.toString());
	}
}
