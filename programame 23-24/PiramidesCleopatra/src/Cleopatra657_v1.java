import java.util.Scanner;

public class Cleopatra657_v1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner lector = new Scanner(System.in);

        // Leer nº casos de prueba
        System.out.println("Dime casos de prueba");
        int casos = lector.nextInt();

        for (int i=0; i<casos; i++){
            System.out.println("Dime valor A, B Y C");
            int A = lector.nextInt();
            int B = lector.nextInt();
            int C = lector.nextInt();

            int distanciaBA = Math.abs(B-A);
            int distanciaCB = Math.abs(C-B);

            if((A<0) && (B>0)){
                distanciaBA-=1;
            }else if((B<0) && (C>0)){
                distanciaCB-=1;
            }

            if(distanciaBA>distanciaCB){
                System.out.println("C");
            }else if(distanciaBA<distanciaCB){
                System.out.println("A");
            }else{
                System.out.println("EMPATE.");
            }




        }

    }
}