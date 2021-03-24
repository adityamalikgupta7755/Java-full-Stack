
class SingleLineStatement
{
    public static void main(String[] args)
    {
        int a = 5;
        if(a%2==0)
        ++a; // in if else condintion without curlebreacses take only first line and rsst are out of if
        ++a;
        ++a;
        System.out.println(a);
    }
}