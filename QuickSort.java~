// QuickSort.java

public class QuickSort extends Sorts {
  
  // instance variables
  private int[] quick = new int[12];
  private String name;
  private int left;
  private int right;
  private int count;
  // constructor
  public QuickSort() {
    quick = super.array;
    name = "quick";
    left = 0;
    right = quick.length-1;
  }
  
  
  // methods
  public void sort() {
   
  }
  
  public void sort( int left, int right ) {
    
    if( left >= right ) return;
    
    int k = left;
    int j = right;
    int pivot = quick[ (left + right) / 2 ];
    
    while ( k < j ) {
      while ( quick[k] < pivot ) {
        k++;
      }
      while ( pivot < quick[j]) {
       j--; 
      }
      if ( k <= j ) {
        System.out.print( "Step #" + count + " " );
        printArray();
        
        swap( k,j );
        k++;
        j--;
        
        count++;
        
      }
     sort( left, j );
     sort( k, right );
    }
  } // END sort()
  
  
} // END Quick Sort