package Lesson4;

import Lesson4.Exeptions.LimitDimensionsException;
import Lesson4.Exeptions.LimitSpeed100Exception;
import Lesson4.Exeptions.LimitSpeed80Exception;
import Lesson4.Exeptions.LimitWeightException;

import java.util.Random;

public class CargoAuto implements Automotive {
    Random random = new Random();
    private String number;
    int num;
    private int speed;  // скорость км/ч
    private int height; // высота cm
    private int width;  // ширина cm
    private int weight; // вес тонна


    Random r = new Random();
    char x = (char) (r.nextInt(26) + 'a');
    char y = (char) (r.nextInt(26) + 'a');

    public int getWeight() {
        return weight;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getSpeed() {
        return speed;
    }

    public String getNumber() {
        return number;
    }

    Random w = new Random();
    char h = (char) (w.nextInt(26) + 'a');
    char t = (char) (w.nextInt(26) + 'a');


    public CargoAuto() {
        this.speed = random.nextInt(110);
        this.height = random.nextInt(550);
        this.width = random.nextInt(400);
        this.weight = random.nextInt(15);
        this.num = random.nextInt(1000);
        this.number = String.valueOf(Character.toString(h) + num + Character.toString(t));

    }

    @Override
    public void speedCheck() {
        if (getSpeed() < 80) {
            System.out.println(" Грузовой автомобиль № "+ getNumber() +  " Двигается с разрешенной скоростью " +
                    " Скорость " + getSpeed() + " км/ч ");
        } else if (getSpeed() > 80 & getSpeed() <= 100) {
            throw new LimitSpeed80Exception(" Грузовой автомобиль № " + getNumber() +
                    " превышает скорость  : " + getSpeed() + " max 80км/ч ");
        } else if (getSpeed() > 100) {
            throw new LimitSpeed100Exception(" Автомобиль № " + getNumber() + " скорость более 100 км/ч : "
                    + getSpeed() + " км/ч " + " автомобиль преследует полиция ");
        }
    }

    @Override
    public void dimensions() throws LimitDimensionsException, LimitWeightException {
        if (getWeight() > CheckPoint.getWEIGHT()) {
            throw new LimitWeightException(" Грузовой автомобиль № " + getNumber() + " превышает допустимую массу ");
        } else if (getHeight() > CheckPoint.getHEIGHT() || getWidth() > CheckPoint.getWIDTH()) {
            throw new LimitDimensionsException(" Грузовой автомобиль " + getNumber() + " не проходит по габаритам ");
        } else {
            System.out.println(" Габариты грузового автомобиля не превышают ограничениий для проезда КПП ");
        }
    }
}
