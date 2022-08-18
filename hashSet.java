import java.util.*;
class hashSet
  {
    public static void main(String ar[])
    {
    HashSet<String> School = new HashSet<String>();
    //check the hashset is empty
    System.out.println("IsEmpty()=+"+School.isEmpty());
//adding elements to the hashset
    School.add("LPU");
    School.add("PACE");
//check again is empty
    if(School.isEmpty())
      System.out.println("Is still empty");
      //checking the size of the hashset
    else 
       System.out.println("Size of the hashset="+School.size());
//to remove an element
    School.remove("PACE");
//to check contains
    System.out.println(School.contains("PACE"));
System.out.println(School.size());
//to clear all the elements in the hashset
    School.clear();
    System.out.println(School.size());
    School.add("LPU");
      School.add("MPS");
      School.add("RISE");
      School.add("QIS");
      System.out.println(School);
     /* for(String n: School)
        {
          String newValue= "Welcome to "+n;
          System.out.println(newValue);
        }*/
      System.out.println();
      System.out.println();
      System.out.println();

     Iterator<String> newValue =School.iterator();
      while(newValue.hasNext() )
        {
          String n=newValue.next();
          String NEW="Welcome"+ newValue;
          System.out.println(NEW);
          
        }
//linkedlists
        LinkedList <String> list= new LinkedList<String>();
      list.add("Dheeraj");
      list.add("Chandu");
      list.add("sai");
      list.add(2, "Koppolu");
      System.out.println(list);
      System.out.println(list.element());
      System.out.println(list.get(1));
      System.out.println(list.getFirst());
System.out.println(list.indexOf("sai"));
      

      
}

    

  }