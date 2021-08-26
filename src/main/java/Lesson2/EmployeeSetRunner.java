/*
1. Необходимо создать структура данных Set<Employee>, который бы мог учесть логику добавления сотрудников
из предыдущего задания таким образом, что первыми в множестве должны идти Employee с максимальным стажем и по убывающей.
*/
package Lesson2;
import java.util.*;

public class EmployeeSetRunner {

    public static void main(String[] args) {
        Set<Employee> employeesSet = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee a, Employee b) {
                return b.getWorkAge() - a.getWorkAge();
            }
        });
        for (int i = 0; i < 10; i++) {
            Employee employee = new Employee();
            employeesSet.add(employee);
        }
        Iterator<Employee> it1 = employeesSet.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
    }
}


