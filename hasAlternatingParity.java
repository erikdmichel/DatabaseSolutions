//Write a static method hasAlternatingParity that returns whether 
//or not an array of integers has alternating parity (true if it does
//, false otherwise). The parity of an integer is 0 for even numbers 
//and 1 for odd numbers.

public class hasAlternatingParity  {
   public static boolean hasAlternatingParity(int[] data) {
      for (int i = 0; i < data.length - 2; i++) {
         if (data[i] % 2 + data[i+1] % 2 != 1) {
            return false;
         }
      }
      return true;
   }
}



