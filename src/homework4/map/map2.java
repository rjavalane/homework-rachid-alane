package homework4.map;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class map2 {
    public static void main(String[] args) {

        List<Integer> Price = new LinkedList<>();
            Price.add(1027);
            Price.add(1989);
            Price.add(1801);
            Price.add(1991);


        List<Integer> IdNumber = new LinkedList<>();
        IdNumber.add(1001);
        IdNumber.add(1002);
        IdNumber.add(1003);
        IdNumber.add(1004);

    List<Integer> Area = new LinkedList<>();
        Area.add(475);
        Area.add(658);
        Area.add(852);
        Area.add(969);

        Map<String, List<Integer>>  info = new LinkedHashMap<>();
        info.put("aptPrice", Price);
        info.put("ClientId", IdNumber);
        info.put("aptArea", Area);
        for (Map.Entry entry:info.entrySet()) {
        System.out.println(entry.getKey()+" "+ entry.getValue());
        }
        }



    }

