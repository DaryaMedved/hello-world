package by.itacademy.hw4;
public class Task5 {
        public static void main(String[] args){
            int [] loc = {-25, -1, -250, -5};
            int max = loc[0];
            int min = loc[0];
            for(int i = 0; i != loc.length; i ++){
                if(loc[i] > max){
                    max = loc[i];
                }
                if(loc[i] < min){
                    min = loc[i];
                }
            }
            System.out.println(max + " " );
        }
    }


