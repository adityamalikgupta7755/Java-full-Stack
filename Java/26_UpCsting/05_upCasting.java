class J 
{
    int i = 1;
}
class K extends J 
{
    int i = 2;
}
class L extends J 
{
    int i = 3;
}
class Test4
{
    public static void main (String[] args)
    {
        J j1 = new J();
        System.out.println(j1.i);
         j1 = new K();
        System.out.println(j1.i);
         j1 = new L();
        System.out.println(j1.i);
    }
}
