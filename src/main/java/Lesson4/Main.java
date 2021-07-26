package Lesson4;

import Lesson4.exceptions.LimitDimensionsException;
import Lesson4.exceptions.LimitSpeed100Exception;
import Lesson4.exceptions.LimitSpeed80Exception;
import Lesson4.exceptions.LimitWeightException;

import java.util.Random;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество автомобилей штурмующих КПП ");
        Scanner unit = new Scanner(System.in);
        final int size = unit.nextInt();

        Automotive[] automotive = new Automotive[size];
        for (int i = 0; i < size; i++) {
            Random type = new Random();
            int s = type.nextInt(2);
            if (s % 2 == 0) {
                automotive[i] = new Auto();
            } else {
                automotive[i] = new CargoAuto();
            }
        }

        for (int i = 0; i < automotive.length; i++) {
            try {
                automotive[i].speedCheck();
                automotive[i].dimensions();
                System.out.println("Автомобиль успешно прошел КПП");
            } catch (LimitDimensionsException | LimitWeightException | LimitSpeed80Exception | LimitSpeed100Exception e) {
                System.out.println(e);
            }
        }
    }
}
