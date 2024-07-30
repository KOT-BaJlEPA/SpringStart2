package spring._5IoCAndDIUseJavaClass._2SecondWay;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration// indicate tha it is configuration file
//@ComponentScan("spring._5IoCAndDIUseJavaClass._1FirstWay")//which package need of scanning
//// for search to annotations of @Component
@PropertySource("classpath:_5IoCAndDIUseJavaClass/applicationForJavaConfigurationFile.properties")//for
//setting properties file from can get any values next way - @Values("${name.field}")
public class Configuration2 {
    @Bean// bean id is name of method
    public Plant getChamomile(){
        return new Chamomile();
    }

    @Bean// bean id is name of method
    public Plant getWormwood(){
        return new Wormwood();
    }

    @Bean//bean id is name of method
    public Windowsill getWindowsill(){
        return new Windowsill(getWormwood(), getChamomile());
    }

}
