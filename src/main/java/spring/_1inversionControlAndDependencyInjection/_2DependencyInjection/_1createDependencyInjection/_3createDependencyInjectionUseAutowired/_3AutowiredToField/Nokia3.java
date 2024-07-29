package spring._1inversionControlAndDependencyInjection._2DependencyInjection._1createDependencyInjection._3createDependencyInjectionUseAutowired._3AutowiredToField;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring._1inversionControlAndDependencyInjection._2DependencyInjection._1createDependencyInjection._3createDependencyInjectionUseAutowired.Brand;
import spring._1inversionControlAndDependencyInjection._2DependencyInjection._1createDependencyInjection._3createDependencyInjectionUseAutowired.Smartphone;

@Component("nokia3Bean")
public class Nokia3 implements Smartphone {
    @Autowired // it means that field creates object of Brand automatic
    private Brand brand;

    public Nokia3(Brand brand) {
        System.out.println("                Nokia3 constructor +");
        this.brand = brand;
    }

    public Nokia3() {
        System.out.println("                Nokia3 constructor -");
    }

    public void getBrand() {
        System.out.println("        Nokia3 getBrand()");
        System.out.println(this.brand.getBrand());
    }

    public void setBrand(Brand brand) {
        System.out.println("        Nokia3 setBrand()");
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Nokia{" +
                "brand=" + brand +
                '}';
    }
}
