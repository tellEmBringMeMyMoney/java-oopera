package data.show;

import data.human.Actor;
import data.human.Director;

import java.util.ArrayList;

public class MusicalShow extends  Show{

    protected String librettoText;

    public MusicalShow(String title, String genre, ArrayList<Actor> listOfActors, Director director,
                       String librettoText) {
        super(title, genre, listOfActors, director);
        this.librettoText = librettoText;
    }
    //afterfix 1
    public void printLibretto(){
        System.out.println(librettoText);
    }

}
