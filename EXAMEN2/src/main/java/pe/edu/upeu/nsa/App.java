package pe.edu.upeu.nsa;
import pe.edu.upeu.nsa.Examen.ResolucionExamen;


public class App {
 
    public static void main(String[] args) {
        int opcion;
        pe.edu.upeu.nsa.util.LeerTeclado lc = new pe.edu.upeu.nsa.util.LeerTeclado();
        ResolucionExamen Ejercicios = new ResolucionExamen();
        try {
            opcion = lc.leer(0, "ELIJA UN EJERCICIO DEL 2 al 5: ");

            switch (opcion) {
                case 2:
                    System.out.println("   EJERCICIO 2             ");
                    Ejercicios.ejercicio2();
                    break;
                case 3:
                    System.out.println("   EJERCICIO 3           ");
                    Ejercicios.ejercicio3();
                    break;
                case 4:
                    System.out.println("  EJERCICIO 4             ");
                    Ejercicios.ejercicio4();
                    break;
                case 5:
                    System.out.println("  EJERCICIO 4  ");
                    int n = lc.leer(0, "Ingrese numero");
                    int m = lc.leer(0,"Ingrese la potencia");
                    int respuesta = Ejercicios.ejercicio5(n , m);
                    System.out.println("el resultado es: "+respuesta);
            }        
        }catch (Exception e) {
            lc.leer(0, "Debes insertar un número");
        }
    }
}
