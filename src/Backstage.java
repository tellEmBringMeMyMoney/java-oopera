import data.human.Gender;
import data.human.Actor;
import data.human.Director;
import data.show.Opera;
import data.show.Piece;
import data.show.Ballet;
import data.show.Show;

import java.util.ArrayList;
import java.util.Scanner;

public class Backstage {

    Show show;
    Ballet ballet;
    Opera opera;
    Piece piece;
    Actor actor1;
    Actor actor2;
    Actor actor3;
    Actor actor4;
    Director director1;
    Director director2;
    Director choreographer;
    Director composer;
    ArrayList<Actor> pieceCast = new ArrayList<>();
    ArrayList<Actor> operaCast = new ArrayList<>();
    ArrayList<Actor> balletCast = new ArrayList<>();

    public void printMenu() {
        while (true) {
            System.out.println("Выберите вариант наполнения театра: \n " +
                    "1 - Ручной ввод \n 2 - Автоматическое заполнение \n 3 - Выход");
            Scanner scanner = new Scanner(System.in);
            int check = scanner.nextInt();

            switch (check){
                case 1:
                    System.out.println("Ручной ввод пока не доступен :(");
                    break;
                case 2:
                    createTheatre();
                    System.out.println("----------Распечатка представлений----------");
                    printShows();
                    System.out.println("----------Замена актера из пула----------");
                    piece.changeActors(actor4, "Оперный");
                    System.out.println("----------Замена актера не из пула----------");
                    opera.changeActors(actor1, "Крупный");
                    System.out.println("----------Либретто оперы и балета----------");
                    printLibretto();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Такой команды нет. Попробуйте ещё раз");
            }

        }
    }
    private void createTheatre(){
        actor1 = new Actor("Валерий", "Оперный", Gender.MALE, 170);
        actor2 = new Actor("Бен", "Довер", Gender.MALE, 161);
        actor3 = new Actor("Белла", "Суонн", Gender.FEMALE, 161);
        actor4 = new Actor("Андрей", "Высокий", Gender.MALE, 230);

        director1 = new Director("Семен", "Семейный", Gender.MALE,
                6, "Режиссер");
        director2 = new Director("Елена", "Полено", Gender.FEMALE,
                7, "Режиссер");
        choreographer = new Director("Татьяна", "Былинова", Gender.FEMALE,
                20, "Хореограф");
        composer = new Director("Шонн", "Комбс", Gender.MALE,
                84, "Композитор");

        pieceCast.add(actor1);
        pieceCast.add(actor2);

        operaCast.add(actor3);

        balletCast.add(actor1);
        balletCast.add(actor2);
        balletCast.add(actor3);

        String pieceLibretto = "Жили-были Али обжект и его 40 наследников\n" +
                "Как-то раз они все поссорились и осталось всего 2 наследника\n" +
                "Конец";

        String operaLibretto = "В коду родилась циферка, в коду она росла\n" +
                "Прошли года - пришла обертка, циферка ушла";

        String balletLibretto = "Писал я коды до двадцатого пота \n" +
                "Нажал \"Запустить\" - компик впредь не работал.";

        piece = new Piece("Али Обжект и 40 наследников", "Пьеса", pieceCast, director1,
                pieceLibretto);
        opera = new Opera("Назвался интом - полезай в обертку", "Опера", operaCast,
                director2, composer, operaLibretto);
        ballet = new Ballet("Через тернары к строкам", "Балет", balletCast, director1,
                 composer, choreographer, balletLibretto);
    }
    public void printShows(){
        System.out.println(piece + "\n");
        System.out.println(opera + "\n");
        System.out.println(ballet + "\n");
    }





    public  void printLibretto(){
        System.out.println("Текст Оперы");
        opera.printLibretto();
        System.out.println("\n Текст баллета");
        ballet.printLibretto();
    }
}
