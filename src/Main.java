import java.awt.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1 ");
        byte ageTest = 15;
        if (ageTest < 18)
            System.out.println("Ваш возраст не достиг совершенолетия. Нужно подождать " + (18 - ageTest) + " года");
    }

    public static void task2() {
        System.out.println("Задача 2 ");
        byte airTemperature = 4;
        if (airTemperature < 5)
            System.out.println("Температура воздуха " + airTemperature + "градусов. На улице холодно, нужно надеть шапку.");
        airTemperature = 5;
        if (airTemperature >= 5)
            System.out.println("Температура воздуха " + airTemperature + "градусов. Сегодня тепло, можно идти без шапки.");
    }

    public static void task3() {
        System.out.println("Задача 3 ");
        short speed = 61;
        short speedLimit = 60;
        if (speed > speedLimit)
            System.out.println("Если скорость больше " + speedLimit + " км/ч, придётся заплатить штраф.");
        speed = 60;
        System.out.println("Если скорость меньше " + speedLimit + " км/ч, можно ездить спокойно.");
        if (speed > speedLimit);
    }
}