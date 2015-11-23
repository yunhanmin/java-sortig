/*
 * Project: RunSorts.java
 * Description: Running various sorting methods on the same array
 * Name: Hanmin Yun
 * Date: Nov 17, 2015
 */

public class RunSorts {
 
  public static void main( String[] args ) {
    
    // Bubble Sort
    BubblesSort b = new BubblesSort();
    System.out.println( "Unstorted: " + b );
    b.sort();
    System.out.println( "Sorted: " + b + "\n" );
    
    // Selection Sort
   SelectionSort s = new SelectionSort();
    System.out.println( "Unstorted: " + s );
    s.sort();
    System.out.println( "Sorted: " + s + "\n" );
    // Insertion Sort
    InserstionSort i = new InserstionSort();
    System.out.println( "Unstorted: " + i );
    i.sort();
    System.out.println( "Sorted: " + i + "\n" );
    // Quick Sort
    QuickSort q = new QuickSort();
    System.out.println( "Unstorted: " + q );
    q.sort();
    System.out.println( "Sorted: " + q + "\n" );
    // Merge Sort
    MergeSort m = new MergeSort();
    System.out.println( "Unstorted: " + m );
    m.sort();
    System.out.println( "Sorted: " + m + "\n" );
    // Radix Sort???
    
  } // END main method
  
} // END RunSorts