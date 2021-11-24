package Aula09;

import java.util.Comparator;

public class QuickSort<T> {

    public boolean quickSort(T[] vector, Comparator<T> comparator) {
        if (vector == null || comparator == null) {
            return false;
        }
        int initial = 0;
        int end = vector.length - 1;
        return quickSort(vector, comparator, initial, end);
    }

    private boolean quickSort(T[] vector, Comparator<T> comparator, int initial, int end) {
        if (initial < end) {
            int pivotPosition = breakApart(vector, comparator, initial, end);
            quickSort(vector, comparator, initial, pivotPosition - 1);
            quickSort(vector, comparator, pivotPosition + 1, end);
        }

        return true;
    }

    private int breakApart(T[] vector, Comparator<T> comparator, int initial, int end) {
        T pivot = vector[initial];
        int i = initial + 1, e = end;

        while (i <= e) {
            if (comparator.compare(vector[i], pivot) >= 0) {
                i++;
            } else if (comparator.compare(pivot, vector[e]) > 0) {
                e--;
            } else {
                T change = vector[i];
                vector[i] = vector[e];
                vector[e] = change;
                i++;
                e--;
            }
        }

        vector[initial] = vector[e];
        vector[e] = pivot;
        return e;
    }
}

