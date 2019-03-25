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



