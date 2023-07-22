import java.awt.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte ageTest = 15;
        if (ageTest < 18)
            System.out.println("Ваш возраст не достиг совершенолетия. Нужно подождать " + (18 - ageTest) + " года");
    }

    public static void task2() {
        System.out.println("Задача 2");
        byte airTemperature = 4;
        if (airTemperature < 5)
            System.out.println("Температура воздуха " + airTemperature + "градусов. На улице холодно, нужно надеть шапку.");
        airTemperature = 5;
        if (airTemperature >= 5)
            System.out.println("Температура воздуха " + airTemperature + "градусов. Сегодня тепло, можно идти без шапки.");
    }

    public static void task3() {
        System.out.println("Задача 3");
        short speed = 61;
        short speedLimit = 60;
        if (speed > speedLimit)
            System.out.println("Если скорость больше " + speedLimit + " км/ч, придётся заплатить штраф.");
        speed = 60;
        System.out.println("Если скорость меньше " + speedLimit + " км/ч, можно ездить спокойно.");
        if (speed > speedLimit) ;
    }

    public static void task4() {
        System.out.println("Задача 4 ");
        byte agePeople = 1;
        for (; agePeople < 61; ) {
            if (agePeople < 2)
                System.out.println("Если возраст человека " + agePeople + ", ему пора спать");
            else if (agePeople >= 2 && agePeople <= 6)
                System.out.println("Если возраст человека " + agePeople + ", то ему нужно ходить в детский сад");
            else if (agePeople >= 7 && agePeople < 18)
                System.out.println("Если возраст человека " + agePeople + ", то ему нужно ходить в школу");
            else if (agePeople >= 18 && agePeople < 24)
                System.out.println("Если возраст человека " + agePeople + ", то его место в университете");
            else if (agePeople >= 24 && agePeople < 60)
                System.out.println("Если возраст человека " + agePeople + ", то ему пора ходить на работу");
            else
                System.out.println("Если возраст человека " + agePeople + " и больше, то он может отдохнуть");
            agePeople++;
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte ageChild = 1;
        for (; ageChild < 15; ) {
            System.out.println("Если возраст ребёнка равен " + ageChild + ", тогда:");
            if (ageChild < 5)
                System.out.println("не может кататься на аттракционе");
            else if (ageChild >= 5 && ageChild < 14)
                System.out.println("он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
            else if (ageChild >= 14)
                System.out.println("он может кататься без сопровождения взрослого");
            ageChild++;
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
//      needTransported это переменная
        short needTransported = 600;
//      seаting и places это константы
        byte seating = 60;
        byte places = 102;
        int standingPlaces = places - seating;
        boolean possibilityTransportSeating = needTransported <= places && needTransported > 0 && needTransported <= seating;
        boolean possibilityTransportMax = needTransported <= places && needTransported > 0 && needTransported > seating && needTransported <= places;
        boolean possibilityTransportNotAll = needTransported > places;
        if (possibilityTransportSeating) {
            System.out.println("Для перевозки всех " + needTransported + " пассажиров, есть сидячие свободные места ");
        } else if (possibilityTransportMax) {
            System.out.println("Для перевозки всех " + needTransported + " пассажиров, сидячих мест " + seating + " и стоячих " + (needTransported - seating) + " мест");
        } else if (possibilityTransportNotAll) {
            System.out.println("Для перевозки всех " + needTransported + " пассажиров будет заполнен один вагон и ещё потребуется " + (needTransported % places) + " вагонов для перевозки оставшихся " + (needTransported - places) + " человек");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        boolean equalityNoAll = one != two && two != three && three != one;
        boolean equalityOneIs = one != two || two != three || three != one;
        if (equalityNoAll && equalityOneIs) {
            if (one < three && two < three) {
                System.out.println("Наибольшая переменная с значением " + three + " c именем: three");
            } else if (two < one && three < one) {
                System.out.println("Наибольшее переменная с значением  " + one + " с именем: one");
            } else if (three < two && one < two) {
                System.out.println("Наибольшее число " + two + " с именем: two");
            }
        } else System.out.println("В сравниваемых переменных, есть равные значения ");
    }
}