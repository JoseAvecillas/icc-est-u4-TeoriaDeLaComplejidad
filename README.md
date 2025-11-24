# **INFORME DE INVESTIGACION**
![alt text](assets/ups-icc.png)

### **Asignatura:** Estructura de Datos

### **Tema:** Proyecto de Complejidad y Eficiencia de Algoritmos


# Integrantes:
- Antonio Carvelli - [Enlace a GitHub](https://github.com/acarvelli04)
- Jose Avecillas  - [Enlace a GitHub](https://github.com/JoseAvecillas)

# Objetivos:

Comprender y aplicar los principios de la Teoría de la Complejidad Computacional para evaluar la eficiencia temporal y espacial de diferentes algoritmos.

Utilizar la Notación Big O ($O$) para comparar formalmente el crecimiento asintótico de dos o más algoritmos que resuelven el mismo problema (ej., ordenar o buscar) y determinar cuál es superior a gran escala.


Realizar un análisis experimental del tiempo de ejecución (coste temporal) de los algoritmos seleccionados, comparando los resultados medidos en un entorno real con las predicciones del análisis teórico.


 Adquirir la habilidad de seleccionar e implementar algoritmos cuya complejidad sea la más adecuada para el tamaño de datos y las restricciones de recursos del problema.


# Marco Teórico: 


## **1. Teoría de la Complejidad**

### 1.1 Definición general
Es una subdisciplina fundamental de la informática y la programación que estudia la dificultad intrínseca de los problemas computacionales. Su objetivo principal es clasificar estos problemas basándose en los recursos necesarios para resolverlos, como el tiempo de ejecución y el uso de memoria (espacio).

### 1.2 Importancia en la resolución de problemas
La Teoría de la Complejidad es crucial porque permite a los desarrolladores y científicos de la computación predecir el rendimiento de un algoritmo para entradas de gran tamaño antes de implementarlo.

Escalabilidad: Permite determinar si una solución es viable para un conjunto de datos masivo. Un algoritmo con una complejidad de $O(n^2)$ puede ser rápido para $n=10$, pero se volverá molesto para por ejemplo $n=1,000,000$.

Selección Óptima: Facilita la elección del algoritmo más eficiente entre varias opciones para resolver el mismo problema, seleccionando aquel con la menor tasa de crecimiento asintótico.

Límites de Factibilidad: Ayuda a distinguir entre problemas tratables (resolubles en tiempo polinomial, Clase P) y problemas potencialmente intratables (que requieren un tiempo exponencial o factorial para ser resueltos en la práctica).
### 1.3 Eficiencia de algoritmos

* Coste temporal: Mide la cantidad de pasos o tiempo de cómputo que necesita un algoritmo para completarse, en función del tamaño de la entrada.
* Coste espacial: Mide la cantidad de memoria que requiere un algoritmo durante su ejecución.

### 1.4 Factores de tiempo de ejecución

* Factores propios: Son las propiedades intrínsecas del algoritmo que determinan su rendimiento basándose en el número de pasos que realiza

* Factores circunstanciales: Son las variables externas que influyen en el tiempo real de ejecución (medido en segundos)
* Análisis teórico: Es estudiar el código para contar las operaciones elementales (sumas, comparaciones, etc.) y expresarlas como una función del tamaño de la entrada ($n$).
* Análisis experimental: Es implementar el algoritmo y medir el tiempo real que tarda en una máquina específica con datos de entrada específicos.

### 1.5 Notación de complejidad

* Big O: La función de tiempo de ejecución del algoritmo no crecerá más rápido que esta cota. Es el peor caso de tiempo posible.

* Mejor caso: Es la entrada de datos que resulta en el menor tiempo de ejecución posible para el algoritmo. Por ejemplo, si un array ya está ordenado cuando se aplica un algoritmo de ordenamiento.
* Peor caso: Es el tiempo de ejecución esperado, asumiendo una distribución de probabilidad sobre todas las posibles entradas. Proporciona una medida más realista del rendimiento en la práctica.
* Caso promedio: 
* Big O, Ω, Θ:

    $O$ (Big O): Límite superior (Peor Caso).
    
    $\Omega$ (Big Omega): Límite inferior (Mejor Caso), garantiza que el algoritmo al menos tardará este tiempo.
    
    $\Theta$ (Big Theta): Límite ajustado, se usa cuando el límite superior ($O$) y el límite inferior ($\Omega$) coinciden, describiendo la tasa de crecimiento exacta.



# **2. Ejemplos de Complejidad en Java**



## **2.1 Complejidad O(1) – Constante**

### **Archivo:** `ComplejidadConstante.java`

### **Código del ejemplo**

```java
public void ejemplo(){
        System.out.println("Complejidad O(1)");
        int x= 10;
        int y= 10;
        int suma= x + y;
        System.out.println("Suma de x y y = " + suma);
        System.out.println("---------------------");
    }
```
### **Explicación resumida**

* Tiempo siempre igual, sin importar el tamaño del arreglo.
* No depende de cuántos elementos haya.


## **2.2 O(n) – Lineal**

### **Archivo:** `ComplejidadLineal`

### **Código del ejemplo**
```java
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
```

### **Explicación resumida**

* El tiempo crece proporcional al número de elementos.
* Recorres todos los elementos una sola vez.

## **2.3 O(n²) – Cuadrática**

### **Archivo:** `Complejidad Cuadratica`

### **Código del ejemplo**
```java
public void ejemplo(int[] numeros){
        System.out.println("Complejidad O(n al cuadrado)");
        for (int i = 0; i < numeros.length -1 ; i++) {
            for (int j = 0; j < numeros.length -1 -i; j++) {
                if (numeros[j] > numeros[j+1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                }
            }
        }
        System.out.println("--------------------------");
    }
```

### **Explicación resumida**

* Hay dos bucles anidados, por eso crece mucho más rápido.
* Comparas cada elemento con todos los demás.

## **2.4 O(log n) – Logarítmica**

### **Archivo:** `ComplejidadLogaritmica`

### **Código del ejemplo**
```java
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
```

### **Explicación resumida**

* El tamaño del problema se reduce a la mitad en cada paso.
* Muy eficiente.

## **2.4 O(n log n) – N log N**

### **Archivo:** `ComplejidadNLogN`

### **Código del ejemplo**
```java
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
```


### **Explicación resumida**

* Combina:

    * Un proceso de dividir (log n)
    * Con un proceso de recorrer elementos (n)



---



# **Conclusiones**

**POR ESTUDIANTE**: Jose Avecillas 
 
  En conclusion la complejidad nos da a ver como puede variar la eficiencia de cada metodo y que mientras mas aumenta mas consumira mi metodo para funcionar, buscando siempre una medida entre lo funcional y cuanto consumira el metodo.

 **POR ESTUDIANTE**:  Antonio Carvelli 
 
  La teoría de la complejidad es la forma que se usa para evaluar que tan eficientemente un programa resuelve los problemas, no es solo hacer que un programa funcione, sino garantizar que funcione de manera eficiente y escalable cuando el volumen de datos es demasiado grande. 
 
 Todo esto gracias a la Notación Big O para predecir la tasa de crecimiento del algoritmo y el Análisis Experimental que mide el tiempo real en una máquina específica.


---
