class G
{
    int i; // insitlised Non-static vriable
    // non-static variable is declared without using of 'static' keyword
    public static void main(String[] args)
    {
        G g1 = new G();
        // here 'G g1' is non-permitive Data type
        // new 'G();' is an instance/object for declaring the memory allocation in memory
        g1.i=10;
        // 'gi.i' here 'gi' is class reference variable which is use to call
        // specific memory location of 'i' in memory
        G g2 = new G();
        g2.i=20;
        // here 'G g2' create new memory allocation for 'i' and having address in g2 

        G g3 = new G();
        g3.i=30;
        // here 'G g3' create new memory allocation for 'i' and having address in g3 

        System.out.println(g1.i);
        System.out.println(g2.i);
        System.out.println(g3.i);

        //we can create multiple copy of non-static variable by assigning new instace/object
        


    }
}