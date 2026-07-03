public class tp {
    //Lergest in array 
    public static void main(String[] args){
        int arr[] = {2,4,3,5,6,4,5,6,8,9,6,4,5,7,3,10,12,15,6,4,};
        int nums[] = {1,2,3,4,5,6,7,8,9,10,12,13,14,1,15,17,45,72,23,32,23,23};
        Largest(arr);
        Secondlargest(arr);
        
        Largest(nums);
        Secondlargest(nums);
    } 

    public static int Largest(int arr[]) {
    int max = arr[0];

    for(int i = 1; i < arr.length; i++) {
        if(arr[i] > max) {
            max = arr[i];
        }
    }
    System.out.println("Largest in the array is :"+max);
    return max;
}

public static int Secondlargest(int arr[]) {
    int max = Integer.MIN_VALUE;
    int secondmax = Integer.MIN_VALUE;

    for(int i = 0; i < arr.length; i++) {
        if(arr[i] > max) {
            secondmax = max;
            max = arr[i];
        }
        else if(arr[i] > secondmax && arr[i] != max) {
            secondmax = arr[i];
        }
    }
    System.out.println("2nd Largest in the array is :"+ secondmax);
    return secondmax;
}
   
    }
                                    