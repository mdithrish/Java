package loop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class For {

    public static void main(String[] args) {

        forLoop();
        sortArray();
    }

    static void forLoop(){
        String[] cars = {"Honda","Volvo","BMW", "Mazda"};

        for (String car : cars){
            System.out.println(car);
        }
    }

    static void sortArray(){
        List<String> cars = new ArrayList<String>();
        cars.add("Honda");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Mazda");

        Collections.sort(cars);
        for (String car : cars){
            System.out.println(car);
        }

    }


}
