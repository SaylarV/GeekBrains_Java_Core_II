package GeekBrains_HW_Lesson_3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        // part 1
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Kiwi");
        fruitList.add("Coconut");
        fruitList.add("Banana");
        fruitList.add("Cherry");
        fruitList.add("Strawberry");
        fruitList.add("Banana");
        fruitList.add("Kiwi");
        fruitList.add("Mango");
        FruitList fruits = new FruitList();
        fruits.setFruitList(fruitList);
        fruits.countFruits();
        System.out.println("---------------------");
        //******************************************************************************
        // part 2
        Phonebook phoneBook = new Phonebook();
        phoneBook.add("123456","Sidorov");
        phoneBook.add("234567","Ivanov");
        phoneBook.add("345678","Petrov");
        phoneBook.add("456789","Sidorov");
        phoneBook.printAll();
        System.out.println("--------------------");
        phoneBook.get("Sidorov");
    }
}