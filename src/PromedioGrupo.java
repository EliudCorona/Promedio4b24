import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PromedioGrupo{

    /* programa que calcula el promedio de un grupo
     * El tamaño del grupo es N
     * las calificaciones se leen y se almacenan en un arreglo del tamaño de N
     */

            //Arreglo de tipo de dato abstracto (TDA)
    public static Estudiante[] estudiantes;

    
    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;

    public static void leer_estudiantes() throws IOException{
        String matricula, nombre;
        for (int i = 0; i < estudiantes.length; i++){
            System.out.println("-----------------------------");
            System.out.print("Informacion del estudiante [" + (i+0) + "]");
            System.out.print("Matricula: ");
            matricula = bufer.readLine();
            matricula = entrada;
            System.out.print("Nombre: ");
            entrada = bufer.readLine();
            nombre = entrada;
            Estudiante e = new Estudiante(matricula, nombre);
            System.out.println("escriba calificaciones de estructura: ");
            entrada = bufer.readLine();
            e.setEvaluacion(Double.parseDouble(entrada));
            System.out.println("escriba calificaciones de evaluacion: ");
            entrada = bufer.readLine();
            e.setEvaluacion(Double.parseDouble(entrada));
            System.out.println("escriba calificaciones de ingles: ");
            entrada = bufer.readLine();
            e.setIngles(Double.parseDouble(entrada));
            e.setPromedio();
            estudiantes[i] = e; //agregamos un objeto estudiante al arreglo
        }
    }

    

    public static void main(String[] args) throws IOException {
        int N;




        //Arreglo de tipo de dato primitivo
        double[] calificaciones;
        double suma = 0;// para sumar calificaciones 
        double promedio;//el promedio del grupo
        System.out.println("Programa para calcular el promedio de un grupo ");
        System.out.print("Escribe  el tamaño del grupo ");
        entrada = bufer.readLine();
        N = Integer.parseInt(entrada); 
        
        //construyendo el arreglo de estudiantes
        estudiantes = new Estudiante[N];
        // construimos el arreglo de clificaciones
        calificaciones = new double[N];
        //leer las calificaciones de un alumno
        // for (int i = 0; i < calificaciones.length; i++) {
        //     System.out.print("Escriba la calificacion del alummno " + (i + 1) + " : ");
        //     entrada = bufer.readLine();
        //     calificaciones[i] = Double.parseDouble(entrada);
        //     suma += calificaciones[i];
        // }
        // promedio = suma / N;


 
        System.out.println("Las calificaciones del grupo son: ");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println(calificaciones[i]);
        }
        System.out.println("El promedio del grupo es: " + promedio);
    }
}
    