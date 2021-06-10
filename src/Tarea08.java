import java.util.ArrayList;
import java.util.Random;

public class Tarea08 {
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<Integer>();
        Random generador=new Random();
        for (int i = 0; i<=9;i++){
            int numeroAleatorio=generador.nextInt(100)+1;
            array.add(numeroAleatorio);

        }
        System.out.println("El contenido del ArrayList original es: "+array);

        for (int i = 0; i<=array.size()-1;i++){
            int numeroMaximo=0;
            if (numeroMaximo>= array.get(i)){
                System.out.println(numeroMaximo);
            }

        }
    }
}
