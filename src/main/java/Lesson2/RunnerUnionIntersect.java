/*2. Необходимо реализовать методы объединения и пересечения двух множеств
        union(Set set1, Set set2) и intersect(Set set1, Set set2), заполнив значения множества случайным образом.
*/
package Lesson2;
import java.util.*;

public class RunnerUnionIntersect {
    private static Set<Integer> union(Set<Integer> x1, Set<Integer> x2) {
        Set<Integer> rezultUnion = new HashSet<>(x1);
        rezultUnion.addAll(x2);
        return rezultUnion;
    }

    private static Set<Integer> intersect(Set<Integer> x1, Set<Integer> x2) {
        Set<Integer> rezultIntercect = new HashSet<>(x1);
        rezultIntercect.addAll(x2);
        rezultIntercect.retainAll(x2);
        return rezultIntercect;
    }

    private static void print(String string, Set<Integer> set) {
        if (set.size() != 0) {
            System.out.print(string + " - { ");
            for (Integer currentElement : set) {
                System.out.print(currentElement + " ");
            }
            System.out.println("}");
        }
    }

    public static void main(String[] args) {
        Random random = new Random();

        Set<Integer> x1 = new HashSet<>();
        for (int i = 0; i < 35; i++) {
            x1.add(random.nextInt(50));
        }
        Set<Integer> x2 = new HashSet<>();
        for (int i = 0; i < 35; i++) {
            x2.add(random.nextInt(50));
        }
        print("Множество x1 ", x1);
        print("Множество x2", x2);
        System.out.println("********************************");
        print("Объеденение множеств", union(x1, x2));
        print("Пересечение множеств", intersect(x1, x2));
    }
}









