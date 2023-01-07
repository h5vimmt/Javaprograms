
//program  to find even number in list
import java.util.*;
import java.util.stream.*;
public class EvenNoEx
{
public static void main(String s[]){

List<Integer> mylist = Arrays.asList(12,14,15,17,28);
mylist.stream().filter(n -> n%2==0).forEach(System.out::println);
}
}

