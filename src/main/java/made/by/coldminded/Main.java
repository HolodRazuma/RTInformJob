package made.by.coldminded;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Исходные данные
        int[] numbers = {1, 3, 4, 5, 1, 5, 4};

        List<Integer> numbers1 = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            numbers1.add((int) (Math.random() * 10));
        }

        //Вызов классов-счетчиков

        CountAllElements countArray = new CountAllElements();

        CountAllElements countList = new CountAllElements();

        CountAllElementsGroovyLang countArrayGroovyLang = new CountAllElementsGroovyLang();

        CountAllElementsGroovyLang countListGroovyLang = new CountAllElementsGroovyLang();

        //Вывод на консоль

        System.out.println(countArray.countAllElementsOfArray(numbers));
        System.out.println(countList.countAllElementsOfList(numbers1));
        System.out.println(countArrayGroovyLang.countAllElementsOfArray(numbers));
        System.out.println(countListGroovyLang.countAllElementsOfList(numbers1));

    }
}