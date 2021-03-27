class C_A
{
    public static void main(String[] args)
    {
        for(int i=1; i<=5; i++)
        {
          for(int j=6-i; j>=1; j--)
          {
            System.out.print("*");
          }  
          System.out.println();
        }
    }
} 
class C_B
{
    public static void main(String[] args)
    {
        for(int i=1; i<=5; i++)
        {
          for(int j=i; j<=5; j++)
          {
              System.out.print("*");
          }  
          System.out.println();
        }
    }
} 
class C_C
{
    public static void main(String[] args)
    {
        for(int i=1; i<=5; i++)
        {
          for(int j=5; j>=i; j--)
          {
              System.out.print("*");
          }  
          System.out.println();
        }
    }
} 