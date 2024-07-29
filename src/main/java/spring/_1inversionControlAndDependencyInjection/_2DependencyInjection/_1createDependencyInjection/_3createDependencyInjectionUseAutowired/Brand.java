package spring._1inversionControlAndDependencyInjection._2DependencyInjection._1createDependencyInjection._3createDependencyInjectionUseAutowired;

import org.springframework.stereotype.Component;

@Component("brandBean")//brandBean is id of Beans
public class Brand {
    private String brand = "Nokia";
    public Brand() {
    }
    public String getBrand() {
        return brand;
    }
}
