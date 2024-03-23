package com.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("com.app")
@PropertySource("DbDetails.properties")
public class Config {

}
