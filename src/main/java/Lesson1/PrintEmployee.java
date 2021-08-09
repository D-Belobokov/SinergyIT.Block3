package Lesson1;

import java.util.List;

public class PrintEmployee {

    public static void printEmployee(List<Employee> employees, int workAge) {

        for (int i = 0; i < employees.size(); i++) {
            int v = employees.get(i).getWorkAge();
            if (v >= workAge) {
                System.out.println(" Сотрудник " + employees.get(i).getFio()
                        + " стаж не менее " + workAge + " лет ");
            }
        }
    }
}

