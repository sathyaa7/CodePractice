import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrintWithEscapeSequence {
    public static void main(String args[]) {
        System.out.println("\\\"Hello I am a string with escape sequence\\\"");
        System.out.println("\"Hello I am a string with double quotes\"");
        int i = (byte) +(char) -(int) +(long) -1;
        System.out.println(i);
        LinkedHashMap<String,Integer> umap=new LinkedHashMap<>();
        umap.put("a",3);
        umap.put("b",2);
        umap.put("g",3);
        LinkedHashMap<String,Integer> smap=new LinkedHashMap<>();
        umap.entrySet().stream()
                .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
                .forEach(k -> smap.put(k.getKey(),k.getValue()));
        System.out.println(smap);
        //Collections.sort(list,(l1,l2)->l1.getValue().compareTo(l2.getValue());

        //CONVERSIONS
//        List<Integer> list = Arrays.asList(1, 2, 3);
//        System.out.print("Covert this list to array and stream " + list);
//        Integer[] array=new Integer[5];
//        System.out.println("List to array using toArray (passing arg since it returns object type) "+list.toArray(array) );
//        array=list.toArray(array);
//        Stream<Integer> stream;
//        System.out.println("List to stream using collector "+list.stream());
//        stream=list.stream();
//        System.out.print("Convert this array to list and stream " + array);
//        System.out.println("Array to list through stream"+Arrays.stream(array).collect(Collectors.toList()));
//        System.out.println("Array to stream using Arrays.stream "+Arrays.stream(array));
//        System.out.println("Convert this stream to list and array " + array);
//        System.out.println("Stream to list using "+stream.collect(Collectors.toList()));
//        Stream<Integer> str=Stream.of(1,2,3);
//        Integer[] arr=new Integer[5];
//        arr=str.toArray(Integer[]::new);
//        System.out.println("Stream to array using toArray "+ arr);

    }
}