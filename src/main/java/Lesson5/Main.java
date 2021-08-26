package Lesson5;
/*   Реализовать приложение, которое принимает на вход некоторый текст (через консоль System.in),
        после чего вычисляет частоту появления слов и выводит слова в убывающем порядке их частоты появления в тексте.
        Под словом подразумевается любая непрерывная последовательность символов (до пробела, точки, запятой, двоеточия
        и других разделителей), состоящая только из букв и цифр, не учитывая регистр букв.
        Например, в строке "Семь раз отмерь, 1 раз отрежь!" ровно пять слов: "семь", "раз", "отмерь", "1", "отрежь"
        и вывод должен быть такой:
        Вывод для данного случая такой:
        раз
        семь
        замерь
        1
        отрежь
        Для решения необходимо воспользоваться только StreamAPI, избегая использование циклов и условных операторов.
        Для примера можно взять такой текст:
        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus.
        Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur.
        Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem.
        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer vel odio nec mi tempor dignissim.
*/
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String text = console.nextLine();
        Map<String, Integer> wordToCount = new TreeMap<>();
        for (String word : text.split(" "))
        {
            wordToCount.put(word, wordToCount.getOrDefault(word, 0) + 1);
        }
        System.out.println(wordToCount);

        //System.out.println(text);

    }
}
