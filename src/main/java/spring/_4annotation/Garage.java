package spring._4annotation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("garageBean")// setting id of Bean
@Scope()// setting scope it is by default scope
public class Garage {

    private List<Automobile> automobileList = new ArrayList<Automobile>();

    @Autowired  //for indicate dependency injection for setting which objects should automatic  created
    //@Qualifier("fordBean") - if we have several element which can be created
    //in this case Automobile can be Ford and Chevrolet. We explicitly specify which object need create
    public Garage(@Qualifier("fordBean") Automobile automobile1, @Qualifier("chevroletBean") Automobile automobile2) {
        System.out.println("         Garage constructor +");
        this.automobileList.add(automobile1);
        this.automobileList.add(automobile2);
    }
    public void getAutomobile() {
        System.out.println("         getAutomobile ");
        this.automobileList.forEach(automobile -> automobile.ride());
    }

    @PostConstruct // for indicate init-method
    private void init(){
        System.out.println("          init method work before construct of object. Usually use for connect with database ");
    }

    @PreDestroy // for indicate destroy-method
    private void destroy(){
        System.out.println("          destroy method work after closing context. Usually use for closing connect with database ");
    }

    public void setAutomobile(Automobile ...automobile) {
        System.out.println("         setAutomobile ");
        for (int i = 0; i <automobile.length ; i++) {
            this.automobileList.add(automobile[i]);
        }
    }

}
