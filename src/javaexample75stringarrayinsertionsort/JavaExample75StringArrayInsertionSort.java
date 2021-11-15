
package javaexample75stringarrayinsertionsort;


public class JavaExample75StringArrayInsertionSort {

    
    public static void main(String[] args) {
        
        String[] array=new String[] {"tom", "jan", "violet", "aaron", "maud",
            "han", "bode", "nile", "wikie", "tamara", "celie"};
        
        StringArrayHelper.PrintArray(array);
        
        System.out.println("The min is: "+StringArrayHelper.Min(array));
        
        System.out.println("Sorting....");
        StringArrayHelper.Sort(array);
        
        StringArrayHelper.PrintArray(array);
        
        String str1 = "bode";
        System.out.println("The item ("+ str1 +") has index: "+StringArrayHelper.LinearSearch(array, str1));
        
        String str2 = "bbbbbbb";
        System.out.println("The item ("+ str2 +") has index: "+StringArrayHelper.LinearSearch(array, str2));
        
        System.out.println();
        System.out.println("Binary search....");
        
        String str3 = "celie";
        System.out.println("The item ("+ str3 +") has index: "+BinarySearch.Search(array, str3));
        
        String str4 = "cccc";
        System.out.println("The item ("+ str4 +") has index: "+BinarySearch.Search(array, str4));
        
        
    }
    
}
