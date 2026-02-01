package data.show;

import data.human.Actor;
import data.human.Director;

import java.util.ArrayList;

public class MusicalShow extends  Show{

    protected Director composer;

    public MusicalShow(String title, String genre, ArrayList<Actor> listOfActors, Director director,
    Director composer, String librettoText) {
        super(title, genre, listOfActors, director, librettoText);
        this.composer = composer;
    }

}
