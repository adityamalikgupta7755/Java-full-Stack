class WorkingofReturn
{
    public static void main(String[] args)
    {
        System.out.println("main starts");
        m1();
        System.out.println("main starts");
    }
    static void m1()
    {
        System.out.println("m1 starts");
        for(int i=1; i<=20; i++){
            if(i==3) return; // here if condition going to be true the m1 handover 
                             // controle to main method
        }
        System.out.println("m1 ends");
    }
}