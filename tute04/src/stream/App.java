package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>(Arrays.asList(new String[] {"1", "2", "3", "4", "5"}));
        for (String string : strings) {
            System.out.println(string);
        }
        Consumer<String> consumer = string -> System.out.println(string);
        strings.stream().forEach(consumer); 
        strings.forEach(consumer);

        












        List<String> strings2 = new ArrayList<String>(Arrays.asList(new String[] {"1", "2", "3", "4", "5"}));
        List<Integer> ints = new ArrayList<Integer>();
        for (String string : strings2) {
            ints.add(Integer.parseInt(string));
        }
        System.out.println(ints);

        // List<Integer> ints2 = strings2.stream().map(string -> Integer.parseInt(string)).collect(Collectors.toList());
        List<Integer> ints2 = strings2.stream().map(Integer::parseInt).collect(Collectors.toList());
        
    }


}