import java.util.*;
public class reverse{
    public static void main(String[] args){
        int numbers[]= {2,4,6,8,10};
        reverse(numbers);
        System.out.println("Reversed array is:"+ Arrays.toString(numbers));
    }

    public static void reverse(int numbers[]){
        int first = 0;
        int last = numbers.length-1;

        while(first<last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first]= temp;

            first++;
            last--;
        }
    }
}