package Lesson1;

import java.util.*;

public class EmployeeRunner {
    public static void main(String[] args) {
        List<Employee> employeesList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            Employee employee = new Employee();
            employeesList.add(employee);
        }
        System.out.println("Список ВСЕХ сотрудников");

        ListIterator<Employee> iterator = employeesList.listIterator();
        System.out.println("Итерируем вперед");
        while (iterator.hasNext()) System.out.println(iterator.next());
        /*
        При необходимости итерируем в обратном направлении.
        Закоментированно для положении "каретки" в начеле коллекции
        System.out.println("Итерируем назад");
        while (iterator.hasPrevious()) System.out.println(iterator.previous());
         */

        System.out.println("##############################");
        int w;
        System.out.println("Введите минимальный стаж сотрудника. Будет построен список");

        Scanner scanner = new Scanner(System.in);
        w = scanner.nextInt();

        PrintEmployee.printEmployee(employeesList, w);

        System.out.println("##############################");
        System.out.println("итерация коллекции с конца. Удаление нечетных позиций");

        boolean R = false;
        for (employeesList.listIterator(employeesList.size()); iterator.hasPrevious(); R = !R) {
            iterator.previous();
            if (R) {
                iterator.remove();
            }
        }
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}





