class Number 
{
    int n;// Obiect dataMember

    boolean isEven() //Object behaviour
    {
        if(n%2==0) return true;
        return false;
    }
     boolean isPrime() //Object behaviour
    {
        if(n<2) return false;
        for(int i=2; i<=n/2; i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
class Test
{
    public static void main (String[] args)
    {
        Number n1 =new Number();
        n1.n=10;
        System.out.println(n1.isEven());
        System.out.println(n1.isPrime());

        Number n2 =new Number();
        n2.n=11;
        System.out.println(n2.isEven());
        System.out.println(n2.isPrime());
    }
}