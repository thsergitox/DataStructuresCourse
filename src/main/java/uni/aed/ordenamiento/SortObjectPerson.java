package uni.aed.ordenamiento;

import uni.aed.model.Persona;

public class SortObjectPerson {
    public Persona[] Burbuja(Persona[] array, int attribute) {
        if (!(attribute == Persona.NAME || attribute == Persona.AGE))
            throw new IllegalArgumentException();
  
        array[0].setCompareAttribute(attribute);

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    Persona aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
        return array;
    }

    
    //HEAP SORT
    public Persona[] HeapSort(Persona[] array, int attribute) {
        if (!(attribute == Persona.NAME || attribute == Persona.AGE))
            throw new IllegalArgumentException();
        
        int n = array.length;

        // Construir montículo
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i, attribute);

        // Extraer elementos del montículo uno por uno
        for (int i = n - 1; i > 0; i--) {
            // Mover el elemento actual al principio
            Persona temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Llamar a heapify para reducir el montículo
            heapify(array, i, 0, attribute);
        }

        return array;
    }

    private void heapify(Persona[] array, int n, int i, int attribute) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        array[0].setCompareAttribute(attribute);

        // Si el hijo izquierdo es más grande que la raíz
        if (left < n && array[left].compareTo(array[largest]) > 0)
            largest = left;

        // Si el hijo derecho es más grande que el más grande hasta ahora
        if (right < n && array[right].compareTo(array[largest]) > 0)
            largest = right;

        // Si el más grande no es la raíz
        if (largest != i) {
            Persona swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            // Recursivamente heapify la subárbol afectado
            heapify(array, n, largest, attribute);
        }
    }
      
    //QUICK SORT
    public Persona[] quickSort(Persona[] array, int attribute) {
        if (!(attribute == Persona.NAME || attribute == Persona.AGE))
            throw new IllegalArgumentException();
        
        array[0].setCompareAttribute(attribute);
        quickSortHelper(array, 0, array.length - 1, attribute);
        return array;
    }

    private void quickSortHelper(Persona[] array, int low, int high, int attribute) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSortHelper(array, low, pivotIndex - 1, attribute);
            quickSortHelper(array, pivotIndex + 1, high, attribute);
        }
    }

    private int partition(Persona[] array, int low, int high) {
        Persona pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j].compareTo(pivot) < 0) {
                i++;

                Persona temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        Persona temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
    
    //MERGESORT
    public Persona[] mergeSort(Persona[] array, int attribute) {
        if (!(attribute == Persona.NAME || attribute == Persona.AGE))
            throw new IllegalArgumentException();
        
        array[0].setCompareAttribute(attribute);
        mergeSortHelper(array, 0, array.length - 1, attribute);
        return array;
    }

    private void mergeSortHelper(Persona[] array, int left, int right, int attribute) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSortHelper(array, left, mid, attribute);
            mergeSortHelper(array, mid + 1, right, attribute);
            merge(array, left, mid, right, attribute);
        }
    }

    private void merge(Persona[] array, int left, int mid, int right, int attribute) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Persona[] L = new Persona[n1];
        Persona[] R = new Persona[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = array[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = array[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }
    
}//end clase
