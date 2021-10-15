package Lesson1;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Setter
@Getter

public class Employee {

    private String fio;
    private int workAge;

    String[] nameArr = {"Вася", "Петя", "Ваня", "Дима", "Коля", "Саша", "Слава", "Костя", "Андрей", "Паша"};
    String[] surnameArr = {"Иванов", "Петров", "Сидоров", "Круглов", "Хазанов", "Жванецкий", "Задорнов", "Кроликов",
            "Маменко", "Рабинович"};
    Random random = new Random();
    int x = random.nextInt(10);
    int y = random.nextInt(10);

    public Employee() {

        this.fio = nameArr[x] + " " + surnameArr[y];
        this.workAge = random.nextInt(35);
    }

    @Override
    public String toString() {
        return "Employee{" +
                " сотрудник " + fio + '\'' +
                " стаж " + workAge + '\'' +
                '}';
    }
}

