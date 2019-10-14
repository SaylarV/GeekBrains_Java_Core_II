package GeekBrains_HW_Lesson_3;

import java.util.*;

class FruitList {
    private List<String> fruitList = new ArrayList<>();

    FruitList() {
    }

    void setFruitList(List<String> fruitList) {
        this.fruitList = fruitList;
    }

    void countFruits(){
        Map<String, Integer> uniqFruits = new HashMap<>();
        for(int i = 0; i < fruitList.size(); i++){
            int count = 1;
            for (String s : fruitList) {
                if (fruitList.get(i).equals(s)) {
                    uniqFruits.put(fruitList.get(i), count);
                    count++;
                }
            }
        }
        uniqFruits.forEach((k,v) -> {System.out.println(k + " " + v);});
    }

}
