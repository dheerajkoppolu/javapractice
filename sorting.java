class sorting
  {
    public static void main(String arr[])
    {
      int num[]= {54,66,37,18,10,12,56};
      for(int i=0; i<num.length-1;i++)
        {
          for(int j=i+1; j<num.length-1;j++)
            {
              if(num[i]> num[j])
              {
                int temp=num[i];
                num[i]=num[j];
                num[j]=temp;
                
              }
              
                
            }
          System.out.print(num[j]);
        }
    }
  }