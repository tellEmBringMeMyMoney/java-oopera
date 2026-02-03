package data.show;

import data.human.Actor;
import data.human.Director;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Show {
    protected final String title;
    protected final String genre;
    protected ArrayList<Actor> listOfActors;
    protected final Director director;

    public Show(String title, String genre, ArrayList<Actor> listOfActors, Director director) {
        this.title = title;
        this.genre = genre;
        this.listOfActors = listOfActors;
        this.director = director;
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

    public void printDirector(){
        System.out.println(director);
    }

    public void addNewActor(Actor actor){
        if (!checkActor(this.listOfActors, actor)){
            listOfActors.add(actor);
            System.out.printf("Актер " + actor + "успешно добавлен");
        } else {
            System.out.println("Актер уже в списке");
        }
    }

    public boolean checkActor(ArrayList<Actor> list, Actor person){
        boolean result = false;
        for (Actor men : list){
            if (men.equals(person)){
                result = true;
            }
        }
        return result;
    }


    public void changeActors(Actor newActor, String lastName){
        boolean isActor = false;
            for (Actor actor : listOfActors){
                if (lastName.equals(actor.getLastName())){
                    listOfActors.remove(actor);
                    listOfActors.add(newActor);
                    isActor = true;
                    break;
                }
            }
            if(isActor){
            System.out.println("Новый актер успешно добавлен. Список актеров:\n" + listOfActors);
            } else {
            System.out.println("Актера нет в списке");
        }
    }
}
