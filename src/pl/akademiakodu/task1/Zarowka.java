package pl.akademiakodu.task1;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by Lukasz Kolacz on 04.04.2017.
 */

public class Zarowka {

    private int zywotnosc = 0;
    private int moc = 0;


    public Zarowka(){
    }


    public Zarowka(int zywnosc, int moc) {
        this.zywotnosc = zywnosc;
        this.moc = moc;
    }


    public void getZywotnoscAndMod(){

        Scanner scanner = new Scanner(System.in);

        if (zywotnosc == 0 || moc == 0){
            System.out.println("<!>  Żarówka ma zerową żywotność oraz moc  <!>");

            System.out.println("Podaj parametry żarówki");

            zywotnosc = scanner.nextInt();
            moc = scanner.nextInt();

        }else {
            System.out.println("Żarówka ma " + zywotnosc + " lat żywotności oraz " + moc + " mocy");
        }
    }
}
