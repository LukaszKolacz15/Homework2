package pl.akademiakodu.task2;

/**
 * Created by Lukasz Kolacz on 04.04.2017.
 */
public class Piosenka {

    private String nazwa;
    private String artysta;

    public Piosenka(String nazwa, String artysta) {
        this.nazwa = nazwa;
        this.artysta = artysta;
    }

    public Piosenka() {

    }

    public String getNazwa() {
        return nazwa;
    }

    public String getArtysta() {
        return artysta;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setArtysta(String artysta) {
        this.artysta = artysta;
    }

    public void getPiosenka(){

        System.out.println("Pełna nazwa piosenki: " + getNazwa() + " twórca: " + getArtysta());

    }

}
