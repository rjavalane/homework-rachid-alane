package homework4.map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class map1 {

    public static void main(String[] args) {

        List<String> modelsOfToyota= new ArrayList<>();
        modelsOfToyota.add("Camry");
        modelsOfToyota.add("Rav4");
        modelsOfToyota.add("Highlander");
        modelsOfToyota.add("Corrola");

        List<String> modelsOfVolkswagen = new ArrayList<>();
        modelsOfVolkswagen.add("Golf");
        modelsOfVolkswagen.add("Passat");
        modelsOfVolkswagen.add("Amarok");
        modelsOfVolkswagen.add("Atlas");

        List<String> modelsOfFord = new ArrayList<>();
        modelsOfFord.add("Fusion");
        modelsOfFord.add("Focus");
        modelsOfFord.add("Explorer");
        modelsOfFord.add("Mustang");

        Map<String, List<String>> carModels = new LinkedHashMap<>();
            carModels.put("Toyota",modelsOfToyota);
            carModels.put("Volkswagen",modelsOfVolkswagen);
            carModels.put("Ford",modelsOfFord);

       for (Map.Entry entry: carModels.entrySet()){
            System.out.println(entry.getKey() +" "+entry.getValue());
        }

    }
}
