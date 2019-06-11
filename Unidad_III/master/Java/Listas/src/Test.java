import java.io.*; 
  import java.util.*; 
  
  class Test { 
      public static void main(String[] args) 
      { 
          //Crear lista
          ArrayList<Integer> list = new ArrayList<Integer>(); 
  
          list.add(1); 
          list.add(2); 
          list.add(3); 
          list.add(0, 9); 
          System.out.println(list);
      }
  }
