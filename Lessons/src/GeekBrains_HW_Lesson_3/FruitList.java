package GeekBrains_HW_Lesson_3;
//1 Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и
//вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
//Посчитать, сколько раз встречается каждое слово.

import java.util.ArrayList;
import java.util.List;

public class FruitList {

    private List<String> list = new ArrayList<>();

    void add(String name){
        list.add(name);
    }

    void printList(){
        add("Banana");
        add("Banana");
        add("Apple");
        add("Kiwi");
        add("Banana");
        add("Coconut");
        add("Melon");
        add("Apple");
        add("Strawberry");
        add("Blueberry");
        add("Coconut");
        System.out.print("Unique words: ");
        for (int i = 0; i < list.size(); i++){
            int count = 1;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    if (i!=j){
                        count++;
                    }
                }
            }
            if (count==1){
                System.out.print(list.get(i)+" ");
            }
        }
        System.out.println();
    }
}
