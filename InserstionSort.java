// InsertionSort.java

public class InserstionSort extends Sorts {
  
  // instance variables
  private int[] insertion = new int[12];
  private String name;
  
  // constructor
  public InserstionSort() {
   insertion = super.array;
   name = "Insertion";
  }
  // methods
  public void sort() {
    // Timing: BEST = 0(n) = ABE/WORST = 0(n^2)
    
    System.out.println( "Doing " + name + " Sort: " );
    
    int itemToInsert, j;
    int count = 1;
    boolean keepLooping;
    // On nth pass, insert item n into correct position
    
    for( int n = 1; n < insertion.length; n++ ) {
      
      // Go backwards through the list, look for the slot to insert n
      itemToInsert = insertion[n];
      j = n-1;
      keepLooping = true;
      
      while( (j>=0) && keepLooping ) {
        
        System.out.print( "Step #" + count + " " );
        printArray();
        
        if( itemToInsert < insertion[j] ) {
         insertion[j+1] = insertion[j];
         j--;
         if ( j == -1 ) //  special case for inserting itme at [0]
           insertion[0] = itemToInsert;
        } else {
          keepLooping = false;
          insertion[j+1] = itemToInsert;
        }
        
        count++;
        
      }
      
    }
    
  }
} // END InserstionSort