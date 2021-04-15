class Printing_Num_1_to_10
{
    static void display(int n)
    {
        if(n>10) return;
        System.out.print(n+",");
        display(n+1);
    }
    public static void main(String[] args)
    {
        display(1);
    }
}