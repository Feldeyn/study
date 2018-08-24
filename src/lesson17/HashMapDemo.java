package lesson17;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,Toy> map = new HashMap<>();
map.put("Кукла", new Toy("Кукла", 254));
map.put("Машинка", new Toy("Машинка", 564));
map.put("Кубик", new Toy("Кубик", 174));
        //System.out.println(map.get("Машинка"));
        enumerateKeys(map);
        enumValues(map);
    }
    public static void enumerateKeys(Map<String,Toy> map){
        Set<String> keys = map.keySet();
        for (String k: keys){
            System.out.print(k+"   ");
            System.out.println(map.get(k));
        }
    }
    public static void enumValues(Map<String,Toy> map){
        System.out.println("Печатает только значения");
        Collection<Toy> val=map.values();
        val.forEach(System.out::println);
    }
}
