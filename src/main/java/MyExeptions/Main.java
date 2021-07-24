package MyExeptions;

import MyExeptions.Exeptions.LimitDimensionsException;
import MyExeptions.Exeptions.LimitSpeed100Exception;
import MyExeptions.Exeptions.LimitSpeed80Exception;
import MyExeptions.Exeptions.LimitWeightException;

import java.util.Random;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество автомобилей штурмующих КПП ");
        Scanner unit = new Scanner(System.in);
        final int size = unit.nextInt();
        CheckPoint checkPoint = new CheckPoint();

        Automotive[] automotive = new Automotive[size];
        for (int i = 0; i < size; i++){
            Random type = new Random();
            int s = type.nextInt(2);
            if(s % 2 == 0){
                automotive[i] = new Auto();
            } else {
                automotive[i] = new CargoAuto();
            }
        }

        for(int i = 0; i < automotive.length; i++ ){
            try {
                automotive[i].speedCheck();
                automotive[i].dimensions();
            }catch (LimitDimensionsException | LimitWeightException | LimitSpeed80Exception | LimitSpeed100Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
