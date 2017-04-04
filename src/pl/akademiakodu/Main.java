package pl.akademiakodu;

import pl.akademiakodu.task1.Zarowka;
import pl.akademiakodu.task2.Piosenka;
import pl.akademiakodu.task3.Tire;

public class Main {

    public static void main(String[] args) {
//	 task1

//        Zarowka newZarowkaWithParam = new Zarowka(5, 15);
//        newZarowkaWithParam.getZywotnoscAndMod();
//
//        Zarowka newZarowka = new Zarowka();
//        newZarowka.getZywotnoscAndMod();

//   task2

//        Piosenka piosenka = new Piosenka();
//        piosenka.setNazwa("Highway to hell");
//        piosenka.setArtysta("AC/DC");
//        piosenka.getPiosenka();

//   task3

        Tire tire = new Tire(175, 70, 15);
        System.out.println(tire.tireShortcut());

    }
}
