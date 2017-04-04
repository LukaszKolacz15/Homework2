package pl.akademiakodu.task3;

/**
 * Created by Lukasz Kolacz on 04.04.2017.
 */

public class Tire {

    int width;
    int profile;
    int diameter;

    public Tire(int width, int profile, int diameter) {
        this.width = width;
        this.profile = profile;
        this.diameter = diameter;
    }

    public String tireShortcut(){

        return width + "/" + profile + "R" + diameter;
    }

}
