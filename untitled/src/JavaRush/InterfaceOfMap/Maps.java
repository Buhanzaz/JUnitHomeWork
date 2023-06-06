package JavaRush.InterfaceOfMap;

import java.util.HashMap;
import java.util.Map;

public class Maps {


    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"string 1");
        map.put(2,"string 2");
        map.put(3,"string 3");

        String string1 = map.get(1);
        String string2 = map.get(2);
        String string3 = map.get(3);

        for (Map.Entry<Integer, String> entry :map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key);
            System.out.println(value);
        }
    }
}
