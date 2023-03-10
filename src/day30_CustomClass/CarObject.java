package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject {
    public static void main(String[] args) {


        Car car1 = new Car();

        car1.setInfo("BMW", "X5", 2015, "Black", 25000);
        Car car2 = new Car();
        car2.setInfo("Toyota", "Camry", 2021, "Red", 28900);

        Car car3 = new Car();
        car3.setInfo("Audi", "Q7", 2019, "Yellow", 40000);


        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);


        //Car[] cars = {car1,car2,car3};
        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1, car2, car3));

        for (Car each : carsList) {
            System.out.println(each.brand + " : " + each.price);
        }

        carsList.removeIf(p -> p.brand.equalsIgnoreCase("Bmw") && p.year >= 2005 && p.year < 2008);
        carsList.removeIf(p-> p.brand.equalsIgnoreCase("TOyota")&& p.year>=1995&&p.year<=2010);


    }
}
