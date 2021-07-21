package Lesson4;

import Lesson4.Exeptions.LimitDimensionsException;
import Lesson4.Exeptions.LimitSpeed100Exception;
import Lesson4.Exeptions.LimitSpeed80Exception;
import Lesson4.Exeptions.LimitWeightException;

import java.util.Random;

public class Auto implements Automotive {
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

    public Auto() {
        this.speed = random.nextInt(120);
        this.height = random.nextInt(500);
        this.width = random.nextInt(350);
        this.weight = random.nextInt(10);
        this.num = random.nextInt(1000);
        this.number = String.valueOf(x + num + y);
    }

    @Override
    public void speedCheck() throws LimitSpeed80Exception, LimitSpeed100Exception {
        if (getSpeed() < 80) {
            System.out.println(" Легковой автомобиль" + getNumber() + " успешно прошел КПП по скорости "
                    + " № " + getNumber() + " Скорость " + getSpeed());
        } else if (getSpeed() > 80 & getSpeed() <= 100) {
            throw new LimitSpeed80Exception(" Легковой автомобиль № " + getNumber()
                    + " превышение скорости" + getSpeed() + " max 80км/ч ");
        } else if (getSpeed() > 100) {
            throw new LimitSpeed100Exception("Легковой автомобиль № "
                    + getNumber() + " скорость более 100 км/ч " + getSpeed() +
                    " автомобиль преследует полиция ");
        }
    }

    @Override
    public void dimensions() throws LimitDimensionsException, LimitWeightException {
        if (getWeight() > CheckPoint.getWEIGHT()) {
            throw new LimitWeightException(" Легковой втомобиль " +
                    getNumber() + " превышает допустимую массу ");
        } else if (getHeight() > CheckPoint.getHEIGHT() || getWidth() > CheckPoint.getWIDTH()) {
            throw new LimitDimensionsException(" Легковой автомобиль "
                    + getNumber() + " не проходит по габаритам ");
        } else {
            System.out.println(" Легковой автомобиль" + getNumber() + " успешно прошел КПП по габаритам ");
        }
    }
}

