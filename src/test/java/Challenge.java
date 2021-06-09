import com.google.common.collect.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Challenge {
    public static void main(String args[])
    {
        Integer arr1[]={1,2};
        Integer arr2[]={3,4};
        Stream<Integer> stream1=Arrays.stream(arr1);
        Stream<Integer> stream2=Arrays.stream(arr2);
        Stream<Integer> Stream3= Streams.concat(stream1,stream2);
        Integer arr[]=new Integer[arr1.length+arr2.length];
        arr=Stream3.toArray(Integer[]::new); //Stream3.toArray(String[]::new) //Stream3.toArray(Integer[]::new) -->If Stream<T>
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
        ////////////////////////////
        System.out.println("---------------------------------------------------");
        int arr3[]={1,2};
        int arr4[]={3,4};
        IntStream stream3=Arrays.stream(arr3);
        IntStream stream4=Arrays.stream(arr4);
        IntStream Stream5= Streams.concat(stream3,stream4);
        int arr5[]=new int[arr1.length+arr2.length];
        arr5=Stream5.toArray(); //EMPTYYYYY AS IT IS INTSTREAM int
        for(int i=0;i<arr5.length;i++)
            System.out.println(arr5[i]);
        System.out.println("---------------------------------------------------");
        List<String> str=new ArrayList<String>();
        str.add("aaa");
        str.add("bbb");
        String mergedArr[]= new String[str.size()];
                str.toArray(mergedArr); // LIST TO ARRAY
        for(int i=0;i<mergedArr.length;i++)
            System.out.println(mergedArr[i]);
        Thread t1=new Thread();
        Thread t2=new Thread();



    }
}
