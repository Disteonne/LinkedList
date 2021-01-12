public interface Tests {

     void clearTemps();
     long addOrRemoveAllElementsTime(int size,String operation) throws Exception;
     long insertOrRemoveOneEl(int index, String element, String operation) throws Exception;

     default void check(String operation) throws Exception{
          if (operation.equals("+") || operation.equals("-")){
               return;
          }
          else  {
               throw new Exception("Operation may be '+' or '-'.");
          }
     }
}
