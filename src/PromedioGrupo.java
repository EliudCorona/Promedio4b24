import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PromedioGrupo{

    /* programa que calcula el promedio de un grupo
     * El tamaño del grupo es N
     * las calificaciones se leen y se almacenan en un arreglo del tamaño de N
     */

    public static void main(String[] args) throws IOException {
        int N;
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        double[] calificaciones;
        double suma = 0;// para sumar calificaciones 
        double promedio;//el promedio del grupo
        System.out.println("Programa para calcular el promedio de un grupo ");
        System.out.print("Escribe  el tamaño del grupo ");
        entrada = bufer.readLine();
        N = Integer.parseInt(entrada); 
    

        // construimos el arreglo de clificaciones
        calificaciones = new double[N];
        //leer las calificaciones de un alumno
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Escriba la calificacion del alummno " + (i + 1) + " : ");
            entrada = bufer.readLine();
            calificaciones[i] = Double.parseDouble(entrada);
            suma += calificaciones[i];
        }
        promedio = suma / N;
 
        System.out.println("Las calificaciones del grupo son: ");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println(calificaciones[i]);
        }
        System.out.println("El promedio del grupo es: " + promedio);
    }
}
    