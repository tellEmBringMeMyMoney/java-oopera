package data.show;

import data.human.Actor;
import data.human.Director;

import java.util.ArrayList;

public class Piece extends Show{



    public Piece(String title, String genre, ArrayList<Actor> listOfActors, Director director,
                 String librettoText) {
        super(title, genre, listOfActors, director);
    }

    @Override
    public String toString() {
        return genre + " - \"" + title + "\"" + '\n' +
                "Постановка - " + director + '\n' +
                "В ролях: " + listOfActors;
    }

}
