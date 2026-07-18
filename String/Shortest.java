package String;
import java.util.*;
public class Shortest {
    public static void main(String[] args){
        String str = "WNEENESENNN";
        System.out.println(Route(str));
    }

    public static float Route(String str){
        int x = 0;
        int y = 0;
        for(int i=0; i<str.length(); i++){
            char dir = str.charAt(i);

            //North
            if(dir == 'N'){
                y++;
            }

            //South
            if(dir == 'S'){
                y--;
            }

            //WEST
            if(dir == 'W'){
                x--;
            }

            //EAST
            if(dir == 'E'){
                x++;
            }   
        }
         int x2 = x*x;
            int y2 = y*y;
            return (float)Math.sqrt(x2 + y2);
        }
    }