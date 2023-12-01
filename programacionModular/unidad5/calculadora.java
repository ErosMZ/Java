import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lineas=0;
        String valor = " ";
        float resultado= 0;
        float [] array1 = new float[lineas];

        System.out.println("Cuantas lineas quieres ");
        lineas= scan.nextInt();

        
        for(int a=0; a<=lineas;a++){
            System.out.println();
            valor= scan.nextLine();


            switch (valor) {
            case "+":
                resultado= array1[0] + array1[1];
                break;
            case "-":
                resultado= array1[0] + array1[1];
                break;
            case "*":
                resultado= array1[0] + array1[1];
            case "/":
                resultado= array1[0] + array1[1];
                break;
            default:
                if(array1[a]>0){
                array1[a+1] = array1[a];
                }
            }
            if(array1[a]>0 ){
                array1[a+1] = array1[a];

            }
        }
/*if(queQuierehacer==1){
            switch (valor) {
                case "+":
                    resultado= array1[0] + array1[1];
                    break;
                case "-":
                    resultado= array1[0] + array1[1];
                    break;
                case "*":
                    resultado= array1[0] + array1[1];
                case "/":
                    resultado= array1[0] + array1[1];
                    break;
            }
            System.out.println(resultado);
        }
        if (queQuierehacer==2) {
            for(int a=0; a<=lineas;a++){
            System.out.println();
            valor= scan.nextLine();
            
            if(array1[a]>0 ){
                array1[a+1] = array1[a];

            }
        }
        }*/
    }
}