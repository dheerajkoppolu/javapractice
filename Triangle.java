class Triangle
  {
  int a,b,c;
  Triangle()
    {
    a=3;
    b=4;
    c=5;
    }
  double area()
    {
     double p=(a+b+c)/2;
    return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    double perimeter()
    {
      double  p=a+b+c;
      return p;
    }
  public static void main(String args[])
    {
    Triangle obj=new Triangle();
    System.out.println(obj.area());
      System.out.println(obj.perimeter());
    }
}
