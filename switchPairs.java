//Write a static method switchPairs that switches the order of values in an 
//ArrayList of Strings in a pairwise fashion. Your method should switch the 
//order of the first two values, then switch the order of the next two, switch 
//the order of the next two, and so on.

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



