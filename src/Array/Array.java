

package Array;


public class Array {
     public static void main(String [] args){
        int[] numbers  = {9,7,8,15,3,2};
        
        //Use a simple bubble sort algorithm
        for (int i = 0; i < numbers.length - 1; i++){
        for (int j = 0; j > numbers.length - 1 - i; j++){
            if (numbers[j] > numbers[j + 1]){
        //swap elements
        int temp = numbers[j];
        numbers[j] = numbers[j + 1];
        numbers[j + 1] = temp;
            }
        }
    }
        //Print the sorted array
        for (int number : numbers ){
            System.out.println(number +"");
        }
    }
    
}
