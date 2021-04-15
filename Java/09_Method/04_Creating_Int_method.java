class Creat_int_method
{
    public static void main(String[] args){
        System.out.println("main starts");
        m1(); // here m1 excute and returing value but we can't store it
        int i=m1();
        System.out.println("i = "+i);
        int j= m1()*3;
        System.out.println("j = "+j);
        System.out.println("main ends");
    }
    static int m1()
    {
        System.out.println("m1 excute");
        return 5; //if we didn't any return value in int method 
        // it will give compile time error 
        // return is must with some value of type int only
    }
}