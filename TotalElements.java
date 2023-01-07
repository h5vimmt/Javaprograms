//Given a list of integers, find the total numbers of elements present in the list using Stream functions
import java.util.*;
import java.util.stream.*;
public class TotalElements{

public static void main(String args[]){

List<Integer> intList = Arrays.asList(10,11,13,14,17,22,34,5,5,67,78,8,88,8,97);
long count = intList.stream().count();
System.out.println("Total elements in list"+count);
}
}