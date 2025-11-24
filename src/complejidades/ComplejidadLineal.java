package complejidades;
public class ComplejidadLineal {
    public void busquedaLineal(int[] arr, int buscado) {
        System.out.println("Comlejidad Lineal");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == buscado) {
                System.out.println(
                    "Número " + buscado + " encontrado en la posición " + i
                );
                return;
            }
        }
        System.out.println("Número " + buscado + " NO encontrado.");
    }
}
