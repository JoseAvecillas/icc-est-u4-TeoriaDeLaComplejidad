package complejidades;

public class ComplejidadNLogN {
    
    public void complejidadNLogN(int[] arr) {
        System.out.println("Complejidad N log N (Merge Sort)");

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Arreglo ordenado (Merge Sort O(n log n)):");
    }

    private void mergeSort(int[] arr, int inicio, int fin) {
        if (inicio >= fin) return;
        int medio = (inicio + fin) / 2;
        mergeSort(arr, inicio, medio);
        mergeSort(arr, medio + 1, fin);
        merge(arr, inicio, medio, fin);
    }

    private void merge(int[] arr, int inicio, int medio, int fin) {
        int[] temp = new int[fin - inicio + 1];
        int i = inicio;
        int j = medio + 1;
        int k = 0;
        while (i <= medio && j <= fin) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= medio) temp[k++] = arr[i++];
        while (j <= fin) temp[k++] = arr[j++];
        for (int p = 0; p < temp.length; p++) {
            arr[inicio + p] = temp[p];
        }
    }
}
