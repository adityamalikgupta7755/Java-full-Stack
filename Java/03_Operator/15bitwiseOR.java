class P
{
    public static void main(String[] args)
    {
        int a=5;
        int b=6;
        System.out.println(a++>5 | ++b>6);
        System.out.println(a);
        System.out.println(b);
        // bitwise OR if exp1 is false then it will go to excute exp2 then decided the result
    }
}