package data.show;

import data.human.Actor;
import data.human.Director;

import java.util.ArrayList;

public class Ballet extends MusicalShow{

    private Director choreographer;

    public Ballet(String title, String genre, ArrayList<Actor> listOfActors, Director director,
                  Director musicAuthor, Director choreographer, String librettoText) {
        super(title, genre, listOfActors, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    @Override
    public String toString() {
        return genre + " - \"" + title + "\"" + '\n' +
                "Постановка - " + director + '\n' +
                "Музыка - " + composer + '\n' +
                "Хореограф - " + choreographer + '\n' +
                "В ролях: " + listOfActors + '\n';
    }
}
