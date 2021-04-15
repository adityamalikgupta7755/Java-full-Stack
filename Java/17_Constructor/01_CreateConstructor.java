class CreatConstructor
{
    // it is also know as default constructor when it is not written 
    // then java compiler implictly add it 
    CreatConstructor() // creating constructor
    {
        System.out.println("excuting Constructor");
    }
}
class Test
{
    public static void main(String[] args)
    {
        new CreatConstructor();
        new CreatConstructor();
    }
}