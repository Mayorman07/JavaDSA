package KeysAndValues;

import java.util.*;
import java.util.stream.Collectors;


public class MappingArrays {
    public static void main(String[] args) {

        //create an object of map interface using the treemap class
        //treemap to store key/value pairs in a sorted order
        Map<String, String> map = new TreeMap<>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");

        //pass each key and value pair into an array of strings with the variable name valuesArray
//        String[] valuesArray = getValuesArray(map);
//        for (String value : valuesArray) {
//            System.out.println(value);
//
//        }
        List<Object> startWords = map.entrySet()
                .stream()
                .map(x -> x.getValue())
                .collect(Collectors.toList());
    }
      //declare method that takes a parameter of a map object and returns an array of strings
    public static String[] getValuesArray(Map<String, String> map) {
        // Storing the set of keys in a list
        List<String> sortedKeys = new ArrayList<>(map.keySet());
        // Sorting the keys alphabetically with the collections method
        Collections.sort(sortedKeys);

        // Create an array of string to store the values, the size of the arrays depends on how many keys we have
        String[] valuesArray = new String[sortedKeys.size()];

        // Retrieve the corresponding values and store them in the array variables
        for (int i = 0; i < sortedKeys.size(); i++) {
            String key = sortedKeys.get(i);
            String value = map.get(key);
            valuesArray[i] = value;
        }

        return valuesArray;
    }
}



