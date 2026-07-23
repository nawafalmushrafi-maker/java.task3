package idea.project.java.task3;
import java.util.List;
import java.util.ArrayList;
public class NumberListStatistics {
    public static void main(String[] args){
        // create list
        List<Integer>numbers=new ArrayList<>();

        //declare the variables
        Integer sum=0;
        Integer evenNum=0;
        Integer oddNum=0;
        Integer positiveNum=0;
        Integer negativeNum=0;
        Integer largestNum=0;
        Integer smallestNum=0;
        // add to the list
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(-8);
        numbers.add(9);
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(-6);
        numbers.add(-7);
        numbers.add(-8);
        numbers.add(9);
        numbers.add(0);
        numbers.add(13);
        numbers.add(14);
        numbers.add(150);
        numbers.add(16);

        // initialize largest and smallest to the first number
        largestNum=numbers.get(0);
        smallestNum=numbers.get(0);
        // use loop
        for( Integer number:numbers){
            // the sum
            sum=sum+number;
            // largest
            if(number > largestNum){
                largestNum=number;
            }
            // smallest
            if(number < smallestNum){
                smallestNum=number;
            }
            //even
            if(number%2==0){
                evenNum++;
            }
            //odd
            else{
                oddNum++;
            }
            //positive
            if(number > 0) {
                positiveNum++;
            }
            //negative
            else{
                negativeNum++;
            }
        }
        //displays list
        System.out.println("The list numbers are : " + numbers);
        System.out.println("The sum of the numbers is : "+sum);
        System.out.println("The average of the numbers is : "+ sum/numbers.size());
        System.out.println("The largest number is : " + largestNum);
        System.out.println("The smallest number is : " + smallestNum);
        System.out.println("The numbers of even numbers is : " + evenNum);
        System.out.println("The numbers of odd numbers is : " + oddNum);
        System.out.println("The numbers of positive numbers is : " + positiveNum);
        System.out.println("The numbers of negative numbers is : " + negativeNum);
    }
}

