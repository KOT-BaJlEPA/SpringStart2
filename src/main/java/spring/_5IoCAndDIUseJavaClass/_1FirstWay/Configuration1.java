package spring._5IoCAndDIUseJavaClass._1FirstWay;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration// indicate tha it is configuration file
@ComponentScan("spring._5IoCAndDIUseJavaClass._1FirstWay")//which package need of scanning
// for search to annotations of @Component
@PropertySource("classpath:_5IoCAndDIUseJavaClass/applicationForJavaConfigurationFile.properties")//for
//setting properties file from can get any values next way - @Values("${name.field}")
public class Configuration1 {
}
