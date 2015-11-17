// Sorts. java

public class Sorts {
  
  // instance variables
  int[] array = new int[12];
  
  // constructor
  public Sorts() {
    array = new int[]{ 76, 71, 63, 65, 66, 64, 70, 69, 68, 67, 72};
  }
  
  
  // methods
  public String toString() {
  
    String result;
    
    result = "{ ";
    for( int i = 0; i < array.length-1; i++ ) {
      result = result + array[i] + ", ";
    }
    result = result + array[array.length-1] + "} ";
    
    return result;
  }
  
    
    public void swap( int firstIndex, int secondIndex ) {
     
      int temp = array[firstIndex];
      array[firstIndex] = array[secondIndex];
      array[secondIndex] = temp;
      
    
  } // END swap()
  
  
} // END Sorts