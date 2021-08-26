package Lesson2;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

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
                "fio='" + fio + '\'' +
                ", workAge=" + workAge +
                '}';
    }

    private static void printSet(Employee employee, Set<Employee> set) {
        if (set.size() != 0) {
            System.out.print(employee + " - { ");
            for (Employee currentElement : set) {
                System.out.print(currentElement + " ");
            }
            System.out.println("}");
        }
    }

    private static Set<Employee> union(Set<Employee> employeeSet, Set<Employee> employeeSet2) {
        Set<Employee> unionSet = new TreeSet<Employee>();
        for (Employee currentElement : employeeSet) {
            unionSet.add(currentElement);
        }
        for (Employee currentElement : employeeSet2) {
            unionSet.add(currentElement);
        }
        return unionSet;
    }
}