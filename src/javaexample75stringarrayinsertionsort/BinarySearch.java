package javaexample75stringarrayinsertionsort;

public class BinarySearch {

    public static int Search(String[] serie, String item) {
        return Searching(serie, item);
    }

    private static int Searching(String[] serie, String item) {

        int result;

        int firstIndex = 0;
        int lastIndex = serie.length - 1;
        int middle;

        while (firstIndex <= lastIndex) {
            middle = (firstIndex + lastIndex) / 2;
            result = item.compareTo(serie[middle]);

            if (result == 0) {
                return middle;
            } else if (result < 0) {
                lastIndex = middle - 1;
            } else {
                firstIndex = middle + 1;
            }
        }// end while

        return -1;
    }
    
}
