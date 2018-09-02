package lesson16.task11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapPets {
    public static void main(String[] args) {
        Map<String, Pet> mPets = new HashMap<>();
        mPets.put("Мурзик", new Cat());
        mPets.put("Рекс", new Dog());
        mPets.put("Кеша", new Parrot());
        print(mPets);
    }

    public static void print(Map<String, Pet> mp) {
      Set<Map.Entry<String, Pet>> sp=mp.entrySet();
        for (Map.Entry<String, Pet> a : sp) {
            System.out.print(a.getKey()+ "     ");
            System.out.println(a.getValue());
        }
    }
}