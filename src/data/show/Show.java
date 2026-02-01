package data.show;

import data.human.Actor;
import data.human.Director;
import java.util.ArrayList;

public class Show {
    protected final String title;
    protected final String genre;
    protected ArrayList<Actor> listOfActors;
    protected final Director director;
    protected final String librettoText;

    public Show(String title, String genre, ArrayList<Actor> listOfActors, Director director, String librettoText) {
        this.title = title;
        this.genre = genre;
        this.listOfActors = listOfActors;
        this.director = director;
        this.librettoText = librettoText;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }

    public String shortPrint() {
        return genre + "\n" + listOfActors;
    }
    public void printLibretto(){
        System.out.println(genre + " " + title + ":\n" + librettoText + "\n");
    }
}
