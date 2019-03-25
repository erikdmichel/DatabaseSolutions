public class switchPairs  {
   public static void switchPairs(ArrayList<String> list) {
      for (int i = 0; i < list.size() - 1; i+=2) {
         String first = list.get(i);
         list.set(i, list.get(i + 1));
         list.set(i + 1, first); 
      }
      System.out.print(list);
   }   
}



