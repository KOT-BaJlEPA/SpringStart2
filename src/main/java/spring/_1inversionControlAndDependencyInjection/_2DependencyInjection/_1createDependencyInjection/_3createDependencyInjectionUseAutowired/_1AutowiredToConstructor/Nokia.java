package spring._1inversionControlAndDependencyInjection._2DependencyInjection._1createDependencyInjection._3createDependencyInjectionUseAutowired._1AutowiredToConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring._1inversionControlAndDependencyInjection._2DependencyInjection._1createDependencyInjection._3createDependencyInjectionUseAutowired.Brand;
import spring._1inversionControlAndDependencyInjection._2DependencyInjection._1createDependencyInjection._3createDependencyInjectionUseAutowired.Smartphone;

@Component("nokiaBean") //nokiaBean is id of Beans
public class Nokia implements Smartphone {
    private Brand brand;

    @Autowired// it means that constructor creates object of Brand automatic
    public Nokia(Brand brand) {
        System.out.println("                Nokia1 constructor +");
        this.brand = brand;
    }

    public Nokia() {
        System.out.println("                Nokia1 constructor -");
    }

    public void getBrand() {
        System.out.println("        Nokia1 getBrand()");
        System.out.println(this.brand.getBrand());
    }

    public void setBrand(Brand brand) {
        System.out.println("        Nokia1 setBrand()");
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Nokia{" +
                "brand=" + brand +
                '}';
    }
}
