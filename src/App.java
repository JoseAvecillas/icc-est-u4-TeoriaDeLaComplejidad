import complejidades.ComplejidadConstante;
import complejidades.ComplejidadCuadratica;
import complejidades.ComplejidadLineal;
import complejidades.ComplejidadLogaritmica;
import complejidades.ComplejidadNLogN;
import view.Soutmethods;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ComplejidadConstante complejidadConstante = new ComplejidadConstante();
        ComplejidadCuadratica complejidadCuadratica = new ComplejidadCuadratica();
        ComplejidadLineal complejidadLineal = new ComplejidadLineal();
        ComplejidadLogaritmica complejidadLogaritmica = new ComplejidadLogaritmica();
        ComplejidadNLogN complejidadNLogN = new ComplejidadNLogN();
        Soutmethods views = new Soutmethods();

        int[] arreglos = {10, 23, 349, 11, 22, 57};
        int[] arreglomerge = {10, 23, 349, 11, 22, 57};
        complejidadConstante.ejemplo();
        complejidadLineal.busquedaLineal(arreglos, 10);
        System.out.println("---------------------------");
        complejidadCuadratica.ejemplo(arreglos);
        views.imprimirArreglo(arreglos);
        complejidadLogaritmica.busquedaBinaria(arreglos, 57);
        System.out.println("-------------------------");
        complejidadNLogN.complejidadNLogN(arreglomerge);
        views.imprimirArreglo(arreglomerge);

    }
}
