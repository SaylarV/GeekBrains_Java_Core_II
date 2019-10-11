package GeekBrains_HW_Lesson_3;
//2 Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и
//телефонных номеров. В этот телефонный справочник с помощью метода add() можно
//добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует
//учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
//тогда при запросе такой фамилии должны выводиться все телефоны. Желательно не
//добавлять лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с
//пользователем через консоль и т.д). Консоль использовать только для вывода результатов проверки
//телефонного справочника.

import java.util.HashMap;
import java.util.Map;

class Phonebook {
    //private String phoneNumber;
    private String lastName;

    Phonebook(String lastName) {
        this.lastName = lastName;
    }

    private Map<String,String> phoneBook = new HashMap<>();

    private void add(String phoneNumber, String lastName){
        phoneBook.put(phoneNumber,lastName);
    }

    void get(){
        add("123456","Sidorov");
        add("234567","Petrov");
        add("345678","Ivanov");
        add("456789","Sidorov");

        phoneBook.forEach((key,value) ->{
            if (value.equals(lastName)){
                System.out.println(value + "'s phone number is " + key);
            }
        });
    }
}




