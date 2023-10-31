import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception{
        /*Bucle infinito hasta que se de
                    1 condición*/
        int bloquesUsuario = 0;
        // Scanner lector = new Scanner(System.in);
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            System.out.println("Bloques");
            //bloquesUsuario = lector.nextInt();
            bloquesUsuario = Integer.parseInt(buffer.readLine());
            if (bloquesUsuario==0){
                break;
            }
            int bloquesPorNivel = 1; // +2
            int a = 0;
            int sumatorioBloques = 0;
            for(a=0; sumatorioBloques<bloquesUsuario; a++){
                sumatorioBloques = sumatorioBloques + (bloquesPorNivel * bloquesPorNivel);
                bloquesPorNivel+=2;
            }
            System.out.println("Altura es: " + a);
        }
    }
}