 class A 
 {
     int i;

     A()
     {
         i = 5;
         System.out.println("A Constructor excute");
     }
 }

 class B extends A 
 {
     int j;
     B()
     {
         j = 10;
         System.out.println("B Constructor excute");
     }
 }

 class Test 
 {
     public static void main(String[] args)
     {
         B b1 = new B();

         System.out.println(b1.i);
         System.out.println(b1.j);
     }
 }