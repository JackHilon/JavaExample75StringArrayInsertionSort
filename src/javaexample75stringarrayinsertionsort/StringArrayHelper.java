package javaexample75stringarrayinsertionsort;

/**
 *
 * @author marka
 */
public class StringArrayHelper {

    public static void PrintArray(String[] serie) {
        Print(serie);
    }

    public static String Min(String[] serie) {
        return MinItem(serie);
    }

    public static void Sort(String[] serie) {
        Sort1(serie);
    }
    
    public static int LinearSearch(String[] serie, String item) {
        return LinearSearching(serie, item);
    }
    
    
    // ---- Insertion sort private part ----------------------------------------
    private static void Sort1(String[] serie) {
        for (int endPos = 1; endPos < serie.length; endPos++) {
            Insert(serie, endPos);
        }
    }

    private static void Insert(String[] serie, int end) {
        int best = BestIndex(serie, end);
        if (best != (end - 1)) {
            ShiftRightWithOne(serie, best + 1, end);
        }
    }

    private static int BestIndex(String[] serie, int CompareIndex) {
        int result;
        for (int i = CompareIndex - 1; i >= 0; i--) {
            result = serie[CompareIndex].compareTo(serie[i]);
            if (result >= 0) {
                return i;
            }
        }
        return -1;
    }

    private static void ShiftRightWithOne(String[] serie, int startIndx, int endIndx) {
        String temp = serie[endIndx];
        for (int i = endIndx; i > startIndx; i--) {
            serie[i] = serie[i - 1];
        }
        serie[startIndx] = temp;
    }

    // ---- Linear search private part -----------------------------------------
    
    private static int LinearSearching(String[] serie, String item) {
        
        int pos=0;
        boolean found= false;
        int result=-1;
        
        while(pos<serie.length && !found)
        {
            // if(item.equalsIgnoreCase(serie[pos]))
            // ignoring letters case
            if(item.equals(serie[pos])) 
            {
                found = true;
                result=pos;
                continue;
            }
            pos++;
        }
        return result;
    }
    
    // ---- private part -------------------------------------------------------
    private static String MinItem(String[] serie) {
        String m = serie[0];
        int temp;
        for (int i = 1; i < serie.length; i++) {
            temp = m.compareTo(serie[i]);
            if (temp > 0) {
                m = serie[i];
            }
        }
        return m;
    }

    private static void Print(String[] serie) {
        System.out.print("Array is: ");
        for (int i = 0; i < serie.length; i++) {
            System.out.print(serie[i] + " ");
        }
        System.out.println();
    }

}
