package frecuenciascardiacas;
import java.util.Scanner;
/**
 * @author Ricardo Espinosa y Juan Diego Guerrero
 */
public class FrecuenciasCardiacas {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        String nombre, seguir = "s", seguir1 = "n";
        int diaNacimiento, mesNacimiento, anioNacimiento, anioActual = 2023, mesActual = 12, diaActual = 02, frecMax, edad, cont = 0;
        double frecRango1, frecRango2;
        System.out.println("Contador de frecuencias cardiacas");
        System.out.println("Nombre");
        nombre = tc.next();
        System.out.println("Dia de nacimiento");
        diaNacimiento = tc.nextInt();
        System.out.println("Mes de nacimiento");
        mesNacimiento = tc.nextInt();
        System.out.println("Anio de nacimiento");
        anioNacimiento = tc.nextInt();
        edad = anioActual - anioNacimiento;
        if (mesActual < mesNacimiento || (mesActual == mesNacimiento && diaActual < diaNacimiento)) {
            edad--;
        }
        frecMax = 220-edad;
        frecRango1 = frecMax*0.50;
        frecRango2 = frecMax*0.85;
        
        System.out.println("\nFrecuencias cardiacas de " + nombre);
        System.out.println("Fecha de Nacimiento: " + diaNacimiento + "/" + mesNacimiento + "/" + anioNacimiento);
        System.out.println("Edad: " + edad);
        System.out.println("Frecuencia cardiaca maxima: " + frecMax + " lpm");
        System.out.printf("%s %.0f %s %.0f %s","Rango de frecuencia cardiaca: ", frecRango1, " lpm /", frecRango2, " lpm\n");
        
        int[] historial = new int[10];
        int[] hora = new int[10];
        
        System.out.println("\nDesea crear un historial de frecuencias");
        System.out.println("s/n");
        seguir1 = tc.next();
        
        if(seguir1.equals("s") ){
            for (int i = 0;seguir.equals("s"); i++) {
                cont++;
                System.out.println("\nIngrese su " + cont + " registro");
                historial[i] = tc.nextInt();
                System.out.println("Ingrese la hora del " + cont + " registro");
                hora[i] = tc.nextInt();
                System.out.println("Desea ingresar otro registro");
                System.out.println("s/n");
                seguir = tc.next();
        }
                System.out.println("\nHistorial de frecuencias");
                System.out.printf("%s \t %s \n","Frecuencia ", " Hora");
            for (int i = 0; i<cont; i++) {
                System.out.printf("%d \t\t\t %d \n", historial[i], hora[i]);
        }
        }
        System.out.println("\nInforme terminado");
    }
}
