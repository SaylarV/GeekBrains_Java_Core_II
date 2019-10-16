package GeekBrains_HW_Lesson_3;

import java.util.HashMap;
import java.util.Map;

class Phonebook {

    private Map<String,String> phonebook = new HashMap<>();

    Phonebook() {
    }

    void add(String number, String name){
        phonebook.put(number,name);
    }
    void get(String name){
        phonebook.forEach((k,v) ->{
            if (v.equals(name)){
                System.out.println(v + "'s phone number is " + k);
            }
        });
    }

    void printAll(){
        phonebook.forEach((k,v) ->{System.out.println(k + " " + v);});
    }

}




