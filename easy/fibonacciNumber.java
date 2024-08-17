package easy;

class fibonacciNumber{
public static void main(String args[])
{  
 int n1=0, n2=1, n3, i, count=10;  
  System.out.print( n1+ " "+n2); //print 0 1
  for(i=2; i<count; i++) // count 2 to 10
    {
      n3=n1+n2;
      System.out.print(" "+n3); 
      n1=n2;
      n2=n3;
    }  

}}




