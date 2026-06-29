package practice;

import java.util.ArrayList;
import java.util.List;

public class StreamPractice {
    public static void main(String[] args) {
        List <Integer> numbers=new ArrayList<>();

        for(int i=5;i<=40;i=i+5){
            numbers.add(i);
        }
        for (Integer i:numbers){
            System.out.println(i);
        }
        System.out.println("_____________________Even Numbers______________________");
        numbers.stream()
                .filter(number->number%2==0)
                .forEach(System.out::println);

        System.out.println("_____________________Square of a number______________________");
        List<Integer> square=numbers.stream()
                .map(integer -> integer*integer)
                .toList();
        square.forEach(System.out::println);
        System.out.println("_____________________Sum of Square______________________");
        int x=square.stream()
                .reduce(0,Integer::sum);
        System.out.println(x);
        System.out.println("_____________________numbers greater than 20_____________________");
        numbers.stream()
                .filter(number->number>20)
                .forEach(System.out::println);
        numbers.stream()
                .map(number->"Number: "+number)
                .forEach(System.out::println);

    }


}
