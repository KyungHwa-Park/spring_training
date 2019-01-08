package org.zeorck.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// root-context.xml을 대신하는 설정 class (Java configuration)

@Configuration
@ComponentScan(basePackages = {"org.zeorck.sample"})
public class RootConfig {

}
