package data.show;

import data.human.Actor;
import data.human.Director;

import java.util.ArrayList;

public class Opera extends MusicalShow{

    private String librettoText;

    public Opera(String title, String genre, ArrayList<Actor> listOfActors, Director director,
                 Director composer, String librettoText) {
        super(title, genre, listOfActors, director, composer, librettoText);
        this.librettoText = librettoText;
    }

    @Override
    public String toString() {
        return genre + " - \"" + title + "\"" + '\n' +
                "Постановка - " + director + '\n' +
                "Музыка - " + composer + '\n' +
                "В ролях: " + listOfActors + '\n' +
                "Текст: " + librettoText + '\n';
    }


}
