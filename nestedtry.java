class nestedtry
  {
    public static void main(String ar[])
    {
      int a=4, b[]={5,8};
      try
        {
        System.out.println(a/0);
        try
          {
            System.out.println(b[4]);
          }
          
        }
          catch (Exception d)
          {
            System.out.println(d);
          }
                    
        
        
        
      }
   }
  