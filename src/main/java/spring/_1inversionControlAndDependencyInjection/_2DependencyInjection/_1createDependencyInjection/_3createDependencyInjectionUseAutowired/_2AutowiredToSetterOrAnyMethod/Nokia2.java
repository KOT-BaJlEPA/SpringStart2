package spring._1inversionControlAndDependencyInjection._2DependencyInjection._1createDependencyInjection._3createDependencyInjectionUseAutowired._2AutowiredToSetterOrAnyMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring._1inversionControlAndDependencyInjection._2DependencyInjection._1createDependencyInjection._3createDependencyInjectionUseAutowired.Brand;
import spring._1inversionControlAndDependencyInjection._2DependencyInjection._1createDependencyInjection._3createDependencyInjectionUseAutowired.Smartphone;

@Component("nokia2Bean")
public class Nokia2 implements Smartphone {
    private Brand brand;

    public Nokia2(Brand brand) {
        System.out.println("                Nokia2 constructor +");
        this.brand = brand;
    }

    public Nokia2() {
        System.out.println("                Nokia2 constructor -");
    }

    public void getBrand() {
        System.out.println("        Nokia2 getBrand()");
        System.out.println(this.brand.getBrand());
    }
    @Autowired  // it means that setBrand creates object of Brand automatic
    public void setBrand(Brand brand) {
        System.out.println("        Nokia2 setBrand()");
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Nokia{" +
                "brand=" + brand +
                '}';
    }
}
