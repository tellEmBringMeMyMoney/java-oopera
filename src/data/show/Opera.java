package data.show;

import data.human.Actor;
import data.human.Director;

import java.util.ArrayList;

public class Opera extends MusicalShow{

    private final String librettoText;

    public Opera(String title, String genre, ArrayList<Actor> listOfActors, Director director,
                  String librettoText) {
        super(title, genre, listOfActors, director, librettoText);
        this.librettoText = librettoText;
    }

    @Override
    public String toString() {
        return genre + " - \"" + title + "\"" + '\n' +
                "Постановка - " + director + '\n' +
                "В ролях: " + listOfActors + '\n' +
                "Текст: " + librettoText + '\n';
    }


}
