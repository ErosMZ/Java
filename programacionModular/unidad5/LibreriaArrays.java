import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class LibreriaArrays {
    public static int[] generaArrayInt(int minimo, int maximo, int tamañoArray) {
        Random rd = new Random();
        int[] array1 = new int[tamañoArray];

        for (int i = 0; i < tamañoArray; i++) {
            int valorEntero = rd.nextInt(maximo - minimo + 1) + minimo;
            array1[i] = valorEntero;
        }

        return array1;
    }
    
    public static int minimoArrayInt(int []array){
        int valorMin = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < valorMin) {
                valorMin = array[i];
            }
        }

    return valorMin;
    }
    
    public static int maximoArrayInt(int[] array) {
        int valorMax = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > valorMax) {
                valorMax = array[i];
            }
        }

        return valorMax;
    }

    public static int[] volteaArrayInt(int []array){
        int tamañoArray= array.length;
        int [] array1= new int[array.length];
        int b=0;
        for(int a =tamañoArray-1;a>=0;a-- ){
                array1[a]= array[b];
            
            b++;
        }
        return array1;
    }
    public static void main(String[] args) {
        int []array3= {13,2,3,4,5,6,7,8,9};
        System.out.println((Arrays.toString(volteaArrayInt(array3))));
    }
}
