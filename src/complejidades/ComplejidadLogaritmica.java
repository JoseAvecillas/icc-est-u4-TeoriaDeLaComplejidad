package complejidades;

public class ComplejidadLogaritmica {
    
    public void busquedaBinaria(int[] arr, int buscado) {
        System.out.println("Complejidad Logarítmica O(log n)");
        int izquierda = 0;
        int derecha = arr.length - 1;
        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;
            if (arr[medio] == buscado) {
                System.out.println("Número " + buscado + " encontrado en la posición " + medio);
                return;
            }
            if (arr[medio] < buscado) {
                izquierda = medio + 1; 
            } else {
                derecha = medio - 1; 
            }
        }
        System.out.println("Número " + buscado + " NO encontrado.");
    }
}
