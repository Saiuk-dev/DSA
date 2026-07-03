public class CheckifSorted {
     public static void main(String Args[]){
        int num2[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.err.println(Checkifsorted(num2));
     } 
     
     public static Boolean Checkifsorted(int num2[]){
       for(int i = 0; i<num2.length-1; i++){
          if(num2[i]>num2[i+1]){
                return false;
          }
          }
       return true;
     }
}

