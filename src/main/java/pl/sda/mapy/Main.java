package pl.sda.mapy;

import java.util.Map;

public class Main {

    public static void main(String[] args) {


        Generyka<String> generyka= new Generyka<String>("test");

        System.out.println(generyka.getField());

        Generyka<Integer> generyka1 = new Generyka<Integer>(765765);
        System.out.println(generyka1.getField());
    }
}
